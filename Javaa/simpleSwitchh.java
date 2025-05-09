import java.util.Scanner;
public class simpleSwitchh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = scan.nextInt();

        switch(n){
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("THursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
            default:
              System.out.println("Enter valid number...No such day");
        }
    }
}
