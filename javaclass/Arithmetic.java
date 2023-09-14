import java.util.Scanner; //21-06-2023
public class Arithmetic{
    public static void main(String[]args){
        
        int n ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numbers(0-10):  ");
        n = scan.nextInt();

        System.out.println("Given number of Square value is:" +n*n);
    }
}