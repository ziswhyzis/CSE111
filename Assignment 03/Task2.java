public class Shape {
    public String name;
    public double area;

    public void setParameters(String n, int rad) {
        name = n;
        area = Math.PI * rad * rad;
    }

    public void setParameters(String n, int b, int h) {
        name = n;
        area = 0.5 * b * h;
    }

    public void setParameters(String n, double l, double w) {
        name = n;
        area = l * w;
    }

    public String details() {
        return "Shape name: " + name + "\nArea: " + String.format("%.2f", area);
    }
}