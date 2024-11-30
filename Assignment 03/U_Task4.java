public class Customer {
    public String name;
    public int count = 0;
    public String items = "";
    public int total = 0;

    public void createCustomer(String name) {
        this.name = name;
    }

    public void showCart() {
        System.out.println("Customer: " + name);
        System.out.println(items);
    }
    public void addItem(String item, int price) {
        if (count >= 4) {
            System.out.println("Cart is full");
        } else {
            items += "Item: " + item + " Price: " + price + "\n";
            total += price;
            System.out.println(item + " added to cart");
            count++;
        }
    }

    public void addItem(String item1, int price1, String item2, int price2) {
        addItem(item1, price1);
        addItem(item2, price2);
    }

    public void calculatePrice() {
        System.out.println("Total: " + total);
    }
}