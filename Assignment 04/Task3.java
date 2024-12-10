import java.lang.Math;

public class Shape2D {
    public int a;
    public int b;
    public int c;
    public String x;
    public double area;

    public Shape2D() {
        this.a = 5;
        this.x = "Square";
        this.area = a * a;
        System.out.println("A Square has been created with length: " + a);
    }

    public Shape2D(int a, int b) {
        this.a = a;
        this.b = b;
        this.x = "Rectangle";
        this.area = a * b;
        System.out.println("A Rectangle has been created with length: " + a + " and breadth: " + b);
    }

    public Shape2D(int a, int b, String x) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.area = 0.5 * a * b;
        System.out.println("A Triangle has been created with height: " + a + " and base: " + b);
    }

    public Shape2D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = "Triangle";
        int s = (a + b + c) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("A Triangle has been created with the following sides: " + a + ", " + b + ", " + c);
    }

    public void area() {
        System.out.println("The area of the " + x + " is: " + area);
    }
}