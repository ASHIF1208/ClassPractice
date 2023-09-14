import java.util.Scanner;
public class Prg_Practice15{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if (a>b && a>c){
            System.out.println("A is First Greater value..");
            if(b>c){
                System.out.println("B is Second Greater value..");
                System.out.println("C is Smaller value..");
            }
            else{
                System.out.println("C is Second Greater value..");
                System.out.println("B is Smaller value..");
            }
        }
        else if (b>c && b>a){
            System.out.println("B is First Greater value..");
            if(c>a){
                System.out.println("C is Second Greater value..");
                System.out.println("A is Smaller value..");
            }
            else{
                System.out.println("A is Second Greater value..");
                System.out.println("C is Smaller value..");
            }
        }
        else if (c>a && c>b){
            System.out.println("C is First Greater value..");
            if(a>b){
                System.out.println("A is Second Greater value..");
                System.out.println("B is Smaller value..");
            }
            else{
                System.out.println("B is Second Greater value..");
                System.out.println("A is Smaller value..");
            }
        }
        else{
            System.out.println("ERROR.. ERROR..");
        }
    }
}