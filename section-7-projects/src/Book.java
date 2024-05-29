public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    } // end ctor

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printBookDetails() {
        System.out.println("Title is " + title);
        System.out.println("Author is " + author);
        System.out.println("The genre is " + genre + " and has " + numPages + " pages.");
        System.out.println();
    }
} // end Book class
