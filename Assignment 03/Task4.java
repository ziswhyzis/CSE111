public class Library {
    public int capacity = 0;
    public String books = "";
    public int count = 0;

    public void setBookCapacity(int c) {
        capacity = c;
    }

    public void addBook(String add) {
        if (count >= capacity) {
            System.out.println("Maximum capacity exceeds. You can't add more than" + capacity + "  books");
        } else {
            System.out.println("Book '" + add + "' added to the library.");
            books += add + "\n";
            count++;
        }
    }

    public void printDetail() {
        System.out.println("Maximum capacity: " + capacity);
        System.out.println("Total Books: " + count);
        System.out.println("Book list:");
        System.out.println(books);
    }
}