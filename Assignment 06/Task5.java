public class Borrower {
    public static int book_count[] = { 3, 3, 3 };
    public static String book_name[] = { "Pather Panchali", "Durgesh Nandini", "Anandmath" };

    public String borrower;

    public Borrower(String borrower) {
        this.borrower = borrower;
    }

    public void borrowBook(String book) {
        for (int i = 0; i < 3; i++) {
            if (book_name[i].equals(book)) {
                if (book_count[i] > 0) {
                    book_count[i]--;
                    return;
                } else {
                    System.out.println("This book is not available.");
                    return;
                }
            }
        }
    }

    public void borrowerDetails() {
        System.out.println("Name: " + borrower);
        System.out.println("Books Borrowed:");
        for (int i = 0; i < 3; i++) {
            if (book_count[i] < 3) {
                System.out.println(book_name[i]);
            }
        }
    }

    public static int remainingBooks(String book) {
        for (int i = 0; i < 3; i++) {
            if (book_name[i].equals(book)) {
                return book_count[i];
            }
        }
        return 0;
    }

    public static void bookStatus() {
        System.out.println("Available Books:");
        for (int i = 0; i < 3; i++) {
            System.out.println(book_name[i] + " : " + book_count[i]);
        }
    }
}