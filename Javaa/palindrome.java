import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        if(num<0 || (num%10==0 && num!=0)){
            System.out.println("Not a palindrome!!");
            return;
        }

        int reversenum = 0;

        while (num > reversenum) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num = num / 10;
        }

        if ((num == reversenum) || (num == reversenum / 10)) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
        scan.close();


    }
}










        