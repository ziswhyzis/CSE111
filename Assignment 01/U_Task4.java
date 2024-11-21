import java.util.Scanner;

public class U_Task4 {
    public static void main(String[] args) {
        int[][] A = { { 4, 5, 7 },
                { 0, 3, -2 },
                { 4, 1, -4 },
                { 5, 10, 1 } };
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        int k = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(k * A[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}