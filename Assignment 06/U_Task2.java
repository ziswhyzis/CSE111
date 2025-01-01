public class Travel {
    private static int count = 0;

    private String source;
    private String destination;
    private int fightTime;

    public static int getCount() {
        return count;
    }

    public Travel(String source, String destination) {
        this.source = source;
        this.destination = destination;
        count++;
    }

    public void setTime(int fightTime) {
        this.fightTime = fightTime;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String displayTravelInfo() {
        return "Source: " + source + "\nDestination: " + destination + "\nFight Time: " + fightTime + ":00";
    }
}