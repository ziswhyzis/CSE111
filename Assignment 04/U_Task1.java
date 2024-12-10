public class Parcel {
    public String name;
    public int weight;
    public double fee;

    public Parcel() {

    }

    public Parcel(String name) {
        this.name = name;
    }

    public Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("Updated Weight: " + this.weight);
    }

    public void calcFee(String adderess) {
        if (adderess.equals("Dhanmondi")) {
            fee = (weight * 20) + 50;
        } else {
            fee = (weight * 20);
        }
    }

    public void printDetails() {
        if (name == null) {
            System.out.println("Set name first");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Total Weight: " + weight);
            System.out.println("Total Fee: " + fee);
        }
    }
}