import java.util.Scanner;
public class recursiveFactorial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
            return  n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("The factorial of a num is : "+factorial(n));
    }
}
