public class MobilePhone {
    public int contactCapacity;
    public String[] contactNames;
    public int[] contactNumbers;
    public int count;

    public void setContactCapacity(int capacity) {
        contactCapacity = capacity;
        contactNames = new String[capacity];
        contactNumbers = new int[capacity];
    }

    public void addContact(String name, int phoneNumber) {
        if (count > contactCapacity) {
            System.out.println("Storage Full!!");
        } else {
            contactNames[count] = name;
            contactNumbers[count] = phoneNumber;
            count++;
            System.out.println("The contact of " + name + " is added.");
        }
    }

    public void makeCall(int phoneNumber) {
        String callName = null;
        for (int i = 0; i < count; i++) {
            if (contactNumbers[i] == phoneNumber) {
                callName = contactNames[i];
                break;
            }
        }
        if (callName != null) {
            System.out.println("Calling " + callName + " . . .");
        } else {
            System.out.println("Calling " + phoneNumber + " . . .");
        }
    }

    public void details() {
        System.out.println("Total Contacts: " + count);
        System.out.println("Contact List:");
        for (int i = 0; i < count; i++) {
            System.out.println(contactNames[i] + ":" + contactNumbers[i]);
        }
    }
}
