import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = { { 0, 0, 10, 0, -1 },
                { 0, -1, 0, 0, -1 },
                { -1, 0, -1, 0, 0 },
                { 0, -1, 7, 0, -1 },
                { 0, -1, 0, -1, 0 }
        };
        System.out.println("Initial Map:");
        printMap(arr2D);
        int row = arr2D.length;
        int col = arr2D[0].length;
        int row_pos = -1, col_pos = -1;
        // To-do: find out the position of the player

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] == 7) {
                    row_pos = i;
                    col_pos = j;
                    break;
                }
            }
        }

        int turns = 5;
        while (turns > 0) {
            int new_row = row_pos, new_col = col_pos;
            System.out.printf("Enter move %d: ", (6 - turns));
            String inp = sc.nextLine();
            /*
             * To-do: Based on the input update the player position and check if
             * 1. the player fell out of the grid
             * 2. player stepped on mine
             * 3. player found the treasure
             * otheriwse, update the player position
             */

            switch (inp) {
                case "UP":
                    new_row--;
                    break;
                case "DOWN":
                    new_row++;
                    break;
                case "LEFT":
                    new_col--;
                    break;
                case "RIGHT":
                    new_col++;
                    break;

                default:
                    System.out.println("(UP / DOWN / LEFT / RIGHT) ONLY BRUH !!!");
                    continue;
            }
            System.out.println();
            if (new_row < 0 || new_row >= row || new_col < 0 || new_col >= col) {
                System.out.println("How possibly someone could be so blind to fall out of the grid?!?? smh");
                System.exit(0);
            }

            if (arr2D[new_row][new_col] == -1) {
                System.out.println("How clumsy can you be to step on a mine?!?? smh");
                System.exit(0);
            }

            if (arr2D[new_row][new_col] == 10) {
                System.out.println("YAS YOU WIN, BRAVOO!!!");
                break;
            }

            arr2D[row_pos][col_pos] = 0;
            arr2D[new_row][new_col] = 7;
            row_pos = new_row;
            col_pos = new_col;

            System.out.println("Current state:");
            printMap(arr2D);
            System.out.println();
            turns--;
        }
        if (turns == 0) {
            System.out.println("Failed to find the treasure.");
        }
        sc.close();
    }

    public static void printMap(int[][] arr) {
        // To-do: print the 2D grid

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}