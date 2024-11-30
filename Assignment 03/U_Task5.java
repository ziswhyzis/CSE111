public class Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        add(a+b, c);
    }

    public void multiply(int a, int b) {
        System.out.println(a*b);
    }

    public void multiply(int a, int b, int c) {
        multiply(a*b, c);
    }

    public void multiply(String a, int b) {
        for (int i = 0; i < b; i++) {
            if (i == b - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + "-");
            }
        }
        System.out.println();
    }
}