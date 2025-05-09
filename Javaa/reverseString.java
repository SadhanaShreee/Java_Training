import java.util.Scanner;
public class reverseString {
    public static String reversal(String str){
        if(str.isEmpty()){
            return str;
        }
        return reversal(str.substring(1)) +str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine();

        String output = reversal(str);
        System.out.println("String after reversing -> "+output);
    }
}
