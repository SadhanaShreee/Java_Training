public class sortedArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 24;
        arr[4] = 63;
        


        int n=5;
        int i;
        int newele = 53;
        for(i=n-1;i>=0 && arr[i]>newele;i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = newele;
        n++;

        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
