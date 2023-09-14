import java.util.Scanner;
public class ifstatement{//22-06-2023
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
         a =  scan.nextInt();
         b = scan.nextInt();
         
         if (a>b){
            System.out.println("A is Greater than B");
         }
         if (a<b){
            System.out.println("A is Smaller than B");
         }
         if (a==b){
            System.out.println("A and B is Same");
         }
    }
}