public class diag {
    public static void main(String[] args) {
        int[][] arr = {
                      {3,3,0,0},
                      {0,3,0,0},
                      {0,0,1,0},
                      {0,0,0,2}
                    };
                    int count=1;

          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i][j]!=0){
                    count=0;
                }
            }
          }
          if(count==1){
            System.out.println("The given matrix is diagonal matrix");
          }   
          else{
            System.out.println("The given matrix is not a diagonal matrix");
          }       
    }
}
