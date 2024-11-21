import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int r = sc.nextInt();
        System.out.print("column: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] b = new int[r * c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[index] = a[i][j];
                index++;
            }
        }
        System.out.println("1D array:");
        for (int element : b) {
            System.out.print(element + " ");
        }
        sc.close();
    }
}