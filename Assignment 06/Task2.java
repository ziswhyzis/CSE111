public class Passenger {
    static int no_of_passenger;
    static double total_fare = 0;

    String name;
    double fare = 0;

    public Passenger(String name, double distance) {
        this.name = name;
        fare = distance * 20;
        total_fare += distance * 20;
        no_of_passenger++;
    }

    public void passengerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Total fare: " + fare + " TK");
    }

    public void storeBaggageWeight(double weight) {
        fare += weight * 10;
        total_fare += weight * 10;
    }
}