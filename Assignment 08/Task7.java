public class Mango extends Fruit {
    public Mango() {
        super(true, "Mango");
    }

    @Override
    public String toString() {
        if (hasFormalin()) {
            return getName() + "s are bad for you.";
        } else {
            return getName() + "s are good for you";
        }
    }
}


public class Jackfruit extends Fruit {
    public Jackfruit() {
        super(false, "Jackfruit");
    }

    @Override
    public String toString() {
        if (hasFormalin()) {
            return getName() + "s are bad for you.";
        } else {
            return getName() + "s are good for you";
        }
    }
}