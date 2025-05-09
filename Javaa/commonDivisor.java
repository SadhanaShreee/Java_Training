import java.util.Scanner;

public class commonDivisor {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();

        int output = GCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " : " + output);
    }
}
