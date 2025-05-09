import java.util.Scanner;
public class parantheses {
    public static void generateParantheses(String cur , int op,int cl,int n){
        if(cur.length()==2*n){
            System.out.println(cur);
            return;
        }
        if(op<n){
            generateParantheses(cur + "{", op+1, cl, n);
        }
        if(cl<op){
            generateParantheses(cur + "}", op, cl+1, n);

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter - ");
        int n = scan.nextInt();
        generateParantheses("",0,0,n);

    }
}