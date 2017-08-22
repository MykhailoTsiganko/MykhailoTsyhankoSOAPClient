package com.epam.lab.soap;


import com.epam.lab.soap.web.LibraryService;
import com.epam.lab.soap.web.LibraryServiceImplService;
import com.epam.lab.soap.web.ServiceException;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    public static void main(String []args){
        LibraryServiceImplService serviceFacrory = new LibraryServiceImplService();

        LibraryService service = serviceFacrory.getLibraryServiceImplPort();


        try {
            System.out.println(service.getBook("Марся"));
        } catch (ServiceException e) {
            System.out.println(e.getFaultInfo().getMessage());
            e.printStackTrace();
        }

    }
}
