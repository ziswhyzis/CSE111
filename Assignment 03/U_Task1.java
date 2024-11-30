public class MoneyTracker {
    public String name;
    public double balance;
    public double add;
    public double spend;

    public void createTracker(String name) {
        this.name = name;
        balance = 1.0;
    }

    public String info() {
        return "Name: " + name + "\nCurrent Balance: " + balance;
    }

    public void income(double income) {
        balance += income;
        add = income;
    }

    public void expense(double expense) {
        if ((balance - expense) == 0) {
            System.out.println("You're broke!");
        } else if ((balance - expense) < 0) {
            System.out.println("Not enough balance.");
        } else {
            balance -= expense;
            spend = expense;
            System.out.println("Balance Updated!");
        }
    }

    public void showHistory() {
        System.out.println("Last added: " + add);
        System.out.println("Last spent: " + spend);
    }
}