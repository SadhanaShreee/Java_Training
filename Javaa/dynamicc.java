import java.util.ArrayList;


public class dynamicc {
    public static void main(String[] args) {
        
    int [] staticArr = {2,4,5,6,7,8,9};
    ArrayList<Integer> dynamicArr = new ArrayList<>();
    for(int val : staticArr){
        dynamicArr.add(val);
    }
    dynamicArr.add(20);
    dynamicArr.add(34);
    dynamicArr.remove(2);

    int e = dynamicArr.get(5);
    System.out.println("Element at index 5 is: "+e);
    int sizearr = dynamicArr.size();
    System.out.println("The size of dynamic Array : "+sizearr);
    System.out.print("The final elements in the dynamic Array:[ ");
    for(int val : dynamicArr){
        System.out.print(val+" ");

    }
    System.out.print("]");
    
    }

}
