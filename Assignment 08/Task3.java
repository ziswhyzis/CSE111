public class Striker extends Football {
    public int goals;
    public int shots;

    public Striker(String name, int age, int stamina, int goals, int shots) {
        super(name, age, stamina);
        this.goals = goals;
        this.shots = shots;
    }
    public void display() {
        super.display();
        System.out.println("Goals: " + goals);
        System.out.println("hots on target: " + shots);
    }

    public void calculatePerformance() {
        System.out.println("Performance: " + (double) goals / shots);
    }
}


public class Defender extends Football {
    public int tackles;
    public int interceptions;

    public Defender(String name, int age, int stamina, int tackles, int interceptions) {
        super(name, age, stamina);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }

    public void display() {
        super.display();
        System.out.println("Tackles: " + tackles);
        System.out.println("Interceptions: " + interceptions);
    }

    public void calculatePerformance() {
        System.out.println("Performance: " + (double) interceptions / tackles);
    }
}