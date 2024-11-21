public class Course {
    public String cn;
    public String cc;
    public int c;

    public void updateDetails(String cn, String cc, int c) {
        this.cn = cn;
        this.cc = cc;
        this.c = c;
    }

    public void displayCourse() {
        System.out.println("Course name: " + cn);
        System.out.println("Course Code: " + cc);
        System.out.println("Course Credit: " + c);
    }
}