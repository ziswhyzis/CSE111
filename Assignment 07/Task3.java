public class Dog extends Animal {
    String breed;

    Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println(color + " color " + name + " is barking");
    }

    public String info() {
        return super.info() + "Breed: " + breed;
    }
}

public class Cat extends Animal {
    String breed;

    Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println(color + " color " + name + " is meowing");
    }

    public String info() {
        return super.info() + "Breed: " + breed;
    }
}