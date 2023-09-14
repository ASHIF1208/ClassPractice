import java.util.Scanner; //26-06-2023
public class Switchstatement01{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String Sum;
        int num1,num2;

        System.out.println("Calculated (Add,Sub,Mul,Div,Mod): ");
        Sum = scan.nextLine();

        switch (Sum){
            case "Add":
            System.out.println("Enter first value: ");
            num1= scan.nextInt();
            System.out.println("Enter Second value: ");
            num2= scan.nextInt();
            System.out.println("Solution of two values is : "+(num1+num2));
            break;
            case "Sub":
            System.out.println("Enter first value: ");
            num1 = scan.nextInt();
            System.out.println("Enter Second value: ");
            num2 = scan.nextInt();
            System.out.println("Solution of two values is : "+(num1-num2));
            break;
            case "Mul" :
            System.out.println("Enter first value: ");
            num1 = scan.nextInt();
            System.out.println("Enter Second value: ");
            num2 = scan.nextInt();
            System.out.println("Solution of two values is : "+(num1*num2));
            break;
            case "Div" :
            System.out.println("Enter first value: ");
            num1 = scan.nextInt();
            System.out.println("Enter Second value: ");
            num2 = scan.nextInt();
            System.out.println("Solution of two values is : "+(num1/num2));
            break;
            case "Mod" :
            System.out.println("Enter first value: ");
            num1 = scan.nextInt();
            System.out.println("Enter Second value: ");
            num2 = scan.nextInt();
            System.out.println("Solution of two values is : "+(num1%num2));
            break;
            default:
                System.out.println("ERROR ERROR");
        }
    }
}