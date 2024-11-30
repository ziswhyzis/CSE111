public class Reader {
    public String name;
    public int capacity;
    public int count = 0;
    public String[] book;

    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        book = new String[capacity];
        return "A new reader is created!";
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        if (count == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Book " + (i + 1) + ": " + book[i]);
            }
        }
    }

    public void addBook(String bookName) {
        if (count < capacity) {
            book[count] = bookName;
            count++;
        } else {
            System.out.println("No more capacity");
        }
    }
}