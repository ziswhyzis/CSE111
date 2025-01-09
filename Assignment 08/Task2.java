public class NikeBD {
    static String[] products = { "Jordan", "Cortez", "Kobe" };
    static int[] totalQty = { 0, 0, 0 };
    static int totalSold = 0;
    static int count = 0;

    int[] branchQty = { 0, 0, 0 };
    int branchSold = 0;
    String name;

    NikeBD(String name) {
        this.name = name;
        count++;
    }

    static void status() {
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: " + count);
        System.out.print("Currently Stocked: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(products[i] + ": " + totalQty[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Sold: " + totalSold);
    }

    void details() {
        System.out.println("Nike " + this.name + " outlet:");
        System.out.print("Products Currently Stocked: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(products[i] + ": " + branchQty[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Sold: " + branchSold);
    }

    void restockProducts(String product, int qty) {
        for (int i = 0; i < 3; i++) {
            if (product.equals(products[i])) {
                branchQty[i] += qty;
                totalQty[i] += qty;
                break;
            }
        }
    }

    void restockProducts(String[] product, int[] qty) {
        for (int i = 0; i < 3; i++) {
            if (product[i].equals(products[i])) {
                branchQty[i] += qty[i];
                totalQty[i] += qty[i];
            }
        }
    }

    void productSold(String product, int qty) {
        for (int i = 0; i < 3; i++) {
            if (product.equals(products[i])) {
                branchQty[i] -= qty;
                totalQty[i] -= qty;
                branchSold += qty;
                totalSold += qty;
            }
        }
    }

    void productSold(String product1, int qty1, String product2, int qty2) {
        productSold(product1, qty1);
        productSold(product2, qty2);
    }
}