public class Circle {
    static int count = 0;
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        count++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}