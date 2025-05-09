import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scan.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) { // factors should not be the number itself so <
            if (num % i == 0) {  // to find factors
                sum += i; // add factors
            }
        }
        if (sum == num) {  // if the sum of factors and the num are equal then its a perfect number
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " Its not a perfect number");
        }

    }
}
