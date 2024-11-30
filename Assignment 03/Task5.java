public class TaxiLagbe {
    public String num;
    public String area;
    public int count = 0;
    public String passengers = "";
    public int fare = 0;
    public int capacity = 4;

    public void storeInfo(String n, String a) {
        num = n;
        area = a;
    }

    public void printDetails() {
        System.out.println("Taxi number: " + num);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total passengers: " + count);
        System.out.println("Passenger Lists:");
        if (count > 0) {
            System.out.println(passengers);
        }
        System.out.println("Total collected fare: " + fare + " Taka");
    }

    public void addPassenger(String name, int f) {
        if (count >= capacity) {
            System.out.println("Taxi Full! No more passengers can be added");
        } else {
            passengers += name + " ";
            count++;
            fare += f;
            System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
        }
    }

    public void addPassenger(String n1, int f1, String n2, int f2) {
        addPassenger(n1, f1);
        addPassenger(n2, f2);
    }
}