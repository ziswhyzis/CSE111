public class Bird {
    String name;
    int altitude = 0;

    public void flyUp(int feet) {
        altitude += feet;
        System.out.println(name + " has flown up " + feet + " feet.");
    }

    public void flyDown(int feet) {
        if (feet > altitude) {
            System.out.println(name + " cannot fly down " + feet + " feet.");
        } else {
            altitude -= feet;
            if (altitude == 0) {
                System.out.println(name + " has flown down " + feet + " feet and landed.");
            } else {
                System.out.println(name + " has flown down " + feet + " feet.");
            }
        }
    }

    public void makeNoise() {
        if (name.equals("Parrot")) {
            System.out.println("Squawk");
        } else if (name.equals("Eagle")) {
            System.out.println("Squee");
        }
    }
}