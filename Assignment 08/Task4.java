public class Nokia extends Mobile {
    public double balance;

    public Nokia(String model, boolean simCardStatus, String IMEICode, int balance) {
        super(model, IMEICode, simCardStatus);
        this.balance = balance;
    }

    public String dialCall(String number) {
        if (!simCardStatus) {
            return "No SIM card available! Please check the SIM card connectivity.";
        }
        if (balance == 0) {
            return "Insufficient balance! Please recharge.";
        }
        String country = getCountryName(number.substring(0, 3));
        if (country == null) {
            return "Dialing is not allowed in this region.";
        }
        return "Dialing the number " + number + " to " + country + " region.";
    }

    public void rechargeSIMCard(int amount) {
        balance += amount;
        System.out.println("Recharge successful. Current balance is " + balance + " TK.");
    }


    @Override
    public String toString() {
        return super.toString() + "\nBalance: " + balance + " TK";
    }
}
