public class BookDemo {
    public static void main(String[] args) {
        Book bookOne = new Book ("D Whatford", "Hammer House", "Horror", 500);
        Book bookTwo = new Book ("Jules", "Girly Book", "Romance", 1000);

        System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.println();

//        printBookDetails(bookOne); // this is one option
//        printBookDetails(bookTwo);

        bookOne.printBookDetails(); // this is a second option.
        bookTwo.printBookDetails();

    } // end main method

//    public static void printBookDetails(Book book) { //this is one option
//        System.out.println("Title is " + book.getTitle());
//        System.out.println("Author is " + book.getAuthor());
//        System.out.println("The genre is " + book.getGenre() + " and has " + book.getNumPages() + " pages.");
//        System.out.println();
//    } //end printBookDetails method

} // end BookDemo class
