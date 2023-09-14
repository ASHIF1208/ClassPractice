import java.util.Scanner;
public class Prg_Practice07{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}