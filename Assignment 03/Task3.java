public class Shelf {
    public int capacity;
    public int book;

    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + book);
    }

    public void addBooks(int b) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (book + b > capacity) {
            System.out.println("Exceeds capacity");
        } else {
            book += b;
            System.out.println(b + " books added to shelf");
        }
    }
}