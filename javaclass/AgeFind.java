import java.util.Scanner;//22-06-2023
public class AgeFind{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a ;
        System.out.print("Enter Your Age:");
        a = scan.nextInt();
        if(a>=18){
            System.out.println("Your a Major");
        }
        else{
            System.out.println("Your a Minor");
        }
    }
}