public class ChickenBurger {
    public String bun = "Sesame";
    public int price = 200;
    public String sauceOption = "Less";
    public String spiceLevel = "Not Set";

    private String[] validSpiceLevels = { "Mild", "Spicy", "Naga", "Extreme" };

    public void customizeSpiceLevel(String level) {
        boolean valid = false;
        for (String spice : validSpiceLevels) {
            if (spice.equals(level)) {
                valid = true;
                break;
            }
        }

        if (valid) {
            spiceLevel = level;
            System.out.println("Spice level set to " + level + ".");
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }

    public String serveBurger() {
        if (spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice Level first.";
        }
        return "The burger is being served:\n" +
                "Bun Type: " + bun + "\n" +
                "Price: " + price + "\n" +
                "Sauce Option: " + sauceOption + "\n" +
                "Spice Level: " + spiceLevel;
    }
}
