import java.util.Scanner;
public class numberofOnes {
    public static int numberOfOnesBit(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){ // if n = 13 -> 1101 if we do & 1 -> 1101 & 0001 aWhich gives -> 0001 so count = 1
                count++;  // then we do right shift of 1101 -> 110 -> 0110 & 0001 -> 0000 so count = 0 and so on
            }
            n = n>>1; 
        }
        return count; // in the end we have only 2 1s(if input = 5)
    }
     

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = scan.nextInt();

        int res = numberOfOnesBit(n);
        System.out.println("The number of 1s in "+n+ ": "+res);
    }
}
