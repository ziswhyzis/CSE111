public class Course {
    public String name;
    public String code;
    public int count = 0;
    public String contents = "";

    public void updateDetails(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void printDetails() {
        System.out.println("Course details: ");
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus: ");
        if (contents == "") {
            System.out.println("No content yet.");
        } else {
            System.out.println(contents);
        }
    }

    public void addContent(String content) {
        if (count >= 4) {
            System.out.println("Cannot add more content");
        } else {
            contents += content + ", ";
            count++;
            System.out.println(content + " was added.");
        }
    }

    public void addContent(String c1, String c2) {
        addContent(c1);
        addContent(c2);
    }
}