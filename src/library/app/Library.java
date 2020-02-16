package library.app;

import library.model.Book;

public class Library {
    public static void main(String[] args) {

        final String appName = "library.app.Library 0.5";

        Book book1= new Book("Pan Lodowego Ogrodu tom. 1", "Jarosław Grzędowicz", 2007, 560, "65342834" );
        Book book2= new Book("Pan Lodowego Ogrodu tom. 2", "Jarosław Grzędowicz", 2009, 660);
        Book book3= new Book("Pan Lodowego Ogrodu tom. 3", "Jarosław Grzędowicz", 2011, 770, "65388884" );

        System.out.println(appName);
        System.out.println("Books available in the library:");

        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();
    }
}
