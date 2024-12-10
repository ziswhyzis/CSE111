public class Student {
    public String name;
    public long id;
    public String dept;
    public String email;
    public String password;
    public String[] course;
    public int count;
    public boolean loginStatus;
    public boolean advisingStatus;

    public Student(String name, long id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.email = null;
        this.password = null;
        course = new String[3];
        this.count = 0;
        this.loginStatus = false;
        this.advisingStatus = false;
        System.out.println("Student object is created");
    }
}


public class Usis {
    public int totalAdvisee;
    public Student[] students;

    public Usis() {
        this.totalAdvisee = 0;
        this.students = new Student[5];
        System.out.println("Usis is ready to use!");
    }

    public void login(Student a) {
        if (a.email == null || a.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            System.out.println("Login successful");
            a.loginStatus = true;
        }
    }

    public void advising(Student a) {
        if (!a.loginStatus) {
            System.out.println("Please login to advise courses!");
        } else {
            System.out.println("You haven't selected any courses.");
        }
    }

    public void advising(Student a, String course) {
        if (a.advisingStatus) {
            if (a.count < 3) {
                a.course[a.count++] = course;
            }
        }
    }

    public void advising(Student a, String c1, String c2, String c3, String c4) {
        System.out.println("You need special approval to take more than 3 courses.");
    }

    public void advising(Student a, String c1, String c2, String c3) {
        System.out.println("Advising successful!");
        a.advisingStatus = true;
        advising(a, c1);
        advising(a, c2);
        advising(a, c3);
        students[totalAdvisee++] = a;
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvisee);
        for (int i = 0; i < totalAdvisee; i++) {
            Student a = students[i];
            System.out.println("Name: " + a.name + " ID: " + a.id);
            System.out.println("Department: " + a.dept);
            System.out.println("Advised Courses: ");
            for (String course : a.course) {
                if (course != null) {
                    System.out.print(course + " ");
                }
            }
            System.out.println();
            System.out.println("==============");
        }
    }
}