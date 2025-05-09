import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        int i=2;
        int count=0;
        while(i<=num/2){
            if(num%i==0){
                count++;
                break;
    }
    i++;
}
    if(num<=1){
        System.out.println(num + " Is not a Prime number ");
    }
    else if(count==0){
        System.out.println(num + " Is a Prime number ");
    }
    else{
        System.out.println(num + " Is not a Prime number");
    }
        
    }
}
