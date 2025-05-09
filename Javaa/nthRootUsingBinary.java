import java.util.Scanner;

public class nthRootUsingBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        double left = 0;
        double right = num;
        double mid = 0;
        double error = 0.0000000000001;

        while((right - left) > error){
            mid = (left+right)/2;

            double root = 1;
            for(int i=0;i<n;i++){
                root = root * mid;
            }

            if(root>num){
                right = mid;
            }
            else{
                left = mid;
            }
        }
        System.out.println("The " + n + "th root of " + num + " is " + mid);
    }
}
