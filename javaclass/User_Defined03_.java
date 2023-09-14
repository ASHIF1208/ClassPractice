public class User_Defined03_{
    public static void main(String[]args){
        char board[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        int len = board.length;
        for(int i=0;i<len;i++){
            System.out.print("|\t");
            for(int j=0;j<len;j++){
                System.out.print(board[i][j]+"\t|\t");
                //System.out.print(board[j]);
            }
            System.out.println("\n");
        }
    }
}