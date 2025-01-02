public class Manager extends Employee {
    int bonus;
    double finalSalary;

    public Manager(String name, double baseSalary, int hoursWorked, int bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }

    void calculateSalary() {
        if (getHoursWorked() > 40) {
            finalSalary = getBaseSalary() + getBaseSalary() * bonus / 100;
        } else {
            finalSalary = getBaseSalary();
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus + "%");
        System.out.println("Final Salary: $" + finalSalary);
    }

    void requestIncrement(int inc) {
        if (getHoursWorked() > 100) {
            setBaseSalary(getBaseSalary() + inc);
            System.out.println("$" + inc + " Increment approved.");
        } else if (getHoursWorked() > 80) {
            setBaseSalary(getBaseSalary() + 0.5 * inc);
            System.out.println("$" + 0.5 * inc + " Increment approved.");
        } else {
            System.out.println("Increment denied");
        }
    }
}

public class Developer extends Employee {
    String language;
    double finalSalary;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }

    void calculateSalary() {
        if (language.equals("Java")) {
            finalSalary = getBaseSalary() + 700;
        } else {
            finalSalary = getBaseSalary();
        }
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + finalSalary);
    }
}