import java.util.Scanner;
public class menuAppSwitchh {
    public static void add(Scanner scan){
        System.out.print("Enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Addition of two numbers = "+(num1+num2));
    }
    public static void subtract(Scanner scan){
        System.out.print("Enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Subtraction of two numbers = "+(num1-num2));

    }
    public static void multiply(Scanner scan){
        System.out.print("Enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Multiplication of two numbers = "+(num1*num2));
    }
    public static void divide(Scanner scan){
        System.out.print("Enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num2!=0){
             System.out.println("Division of two numbers = "+(num1/num2));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= 0;

        System.out.println(" 1 . Add\n 2 . Subtract\n 3 . Multiply\n 4 . Divide\n 5 . Exit\n");

        while(n!=5){
            System.out.print("Enter num: ");
            n = scan.nextInt();

            switch(n){
                case 1:
                  add(scan);
                  break;
                case 2:
                  subtract(scan);
                  break;
                case 3:
                  multiply(scan);
                  break;
                case 4:
                  divide(scan);
                  break;
                case 5:
                  System.out.println("You entered 5....Program exiting!!!!!!!!!!");
                  break;
                default:
                  System.out.println("Invalid num....only(1-5)");
            }
        }
    }
}
