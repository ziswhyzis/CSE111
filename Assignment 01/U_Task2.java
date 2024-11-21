import java.util.Scanner;

public class U_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements of the array: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0], min = a[0];
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIdx = i;
            }
        }
        System.out.println("The largest number " + max + " was found at location " + maxIdx + ".");
        System.out.println("The smallest number " + min + " was found at location " + minIdx + ".");
        sc.close();
    }
}