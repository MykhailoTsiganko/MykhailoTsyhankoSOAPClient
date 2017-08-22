
package com.epam.lab.soap.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.soap.web package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExchangeBook_QNAME = new QName("http://web.soap.lab.epam.com/", "exchangeBook");
    private final static QName _ExchangeBookResponse_QNAME = new QName("http://web.soap.lab.epam.com/", "exchangeBookResponse");
    private final static QName _GetAllBooks_QNAME = new QName("http://web.soap.lab.epam.com/", "getAllBooks");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://web.soap.lab.epam.com/", "getAllBooksResponse");
    private final static QName _GetAuthorBooks_QNAME = new QName("http://web.soap.lab.epam.com/", "getAuthorBooks");
    private final static QName _GetAuthorBooksResponse_QNAME = new QName("http://web.soap.lab.epam.com/", "getAuthorBooksResponse");
    private final static QName _GetBook_QNAME = new QName("http://web.soap.lab.epam.com/", "getBook");
    private final static QName _GetBookResponse_QNAME = new QName("http://web.soap.lab.epam.com/", "getBookResponse");
    private final static QName _TurnBackBook_QNAME = new QName("http://web.soap.lab.epam.com/", "turnBackBook");
    private final static QName _TurnBackBookResponse_QNAME = new QName("http://web.soap.lab.epam.com/", "turnBackBookResponse");
    private final static QName _LibraryFault_QNAME = new QName("http://web.soap.lab.epam.com/", "LibraryFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.soap.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExchangeBook }
     * 
     */
    public ExchangeBook createExchangeBook() {
        return new ExchangeBook();
    }

    /**
     * Create an instance of {@link ExchangeBookResponse }
     * 
     */
    public ExchangeBookResponse createExchangeBookResponse() {
        return new ExchangeBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetAuthorBooks }
     * 
     */
    public GetAuthorBooks createGetAuthorBooks() {
        return new GetAuthorBooks();
    }

    /**
     * Create an instance of {@link GetAuthorBooksResponse }
     * 
     */
    public GetAuthorBooksResponse createGetAuthorBooksResponse() {
        return new GetAuthorBooksResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link TurnBackBook }
     * 
     */
    public TurnBackBook createTurnBackBook() {
        return new TurnBackBook();
    }

    /**
     * Create an instance of {@link TurnBackBookResponse }
     * 
     */
    public TurnBackBookResponse createTurnBackBookResponse() {
        return new TurnBackBookResponse();
    }

    /**
     * Create an instance of {@link LibraryFault }
     * 
     */
    public LibraryFault createLibraryFault() {
        return new LibraryFault();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link ServiceFaultInfo }
     * 
     */
    public ServiceFaultInfo createServiceFaultInfo() {
        return new ServiceFaultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "exchangeBook")
    public JAXBElement<ExchangeBook> createExchangeBook(ExchangeBook value) {
        return new JAXBElement<ExchangeBook>(_ExchangeBook_QNAME, ExchangeBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "exchangeBookResponse")
    public JAXBElement<ExchangeBookResponse> createExchangeBookResponse(ExchangeBookResponse value) {
        return new JAXBElement<ExchangeBookResponse>(_ExchangeBookResponse_QNAME, ExchangeBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getAuthorBooks")
    public JAXBElement<GetAuthorBooks> createGetAuthorBooks(GetAuthorBooks value) {
        return new JAXBElement<GetAuthorBooks>(_GetAuthorBooks_QNAME, GetAuthorBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getAuthorBooksResponse")
    public JAXBElement<GetAuthorBooksResponse> createGetAuthorBooksResponse(GetAuthorBooksResponse value) {
        return new JAXBElement<GetAuthorBooksResponse>(_GetAuthorBooksResponse_QNAME, GetAuthorBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnBackBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "turnBackBook")
    public JAXBElement<TurnBackBook> createTurnBackBook(TurnBackBook value) {
        return new JAXBElement<TurnBackBook>(_TurnBackBook_QNAME, TurnBackBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnBackBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "turnBackBookResponse")
    public JAXBElement<TurnBackBookResponse> createTurnBackBookResponse(TurnBackBookResponse value) {
        return new JAXBElement<TurnBackBookResponse>(_TurnBackBookResponse_QNAME, TurnBackBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.lab.epam.com/", name = "LibraryFault")
    public JAXBElement<LibraryFault> createLibraryFault(LibraryFault value) {
        return new JAXBElement<LibraryFault>(_LibraryFault_QNAME, LibraryFault.class, null, value);
    }

}
