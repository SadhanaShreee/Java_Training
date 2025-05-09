import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scan.nextInt();

        int ogn = num;
        int count = 0;
        int tempv = num;
        while(tempv!=0){
            tempv/=10;
            count++;
        } 
        int sum=0;
        tempv=num;
        while(tempv>0){
            int digit = tempv%10;
            sum += Math.pow(digit,count);
            tempv/=10;
        }
        if(sum == ogn){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
            }
    }

