import java.util.Scanner;

public class powerTwo {
    public static boolean pot(int n){
        return (n>0 && (n & (n-1))==0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number here : ");
        int number = scan.nextInt();

        if(pot(number)){
            System.out.println(number+" is a power of 2");
        }else{
            System.out.println(number+" is not a power of 2");
        }

    }
}
//leetcode 231