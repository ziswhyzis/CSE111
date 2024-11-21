import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        int count = 0;
        double[] nA = new double[n];
        nA[count] = a[0];
        count++;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                nA[count] = a[i];
                count++;
            }
        }
        System.out.print("New Array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(nA[i] + " ");
        }
        System.out.println();
        int removed = n - count;
        System.out.println("Removed elements: " + removed);
        sc.close();
    }
}