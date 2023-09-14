import java.util.Scanner;
public class Values{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter first value:  ");
        a = scan.nextInt();
        System.out.print("Enter second value:  ");
        b = scan.nextInt();
        System.out.print("Enter third value: ");
        c = scan.nextInt();

        if (a>b && a>c){
            System.out.print("First value is Greater");
        }
        else if(b>a && b>c){
            System.out.print("Second value is Greater");
        }
        else{
            System.out.println("Third value is Greater");
        }
    }
}