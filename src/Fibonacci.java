import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, a = 0, b = 1, c;
        if (n <= 1) {
            System.out.print(a + ",");
        } else if (n == 2)
            System.out.print(a + "," + b + ",");
        else {
            System.out.print(a + "," + b + ",");
            c = 0;
            for (i = 2; i < n; i++) {
                c = a + b;
                System.out.print(c + ",");
                a = b;
                b = c;
            }
        }
    }
}
