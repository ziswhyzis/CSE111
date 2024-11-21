import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0, max = 1, min = 1;
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n > 0 && n % 2 != 0) {
                sum += n;
                count++;
                if (i == 1) {
                    max = n;
                    min = n;
                } else {
                    if (n > max) {
                        max = n;
                    }
                    if (n < min) {
                        min = n;
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + (double) sum / count);
        } else {
            System.out.println("No odd positive numbers found");
        }
        sc.close();
    }
}