import java.util.Scanner;
public class Prg_Practice18{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String sum;
        System.out.println("Enter Calculate method: ");
       sum=scan.nextLine();
        if (sum.equals("add")){
            int a,b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a+b);
        }
        else if (sum.equals("Sub")){
            int a,b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a-b);
        }
        else if (sum.equals("Mul")){
            int a,b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a*b);
        }
        else if (sum.equals("Div")){
            int a,b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a/b);
        }
        else if (sum.equals("Mod")){
            int a,b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a%b);
        }
        else{
            System.out.println("ERROR");
        }
    }
}