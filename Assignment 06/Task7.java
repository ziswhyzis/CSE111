public class Student {
    static int totalStudents = 0;
    static int CSEStudents = 0;
    static int otherStudents = 0;
    static int ID = 0;

    String name;
    double cgpa;
    String dept;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
        this.dept = "CSE";
        CSEStudents++;
        totalStudents++;
        ID++;
    }

    public Student(String name, double cgpa, String dept) {
        this.name = name;
        this.cgpa = cgpa;
        this.dept = dept;
        otherStudents++;
        totalStudents++;
        ID++;
    }

    public static void printDetails() {
        System.out.println("Total Student(s): " + totalStudents);
        System.out.println("CSE Student(s): " + CSEStudents);
        System.out.println("Other Department Student(s): " + otherStudents);
    }

    public void individualDetail() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dept);
    }
}