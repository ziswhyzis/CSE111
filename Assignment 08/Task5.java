public class Dragon extends MagicalCreature {
    int powerlevel;

    public Dragon(String name, int age, int powerlevel) {
        super(name, age);
        this.powerlevel = powerlevel;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars with a fiery breath!");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " breathes fire with power level: " + powerlevel);
    }

    void fly() {
        System.out.println(name + " flies through the sky.");
    }
}


public class Phoenix extends MagicalCreature {
    int rebirths;

    public Phoenix(String name, int age, int rebirths) {
        super(name, age);
        this.rebirths = rebirths;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sings a enchanting song!");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " is reborn with " + rebirths + " rebirth cycles.");
    }

    void regenerate() {
        System.out.println(name + " regenerates its body in a burst of flames.");
    }
}