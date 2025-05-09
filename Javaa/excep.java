import java.util.Scanner;
public class excep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1 \n Enter n2");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        try{
            int div = n1/n2;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println("Dont divide by zero!!");
        }
        finally{
            System.out.println("All code executed!!!");
        }
    }
}
