import java.util.Scanner;

public class cuberoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scan.nextInt();
        float cube = (float)Math.pow(num ,1.0/3.0);
        System.out.println(cube);

    }
}
