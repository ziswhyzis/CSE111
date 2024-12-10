public class BracuStudent {
    public String name;
    public String address;
    public boolean busPass;

    public BracuStudent(String name, String address) {
        this.name = name;
        this.address = address;
        this.busPass = false;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + address);
        System.out.println("Have Buss Pass? " + busPass);
    }

    public void getPass() {
        this.busPass = true;
    }

    public void updateHome(String address) {
        this.address = address;
    }
}

public class BracuBus {
    public String route;
    public int max;
    public int count;
    public String passengers = "";

    public BracuBus(String route) {
        this.route = route;
        this.max = 2;
    }

    public BracuBus(String route, int max) {
        this.route = route;
        this.max = max;
    }

    public void board() {
        if (count == 0) {
            System.out.println("No passengers");
        } else {
            System.out.println(count + " passengers");
        }
    }

    public void board(BracuStudent student) {
        if (student.busPass == false) {
            System.out.println("You don't have a bus pass!");
        } else if (!(this.route.equals(student.address))) {
            System.out.println("You got on the wrong bus!");
        } else {
            if (count < max) {
                System.out.println(student.name + " boarded the bus.");
                passengers += (student.name + " ");
                count++;
            } else {
                System.out.println("Bus is full!");
            }
        }
    }

    public void board(BracuStudent s1, BracuStudent s2) {
        board(s1);
        board(s2);
    }

    public void showDetails() {
        System.out.println("Bus route: " + route);
        System.out.println("Passenger count: " + count + " (Max: " + max + ")");
        System.out.println("Passengers on Board:");
        System.out.println(passengers);
    }
}