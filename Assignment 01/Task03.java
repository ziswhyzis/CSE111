import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String a = sc.next(), b =sc.next();
        System.out.println(a + " " + b);
        String c = a+b;
        int sum = 0;
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            sum += (int)ch;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}