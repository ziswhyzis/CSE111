public class Cargo {
    static double capacity = 10.0;
    static int count = 0;

    String contents;
    double weight;
    int ID;
    boolean isloaded = false;

    public Cargo(String contents, double weight) {
        this.contents = contents;
        this.weight = weight;
        ID = count + 1;
        count++;
    }

    public void details() {
        System.out.println(
                "Cargo ID: " + ID + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + isloaded);
    }

    public void load() {
        if (weight <= capacity) {
            capacity -= weight;
            isloaded = true;
            System.out.println("Cargo " + ID + " loaded for transport.");
        } else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload() {
        capacity += weight;
        isloaded = false;
        System.out.println("Cargo " + ID + " unloaded.");
        System.out.println("Cargo Capacity: " + capacity);
    }

    public static double capacity() {
        return capacity;
    }
}