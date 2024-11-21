public class Task09 {
    public static void main(String[] args) {
        int[][] A = { { 1, 0, 0 },
                    { 0, 1, 0 },
                    { 0, 0, 1 } };
        if (ifIM(A)) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }

    public static boolean ifIM(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j && A[i][j] != 1) {
                    return false;
                }
                if (i != j && A[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}