public class Cart {
    public int cart;
    public String[] item = new String[3];
    public double[] price = new double[3];
    public double discount;
    public int count;

    public void create_cart(int num) {
        cart = num;
    }

    public void addItem(String item, double price) {
        if (count >= 3) {
            System.out.println("You already have 3 items on your cart");
        }
        else {
            this.item[count] = item;
            this.price[count] = price;
            count++;
            System.out.println(item + " added to cart " + cart + ".");
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
    }

    public void addItem(double price, String item) {
        addItem(item, price);
    }

    public void cartDetails() {
        System.out.println("Your cart (c" + cart + ") :");
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            System.out.println(item[i] + " - " + price[i]);
            total += price[i];
        }
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total price: " + (total - (total * discount / 100)));
    }

    public void giveDiscount(int discount) {
        this.discount = discount;
    }
}