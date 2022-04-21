import java.util.Scanner;

public class ExFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        String c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.next();
        if (c.equals("+")) {
            System.out.println(a + b);
        }
        else if (c.equals("-")) {
            System.out.println(a - b);
        }
        else if (c.equals("*")) {
            System.out.println(a * b);
        }
        else if (c.equals("/")) {
            System.out.println(a / b);
        }
    }
}
