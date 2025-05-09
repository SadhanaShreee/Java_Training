import java.util.Scanner;
public class arrayincdec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrays = {1,5,21,9,63};
        int count=0;

        for(int i=0;i<arrays.length-1;i++){
            if(arrays[i]>arrays[i+1]){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Array is not in increasing order");
        }
        else{
            System.out.println("Array is sorted!!");
        }
    }
}
