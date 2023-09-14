import java.util.Scanner;
public class logical_opp{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greater ");
        }
        else if(b>a&&b>c){
            System.out.println("B is greater ");
        }
        else{
            System.out.println("C is greater ");
        }
    }
}