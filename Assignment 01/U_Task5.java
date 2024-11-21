import java.util.Scanner;

public class U_Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the value of column: ");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix A");
        for (int num[] : a) {
            for (int element : num) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose A");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}