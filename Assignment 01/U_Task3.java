import java.util.Scanner;

public class U_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of teh array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Bubble sorting :3
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        double median;
        if (n % 2 == 1) {
            median = a[n / 2];
        } else {
            median = (a[(n / 2) - 1] + a[n / 2]) / 2.0;
            System.out.println();
        }
        System.out.println("The median is " + median);
        sc.close();
    }
}