public class Library {
    public static void main(String[] args) {

        final String appName = "Library 0.2";

        Book book1= new Book("Pan Lodowego Ogrodu tom. 1", "Jarosław Grzędowicz", 2007, 560, "65342834" );
        Book book2= new Book("Pan Lodowego Ogrodu tom. 2", "Jarosław Grzędowicz", 2009, 660, "45742384" );
        Book book3= new Book("Pan Lodowego Ogrodu tom. 3", "Jarosław Grzędowicz", 2011, 770, "65388884" );

        book1.printBookInfo();
    }
}
