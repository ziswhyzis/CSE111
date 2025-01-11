// PROPER CODE WITH ARRAY AND PRINTING EXACT OUTPUT
class ScienceExam extends Exam {
    int parts = 2;
    String[] subjects = new String[3];

    ScienceExam(int marks, int time, String sub1, String sub2) {
        super(marks);
        super.time = time;
        subjects[0] = sub1;
        subjects[1] = sub2;
        parts += 2;
    }

    ScienceExam(int marks, int time, String sub1, String sub2, String sub3) {
        super(marks);
        super.time = time;
        subjects[0] = sub1;
        subjects[1] = sub2;
        subjects[2] = sub3;
        parts += 3;
    }

    public String examSyllabus() {
        String temp = "";
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                if (i < subjects.length - 1 && subjects[i + 1] != null) {
                    temp += subjects[i] + ", ";
                } else {
                    temp += subjects[i];
                }
            }
        }
        return super.examSyllabus() + ", " + temp;
    }

    public String examParts() {
        String temp = "";
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                if (i < subjects.length - 1 && subjects[i + 1] != null) { // needed so it doesnt add extra newline which is not in the output
                    temp += "Part " + (i + 3) + " - " + subjects[i] + "\n";
                } else {
                    temp += "Part " + (i + 3) + " - " + subjects[i];
                }
            }
        }
        return super.examParts() + temp;
    }

    public String toString() {
        return "Marks: " + marks + "\nTime: " + time + "\nNumber of parts: " + parts;
    }
}

// cheap slip-out with string concatenation
public class ScienceExam extends Exam {
    int parts = 2;
    String part = "";
    String subjects = "";

    public ScienceExam(int marks, int time, String... subjects) {
        super(marks);
        super.time = time;
        for (String subject : subjects) {
            part += subject + ", ";
            this.subjects += "Part " + (++parts) + " - " + subject + "\n";
        }
    }

    public String examSyllabus() {
        return super.examSyllabus() + ", " + part;
    }

    public String examParts() {
        return super.examParts() + subjects;
    }

    public String toString() {
        return "Marks: " + marks + "\nTime: " + time + "\nNumber of parts: " + parts;
    }
}