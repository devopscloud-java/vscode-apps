public class Main1 {
    public static void main(String[] args) {
        System.out.println("This is a Library class.");
        Library library = new Library();
        library.search("978-3-16-148410-0");    
        library.search("The Great Gatsby", "F. Scott Fitzgerald");
}
}
class Library {
    public void search(String isbn) {
        System.out.println("Welcome to the library.");
    }
    public void search(String title, String author) {
        System.out.println("Searching for book: " + title + " by " + author);
    }
}
