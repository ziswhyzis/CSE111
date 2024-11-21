public class CellPhone {
    public String model = "unknown";
    public int count;
    public String contact = "";

    public void printDetails() {
        System.out.println("Phone Model " + model);
        System.out.println("Contacts stored " + count);
        if (count > 0) {
            System.out.println("Stored contacts:");
            System.out.print(contact);
        }
    }

    public void storeContact(String cont) {
        if (count < 3) {
            count++;
            contact += cont + "\n";
            System.out.println("Contact Stored");;
        } else {
            System.out.println("Memory full. New contact can't be stored.");;
        }
    }
}