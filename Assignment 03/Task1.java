public class BankAccount {
    public long account  = 0;
    public String type = "Not Set";

    public void setInfo(long a, String t) {
        account = a;
        type = t;
        System.out.println("Account information updated!");
    }

    public String printDetails() {
        return "Account No: " + account + "\nType: " + type; 
    }
}