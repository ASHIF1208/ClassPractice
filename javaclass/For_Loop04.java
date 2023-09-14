import java.util.Scanner;
public class For_Loop04{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        for (int i= 1; i<= (a); i++){
            for(int j=0;j<a;j++){           
                System.out.print("*");
            } 
         System.out.println();
        }           
        }       
    }
