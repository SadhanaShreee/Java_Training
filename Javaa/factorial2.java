import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long fact = 1;
        long count=0;
        long rev = 0;

        for(int i=1;i<=num;i++){  //simple factorial logic
            fact *= i;
        }
        for(int i=0;i<fact;i++){
            rev = fact % 10;   //reverse the number
             
            if(rev==0){   // if that rev is 0 the the number of 0's count increases
                count++;
                fact /= 10;  //then keep the track of 0s  eg 120 -> 12
            } 
        }
        System.out.println(count +"  zeros: ");
    
    }
}
