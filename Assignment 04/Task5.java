public class Triangle {
    public int a, b, c;
    public int p;

    public void updateSides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (this.a + this.b + this.c);
    }

    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
        System.out.println("Perimeter: " + p);
    }

    public String printTriangleType() {
        if (a == b && b == c) {
            return "This is an Equilateral Triangle.";
        } else if (a == b || b == c || c == a) {
            return "This is an Isosceles Triangle.";
        } else {
            return "This is a Scalene Triangle.";
        }
    }

    public void compareTrinagles(Triangle obj) {
        if (this == obj) {
            System.out.println("These two triangle objects have the same address.");
        } else {
            if (this.a == obj.a && this.b == obj.b && this.c == obj.c) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            } else {
                if (this.p == obj.p) {
                    System.out.println("Only the perimeter of both triangles is equal.");
                } else {
                    System.out.println("Addresses, length of the sides and perimeter all are different.");
                }
            }
        }
    }
}