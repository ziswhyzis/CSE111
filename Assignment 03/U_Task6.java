public class Book {
    public String name;
    public String author = "unknown";
    public int page;
    public String genre;

    public void createBook(String name) {
        this.name = name;
    }

    public void createBook(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void createBook(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public void customizeGenre(String genre) {
        this.genre = genre;
        System.out.println("Updated genre of \"" + name + "\" to " + genre + ".");
    }

    public void customizePages(int page) {
        this.page = page;
        System.out.println("Updated pagers of \"" + name + "\" to " + page + " pages.");
    }

    public void displayDetails() {
        System.out.println("Title: " + name + ", Author: " + author + ", Genre :" + genre + ", Page: " + page);
    }
}