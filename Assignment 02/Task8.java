public class Employee {
    public String name;
    public double salary;
    public String desig;

    public void newEmployee(String name) {
        this.name = name;
        salary = 30000.0;
        desig = "junior";
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + desig);
    }

    public void calculateTax() {
        if (salary > 50000.0) {
            System.out.println(name + " Tax Amount: " + salary * 0.3 + " Tk");
        } else if (salary > 30000.0) {
            System.out.println(name + " Tax Amount: " + salary * 0.1 + " Tk");
        } else {
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String promo) {
        if (promo.equals("senior")) {
            salary += 25000.0;
        } else if (promo.equals("lead")) {
            salary += 50000.0;
        } else if (promo.equals("manager")) {
            salary += 75000.0;
        }
        desig = promo;
        System.out.println(name + " has been promoted to " + desig);
        System.out.println("New salary: " + salary + " Tk");
    }
}