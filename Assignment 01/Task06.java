import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!flag[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        flag[j] = true;
                    }
                }
                System.out.println(a[i] + " - " + count + " times");
            }
        }
        sc.close();
    }
}