import java.util.*;
public class User_Defined05_{
    public static Scanner scan = new Scanner(System.in);
    public static char board[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    public static void main(String[]args){
        for(int i =0;i<9;i++){
        Move();
        }

    }
    public static void Move(){
        int num = scan .nextInt();
        switch(num){
            case 1:
                board[0][0]= '1';
                display();
                break;
            case 2:
                board[0][1] = '2';
                display();
                break;
            case 3:
                board[0][2] = '3';
                display();
                break;
            case 4:
                board[1][0]= '4';
                display();
                break;
            case 5:
                board[1][1] = '5';
                display();
                break;
            case 6:
                board[1][2] = '6';
                display();
                break;
            case 7:
                board[2][0]= '7';
                display();
                break;
            case 8:
                board[2][1] = '8';
                display();
                break;
            case 9:
                board[2][2] = '9';
                display();
                break;

        }
    }

    public static void display(){
        for(int i=0;i<board.length;i++){
            System.out.print("|\t");
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"|\t");
            }
            System.out.println();
        }
    }
}
    