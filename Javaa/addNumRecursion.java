import java.util.Scanner;

public class addNumRecursion {
    public static int add(int n){
        if(n<=1){
            return 1;
        }
        return n + add(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("The sum of given num is : "+add(n));
    }
}
