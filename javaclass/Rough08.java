import java.util.Scanner;
public class Rough08{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        int num = scan.nextInt();

        String result = (num < 0 )? "negative" : "positive";
        System.out.println("The number is " + result);

        String result1 = (num %2== 0 )? "even" : "odd";
        System.out.println("The number is " + result1);
    }
}