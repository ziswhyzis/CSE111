public class Bondhus extends SocialMedia {
    String sentbox = "";
    int count;

    public Bondhus(String name, String mail) {
        super(name, mail);
        this.count = 0;
    }

    void showSentbox() {
        System.out.println(userName + "'s sentbox:");
        if (count == 0) {
            System.out.println("No sent messages.");
        } else {
            System.out.println(sentbox);
        }
    }

    void sendMessage(String message) {
        if (count >= 5) {
            System.out.println("Sentbox is full.");
        } else {
            sentbox += message + "\n";
            count++;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMessages Sent: " + count;
    }
}