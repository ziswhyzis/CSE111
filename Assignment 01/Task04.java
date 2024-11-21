import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word in lowercase letters: ");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char rs;
                if (ch == 'a') {
                    rs = 'z';
                } else {
                    rs = (char) (ch - 1);
                }
                res += rs;
            }
        }
        System.out.println("Output: " + res);
        sc.close();
    }
}