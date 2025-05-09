import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();

        int fact = 1;
        for (int i = 1; i <=num; i++) {
            fact*=i;
        }
        System.out.println("The factorial of "+ num + " is: " +fact);
    }
}
