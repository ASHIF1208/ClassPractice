import java.util.Scanner;
public class Numbers{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();

        if (a>0){
            System.out.println("It is Possitive Number");
        }
        if (a<0){
            System.out.println("It is Negative Number");
        }
    }
}