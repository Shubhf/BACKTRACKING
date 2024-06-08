import java.util.*;
class Backtracking_3{
    public static boolean isSafe(char board[][],int row,int col){
  //vertical up
         for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
         }
       //left diagonal up
       for(int i=row-1,j=col-1;i>=1 && j>=1;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
       }
       //right diagoanl up
       for(int i=row-1,j=col+1;i>=1 && j>=1;i--,j++){
           if(board[i][j]=='Q'){
              return false;
        }
       }
      return true;
    }
    public static void printBoard(char board[][]){
        System.out.println(" ____________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void nQueens(char board[][],int row){

        if(row==board.length){
            printBoard(board);
            return;
        }
        
       for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
          board[row][j]='Q';
          nQueens(board,row+1);
          board[row][j]='X';
   
       } }
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }
}