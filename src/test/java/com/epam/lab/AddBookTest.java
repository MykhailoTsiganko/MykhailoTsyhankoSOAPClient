package com.epam.lab;


//import com.epam.lab.web.fault.Book;
//import com.epam.lab.web.LibraryService;
//import com.epam.lab.web.ServiceFactory;
//import com.epam.lab.web.fault.ServiceException;
//import org.apache.log4j.Logger;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import com.epam.lab.web.LibraryService;
import com.epam.lab.web.ServiceFactory;
import com.epam.lab.web.soap.Book;
import com.epam.lab.web.soap.ServiceException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AddBookTest {
    public Logger LOGGER = Logger.getLogger(AddBookTest.class);
    public static Book book1 = new Book("Sherlock Holms","Konan Doil","detective");
    public static Book book2 = new Book("White","Jeck London","janre2");
    public static Book book3 = new Book("Sherlock Holms","Konan Doil","detective");

    @BeforeMethod
    public void setUp() {

    }

    @Test(alwaysRun = true)
    public void addThreeBookAndDeleteThemWithRestService(){
        LOGGER.info("addThreeBookAndDeleteThemWithRestService test method");
        LibraryService service  = ServiceFactory.getLibraryService(ServiceFactory.REST);
        Assert.assertNotNull(service);
        try {
            service.addBook(book1);
            service.addBook(book2);
        } catch (ServiceException e) {
            e.printStackTrace();
            LOGGER.warn(e.getMessage());
        }


        List<Book> list = service.getAllBooks();
        LOGGER.info(list.toString());
        Assert.assertNotNull(list);
        Assert.assertTrue(list.contains(book1)&&list.contains(book2));

        try {
            service.removeBook(book1.getName());
            service.removeBook(book2.getName());
        } catch (ServiceException e) {
            e.printStackTrace();
            LOGGER.warn(e.getMessage());
        }

    }

    @Test (alwaysRun = true)
    public void addThreeBookAndDeleteThemWithSoapService(){
        LOGGER.info("addThreeBookAndDeleteThemWithRestService test method");
        LibraryService service  = ServiceFactory.getLibraryService(ServiceFactory.SOAP);
        Assert.assertNotNull(service);
        try {
            service.addBook(book1);
            service.addBook(book2);
        } catch (ServiceException e) {
            e.printStackTrace();
            LOGGER.warn(e.getMessage());
        }

        List<Book> list = service.getAllBooks();
        LOGGER.info(list.toString());
        Assert.assertNotNull(list);
        Assert.assertTrue(list.contains(book1)&&list.contains(book2));

        try {
            service.removeBook(book1.getName());
            service.removeBook(book2.getName());
        } catch (ServiceException e) {
            e.printStackTrace();
            LOGGER.warn(e.getMessage());
        }

    }




}
