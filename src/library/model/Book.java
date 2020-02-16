package library.model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String isbn;

    public Book(String title, String author, int releaseDate, int pages) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    public Book(String title, String author, int releaseDate, int pages, String isbn) {
       this(title, author, releaseDate, pages);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printBookInfo() {
        String info = title + "; " + author + " ;" + releaseDate + " ;" + pages + " ;" + isbn;
        System.out.println(info);
    }
}