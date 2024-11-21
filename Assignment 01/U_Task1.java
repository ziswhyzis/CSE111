import java.util.Scanner;

public class U_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Input array:");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Remove element: ");
        int remove = sc.nextInt();
        boolean found = false;
        for (int element : a) {
            if (element == remove) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("New array: ");
            for (int element : a) {
                if (element != remove) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}