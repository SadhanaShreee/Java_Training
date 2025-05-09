import java.util.Scanner;
public class swapWithoutTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Before swapping a = "+a+ " and b = "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swapping: a = "+a+" and b = "+b);
    }
}
