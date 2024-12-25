public class Book {
    static int total_books_sold = 0;
    static double total_revenue = 0;

    String title;
    double price;

    public Book(String title, double discount) {
        this.title = title;
        this.price = 150;
        this.price -= caclulateDiscount(discount);
        total_books_sold++;
        total_revenue += price;
    }

    public double caclulateDiscount(double discount) {
        return price * discount / 100;
    }

    public void bookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price + " TK");
    }
}