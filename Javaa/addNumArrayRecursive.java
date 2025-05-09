public class addNumArrayRecursive {
    public static int sumArray(int [] arr,int n){
        if(n==arr.length){
            return 0;
        }
        return arr[n] + sumArray(arr,n+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,7,8};
        System.out.println("The sum of array elements: "+sumArray(arr,0));
    }
}
