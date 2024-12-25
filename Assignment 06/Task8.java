public class Player {
    static int total = 0;
    static String[] players = new String[11];

    String name;
    int number;
    String country;

    public Player (String name, String country, int number) {
        this.name = name;
        this.country = country;
        this.number = number;
        if (total < 11) {
            players[total++] = name;
        }
    }

    public String player_detail() {
        return "Name: " + name  + "\nJersey Number: " + number + "\nCountry: " + country;
    }

    public static void info() {
        System.out.println("Total number of players: " + total);
        System.out.print("Players enlisted so far: ");
        for (int i = 0; i < total; i++) {
            System.out.print(players[i]);
            if (i < total - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}