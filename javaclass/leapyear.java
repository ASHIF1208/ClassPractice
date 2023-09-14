import java.util.Scanner;//22-06-2023
public class leapyear{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            int a;
            System.out.print("Enter Year: ");
            a = scan.nextInt();

            if(a%4==0){
                System.out.println("LEAP YEAR");

            }
            else{
                System.out.println("Non-Leap Year");
            }

        
    }
}