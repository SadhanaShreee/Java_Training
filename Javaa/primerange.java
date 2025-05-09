import java.util.Scanner;
public class primerange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter start range: ");
        int start = scan.nextInt();
        System.out.print("Enter end range: ");
        int end = scan.nextInt();

        for( num=start;num<=end;num++){
            if(num<=1){

                System.out.print("Not prime ");
            }
            int count=0;
        
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    count++;
                    break;
                }
            }

        if(count==0){
            System.out.println(num +" ");
        }

    }
    }
}


        

