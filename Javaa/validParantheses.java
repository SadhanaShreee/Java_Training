import java.util.Scanner;
public class validParantheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String p = scan.nextLine();

        int count =0;
        boolean valid = true;
        for(int i=0;i< p.length();i++){
            char ch = p.charAt(i);

            if(ch == '{'){
                count++;
            }
            else if(ch == '}'){
                count--;

                if(count<0){
                    valid = false;
                }
            }
        }
        if(count!=0){
            valid = false;
        }
        System.out.println(valid);
    }
}
