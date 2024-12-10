public class Player {
    public String name;
    public int age;
    public int totalMatches;

    public Player(String name, int age, int totalMatches) {
        this.name = name;
        this.age = age;
        this.totalMatches = totalMatches;
    }
}


public class Team {
    public String name;
    public Player[] players = new Player[2];
    public int count = 0;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players[count++] = p;
    }

    public void printDetail() {
        System.out.println("Team: " + name);
        System.out.println("List of players:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + players[i].name);
            System.out.print("Age: " + players[i].age + ", ");
            System.out.println("Total Matches: " + players[i].totalMatches);
        }
    }
}