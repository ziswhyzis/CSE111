public class Dog extends Animal {
    String name;

    Dog () {
        System.out.println("The dog says hello!");
    }

    String getName() {
        return name;
    }

    void updateSound(String newSound) {
        super.sound = newSound;
    }
}