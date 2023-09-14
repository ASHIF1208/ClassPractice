import java.util.Scanner;
public class Prg_Practice10{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        a = scan.nextInt();
        b = scan.nextInt();
        if(a>b){
            System.out.println("first value is greater..");
        }
        else if (a==b){
            System.out.println("Those are same value..");
        }
        else{
            System.out.println("second value is greater..");
        }
    }
}