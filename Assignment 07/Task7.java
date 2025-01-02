public class CinemexTicket extends MovieTicket {
    private static int totalTickets = 0;

    String ticketID;
    String genre;
    boolean isPaid = false;
    String status;

    CinemexTicket(String movie, String showtime, String genre, String date) {
        super(movie, date, showtime, 0);
        super.seat = "Regular";
        this.genre = genre;
        this.status = "Not Paid";
        totalTickets++;
        this.ticketID = movie + "-" + super.seat.charAt(0) + "-" + totalTickets;
    }

    CinemexTicket(String movie, String showtime, String genre, String date, String seat) {
        super(movie, date, showtime, 0);
        super.seat = seat;
        this.genre = genre;
        this.status = "Not Paid";
        totalTickets++;
        this.ticketID = movie + "-" + super.seat.charAt(0) + "-" + totalTickets;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    void calculateTicketPrice() {
        for (int i = 0; i < 3; i++) {
            if (super.seat.equals(seatTypes[i])) {
                super.setPrice(seatPrices[i]);
                break;
            }
        }
        int time = Integer.parseInt(super.showtime.split(":")[0]);
        double price = super.getPrice();
        if (18 <= time && time < 23) {
            price += price * nightShowCharge / 100;
            super.setPrice(price);
        }
        System.out.println("Ticket price is calculated successfully.");
    }

    String confirmPayment() {
        if (isPaid) {
            this.status = "Paid";
            return "Ticket price is already paid!";
        } else {
            isPaid = true;
            this.status = "Paid";
            return "Payment Successful.";
        }
    }

    public String toString() {
        return "Ticket ID: " + this.ticketID + "\n" + super.toString() + "\nGenre: " + genre + "\nSeat Type: "
                + super.seat + "\nPrice(tk): " + super.getPrice() + "\nStatus: " + this.status;
    }
}