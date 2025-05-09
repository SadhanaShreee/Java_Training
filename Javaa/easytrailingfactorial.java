import java.util.Scanner;
public class easytrailingfactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.print("Enter factor: ");
        int n = scan.nextInt();  // gets factorial
        int count=0; // count of zeros set to 0
        for(i=5;n/i>=1;i=5*i){ // searches and starts from 5 -> eg - 100/5 , 100/25, 100/125 and i = 5*1 = 5,25,125... 
            count += n/i; // count will be added -> 100/ 5 = 20(zeros) 100/25 = 4(zeros) , 100/125 = 0(not possible as 125>100)
        }                 // so 20 + 4 =  100! has 24 zeros in the end
        System.out.println(count);
    }
}
