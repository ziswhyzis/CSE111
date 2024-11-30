public class Student {
    public String name = "Not set";
    public String dept = "CSE";
    public double cgpa = 0.0;
    public int credit = 9;
    public String status = "Not Set";

    public void updateDetails(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
    public void updateDetails(String name, double cgpa, int credit) {
        updateDetails(name, cgpa);
        this.credit = credit;
    }

    public void updateDetails(String name, double cgpa, int credit, String dept) {
        updateDetails(name, cgpa, credit);
        this.dept = dept;
    }

    public void checkScholarshipEligibility() {
        if (cgpa >= 3.5 && credit > 10) {
            if (cgpa < 3.7) {
                System.out.println(name + " is eligible for Need based scholarship");
                status = "Need based scholarship";
            } else if (cgpa >= 3.7) {
                System.out.println(name + " is eligible for Merit based scholarship");
                status = "Merit based scholarship";
            }
        } else {
            System.out.println(name + " is not eligible for scholarship");
            status = "No scholarship";
        }
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credits: " + credit);
        System.out.println("Scholarship Status: " + status);
    }
}