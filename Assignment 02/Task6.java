public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails() {
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }

    public String makeOptional() {
        if (submission) {
            submission = false;
            return "Assignment will not require submission";
        } else {
            return "Submission is already not required";
        }
    }
}