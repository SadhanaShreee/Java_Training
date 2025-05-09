import java.util.Scanner;
public class multiplynotwithstar{ // repeated addition method to multiply without * symbol
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scan.nextInt();

        int prod=0;
        for(int i=0;i<Math.abs(num2);i++){
            prod+=num1;
        }
        if(num2<0){
            prod = -prod;
        }
        System.out.println("The answer is: " + prod);
    }

}