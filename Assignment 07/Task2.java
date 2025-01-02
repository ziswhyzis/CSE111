public class CheckingAccount extends Account {
    static int count = 0;
    
    CheckingAccount() {
        super(0.0);
        count++;
    }

    CheckingAccount(double bal) {
        super(bal);
        count++;
    }
}