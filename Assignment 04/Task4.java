public class Student {
    public long id;
    public double cg;
    public int count = 0;
    public String courses = "";

    public Student(long id) {
        this.id = id;
        System.out.println("A student with ID " + id + " has been created.");
    }

    public Student(long id, double cg) {
        this.id = id;
        this.cg = cg;
        System.out.println("A student with ID " + id + " and cgpa " + cg + " has been created.");
    }

    public void addCourse(String course) {
        if (cg == 0.0) {
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
        } else {
            if (cg < 3.0) {
                if (count < 3) {
                    courses += course + " ";
                    count++;
                } else {
                    System.out.println("Failed to add " + course);
                    System.out.println("CG is low. Can't add more than 3 courses.");
                }
            } else {
                if (count < 4) {
                    courses += course + " ";
                    count++;
                } else {
                    System.out.println("Failed to add " + course);
                    System.out.println("Maximum 4 courses allowed.");
                }
            }
        }
    }

    public void addCourse(String[] courseArr) {
        for (String course : courseArr) {
            addCourse(course);
        }
    }

    public void removeAllCourse() {
        courses = "";
        count = 0;
    }

    public void storeID(long id) {
        this.id = id;
    }

    public void storeCG(double cg) {
        this.cg = cg;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cg);
        System.out.println("Added courses are:");
        if (courses == "") {
            System.out.println("No courses added.");
        } else {
            System.out.print(courses);
            System.out.println();
        }
    }
}