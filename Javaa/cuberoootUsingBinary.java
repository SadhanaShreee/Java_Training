import java.util.Scanner;
public class cuberoootUsingBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scan.nextInt();
        int left=0;
        int right = num;
        int mid=0;
        double e=0.00001;

        while(left<=right){
            mid = (left+right)/2;
        if(mid*mid*mid==num){
            System.out.println(" Cube root of " + num + " is " + mid);
            return;
        }
        if(mid*mid*mid < num){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
        if(Math.abs(mid*mid*mid -num)<e){
            break;
        }
    }
    System.out.println("Cube root of "+ num + " is " +mid );
    
 }
}
