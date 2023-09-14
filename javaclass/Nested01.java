import java.util.Scanner;//24-06-2023
public class Nested01{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter A value: ");
        a=scan.nextInt();
        System.out.print("Enter B value: ");
        b=scan.nextInt();
        System.out.print("Enetr C value: ");
        c=scan.nextInt();

        if(a>b&&a>c){
            System.out.println(" A is a Greatest number...");
            if(b>c){
                System.out.println("B is a 2nd Greatest number...");
                System.out.println("C is a Smallest number...");
            }
            else{
                System.out.println("C is a 2nd Greatest number...");
                System.out.println("B is a Smallest number...");
            }
            
        }
        else if(b>a&&b>c){
            System.out.println("B is a Greatest number...");
            if(c>a){
                System.out.println("C is 2nd Greatest number..");
                System.out.println("A is a Smallest number...");

            }

            else{
                System.out.println("A is 2nd Greatest number...");
                System.out.println("C is a Smallest number...");
            }

        }

        else{
            System.out.println("C is a greatest number..");
            if (a>b){
                System.out.println("A is 2nd greatest number...");
                System.out.println("B is a Smallest number...");
            }
            else{
                System.out.println("B is 2nd greatest number...");
                System.out.println("A is a Smallest number...");
            }
            
        }
    }
}