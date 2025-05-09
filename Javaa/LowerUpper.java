public class LowerUpper {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {7,4,5},
                       {6,9,3}};

        System.out.println("Original Matrix\n");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nLower Triangle");{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(j<=i){
                        System.out.print(arr[i][j]+ " ");
                    }
                }
                    System.out.println();

            }
            System.out.println("\nUpper Triangle");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(j>=i){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
