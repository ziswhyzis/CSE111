public class Course {
    public String course;

    public Course(String course) {
        this.course = course;
    }
}

public class Teacher {
    public String name;
    public String init;
    public String courses;

    public Teacher(String name, String init) {
        this.name = name;
        this.init = init;
        this.courses = "";
        System.out.println("A new teacher has been created");
    }

    public void addCourse(Course obj) {
        this.courses += obj.course + "\n";
    }

    public void printDetail() {
        System.out.println("Name: " + name);
        System.out.println("Initial: " + init);
        System.out.println("List of courses: ");
        System.out.println(courses);
    }
}