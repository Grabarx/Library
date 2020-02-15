public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String isbn;

    Book( String bookTitle, String bookAuthor, int bookReleaseDate,
            int bookPages, String bookIsbn){
         title = bookTitle;
         author = bookAuthor;
         releaseDate = bookReleaseDate;
         pages = bookPages;
         isbn = bookIsbn;
    }


    public void printBookInfo() {
        String info = title + "; " + author + " ;" + releaseDate + " ;" + pages + " ;" + isbn;
        System.out.println(info);
    }
}
