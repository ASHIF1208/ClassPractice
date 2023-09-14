import java.util.Scanner;//22-06-2023
public class Odd_Even{
    public static void main(String[]arge){
    Scanner scan = new Scanner(System.in);
    int a;
    a = scan.nextInt();
    if (a%2==0){
        System.out.println("Even Number");
    }
    else {
        System.out.println("Odd Number");
    }
}
}