import java.util.Scanner;
public class Practice023{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a ;
        int b;
        a = scan.nextInt();
        b = scan.nextInt();
        if(a>b){
            System.out.println("first number is Greater than Second number");
        }
        else{
            System.out.println("Second number is Greater than First number");
        }

        int c ;
        c = scan.nextInt();
        if(c%4==0){
            System.out.println("Leap Year!!");
        }
        else{
            System.out.println("Common Year!!");
        }
    }
}