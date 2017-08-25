package com.epam.lab.web.rest;

import com.epam.lab.web.LibraryService;

import com.epam.lab.web.soap.Book;
import com.epam.lab.web.soap.LibraryFault;
import com.epam.lab.web.soap.ServiceException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

public class LibraryRESTServiceClient implements LibraryService{

    public static final String BASE_ADDRESS = "http://localhost:8080/MykhailoTsyhankoLibraryService/libraryREST";
    public static final String GET_ALL_BOOK_PATH = "/books";

    private ClientConfig clientConfig;
    private Client client;

    public LibraryRESTServiceClient() {
        clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
    }

    @Override
    public List<Book> getAllBooks() {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + GET_ALL_BOOK_PATH);
        List<Book> list = null;

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8")
                .get(ClientResponse.class);

        String booksJson = response.getEntity(String.class);

        try {
            list = mapper.readValue(booksJson, new TypeReference<List<Book>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
    @Override
    public Book getBook(String name) throws ServiceException {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + "/book/" + name);

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw buildException(response,mapper);
        }

        Book book = null;
        String jsonBook = response.getEntity(String.class);
        try {
            book = mapper.readValue(jsonBook, Book.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return book;
    }

    public boolean addBook(Book book) throws ServiceException {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + "/book");

        ClientResponse response = null;
        try {
            response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                    .post(ClientResponse.class, mapper.writeValueAsString(book));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.getStatus() != 200) {
            throw buildException(response,mapper);
        }
        return true;

    }

    public boolean removeBook(String name) throws ServiceException {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + "/book");

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                .delete(ClientResponse.class, name);

        if (response.getStatus() != 200) {
            throw buildException(response,mapper);
        }
        return true;
    }


   public  Book exchangeBook(Book book, String requiredBookName) throws ServiceException {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + "/exchange/" + requiredBookName);
        Book requiredBook = null;

        ClientResponse response = null;

        try {
            response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                    .post(ClientResponse.class, mapper.writeValueAsString(book));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.getStatus() != 200) {
            throw buildException(response,mapper);
        } else {
            String jsonBook = response.getEntity(String.class);
            try {
                requiredBook = mapper.readValue(jsonBook, Book.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return requiredBook;
    }

    public List<Book> getAuthorBooks(String authorName, int number) throws ServiceException {
        ObjectMapper mapper = new ObjectMapper();
        WebResource webResource = client.resource(BASE_ADDRESS + "/books/authors/" + authorName + "/" + number);

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                .get(ClientResponse.class);

        List<Book> list = null;
        if (response.getStatus() != 200) {
            throw buildException(response,mapper);
        } else {
            String jsonBooks = response.getEntity(String.class);

            try {
                list = mapper.readValue(jsonBooks, new TypeReference<List<Book>>() {
                });
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return list;
    }

    private ServiceException buildException(ClientResponse response,ObjectMapper mapper) throws ServiceException {
        String jsonFaultInfo = response.getEntity(String.class);

        LibraryFault faultInfo = null;
        try {
            faultInfo = mapper.readValue(jsonFaultInfo, LibraryFault.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ServiceException(faultInfo);

    }

}
