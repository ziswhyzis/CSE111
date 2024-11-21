// (a)

public class UniversityTester {
    public static void main(String[] args) {
        University obj1 = new University();
        University obj2 = new University();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.name);
        System.out.println(obj1.country);
        System.out.println(obj2.name);
        System.out.println(obj2.country);

// The location of the objects are not the same.

//(b)

        obj1.name =  "Imperial College London";
        obj1.country = "England";
        obj2.name =  "Brac University";
        obj2.country = "Bangladesh";
        System.out.println(obj1.name);
        System.out.println(obj1.country);
        System.out.println(obj2.name);
        System.out.println(obj2.country);

// instance variables of both objects have changed and the values are not the same.
    }
}