public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String isbn;

    Book(String title, String author, int releaseDate, int pages) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    Book(String title, String author, int releaseDate, int pages, String isbn) {
       this(title, author, releaseDate, pages);
        this.isbn = isbn;
    }

    public void printBookInfo() {
        String info = title + "; " + author + " ;" + releaseDate + " ;" + pages + " ;" + isbn;
        System.out.println(info);
    }
}
