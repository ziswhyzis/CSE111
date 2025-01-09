public class Vaccine {
    private String name;
    private int doseInterval;

    Vaccine(String name, String origin, int doseInterval) {
        this.name = name;
        this.doseInterval = doseInterval;
    }

    public String getName() {
        return name;
    }

    public int getDoseInterval() {
        return doseInterval;
    }
}

public class Person {
    String name;
    String title;
    int age;
    boolean firstDose = false;
    boolean secondDose = false;
    Vaccine vaccine;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.title = "General Citizen";
    }

    Person(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    void pushVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
        if (this.title.equals("Student") || this.age > 25) {
            if (firstDose) {
                System.out.println("Sorry " + this.name + ", invalid dose request.");
            } else {
                System.out.println("1st dose done for " + this.name);
                firstDose = true;
            }
        } else {
            System.out.println("Sorry " + this.name + ", Minimum age for taking vaccines is 25 years now.");
        }
    }

    void pushVaccine(Vaccine vaccine, String dose) {
        if (dose.equals("2nd Dose") && !firstDose) {
            System.out.println("Sorry " + this.name + ", invalid dose request.");
            return;
        }
        if (this.vaccine == null) {
            pushVaccine(vaccine);
            return;
        }
        if (!this.vaccine.equals(vaccine)) {
            System.out.println("Sorry " + this.name + ", you can't take 2 different vaccines");
            return;
        }
        if (secondDose) {
            System.out.println("Sorry " + this.name + ", you already received both doses");
            return;
        }
        System.out.println("2nd dose done for " + this.name);
        secondDose = true;
    }

    void showDetail() {
        System.out.printf("Name: %s Age: %d Type: %s\n", this.name, this.age, this.title);
        System.out.println("Vaccine name: " + this.vaccine.getName());
        System.out.println("1st Dose: Given");
        if (!secondDose) {
            System.out.println("2nd Dose: Please come after " + vaccine.getDoseInterval() + " days");
        } else {
            System.out.println("2nd Dose: Given");
        }
    }
}