import java.util.Scanner;
public class Prg_Practice08{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if(a>0){
            System.out.println("Possitive Number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}