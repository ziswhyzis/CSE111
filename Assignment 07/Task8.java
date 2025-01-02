public class KKTea extends Tea {
    static int totalRegular = 0;
    static int totalFlavored = 0;

    public int weight;
    public int teabags;

    public KKTea(int price, int teabags) {
        super("KK Regular Tea", price);
        this.teabags = teabags;
        this.weight = 2 * teabags;
    }

    public void productDetail() {
        super.productDetail();
        System.out.println("Weight: " + weight + ", Teabags: " + teabags);
    }

    public static void updateSoldStatusRegular(KKTea t) {
        t.status = true;
        totalRegular++;
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + (totalRegular + totalFlavored));
        System.out.println("KK Regular Tea: " + totalRegular);
        if (totalFlavored != 0) {
            System.out.println("KK Flavored Tea: " + totalFlavored);
        }
    }
}

public class KKFlavouredTea extends KKTea {

    public KKFlavouredTea(String name, int price, int teabags) {
        super(price, teabags);
        this.name = "KK " + name + " Tea";
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        t.status = true;
        totalFlavored++;
    }
}