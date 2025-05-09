import java.util.Scanner;
public class sieveoferato {
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scan.nextInt();
        System.out.print("Enter end: ");
        int end = scan.nextInt();
        boolean prime=true;

        for(num=start;num<=end;num++){
            if(num<=1){
                continue;
            }
            if(num>1){
                 prime = true;
            }
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(num);

            }
        }


    }
}
