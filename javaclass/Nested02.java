import java.util.Scanner;//24-06-2023
public class Nested02{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            int a,b;
            String act;
            System.out.println("Calculated Add,Sub,Mul:" );
            act="Add";
            System.out.println("First value: ");
            a=scan.nextInt();
            System.out.println("Second value: ");
            b=scan.nextInt();
            

            if(act=="Add"){
                    System.out.print("Solution is: "+(a+b));
            }
            else if(act=="Sub"){
                System.out.println("Solution is: "+ (a-b));
            }
            else {
                System.out.println("Solution is: "+ (a*b));
            }
        }
    }
