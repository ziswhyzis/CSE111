import java.util.Scanner;
import java.lang.Math;

public class Task02 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int low = sc.nextInt(), high = sc.nextInt();
        if (low > high) {
            int temp = high;
            high = low;
            low = temp;
        }
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers between " + low + " and " + high);
        sc.close();
    }
}