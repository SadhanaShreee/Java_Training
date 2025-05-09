public class Queens { // we use backtracking & brute force method
    static int N = 4;
    static int solCount=0;
    public static void main(String[] args) {
        char board [] [] = new char[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j] = '0';
            }
        }
        solving(board,0);
    }
    public static void solving(char board[][],int row){
        if(row==N){
            solCount++;
            System.out.println("Solution "+solCount+": ");
            printIt(board);
            System.out.println();
            return;
        }
        for(int col = 0;col<N;col++){
            if(checkingg(board,row,col)){
                board[row][col] = 'Q';
                solving(board,row+1);
                board[row][col] = '0';

            }
        }
    }
        public static boolean checkingg (char board[][], int row,int col){
            for(int i=0;i<row;i++){
                if(board[i][col]=='Q')
                return false;
            }
            for(int i=row-1,j =col-1 ; i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q')
                return false;
            }
            for(int i=row-1,j=col+1;i>=0 &&j<N;i--,j++){
                if(board[i][j]=='Q')
                return false;
            }
            return true;
        }
        public static void printIt(char board[][]){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
    }
}
