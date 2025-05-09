import java.util.Scanner;
public class complementBit {
    public static int checkComplement(int num){
        int temp=num;
        int mask = 0;

        while(temp!=0){
            mask = (mask<<1)|1;
            temp = temp >> 1;
        }
        return mask^num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int comp = checkComplement(num);
        System.out.println("The complement of "+num+" is "+comp);
    }
}
