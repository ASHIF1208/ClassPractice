import java.util.Scanner;
public class Switchstatement04{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter your Name : ");
        name = scan.nextLine();

        switch(name){
            case "ASHIF":
                System.out.println("GOOD MORNING !..."+name);
                System.out.println("Have a Nice Day!...");
                break;
                case "SARAVANAN":
                    System.out.println("GOOD MORNING !..."+name);
                    System.out.println("Have a Nice Day!...");
                    break;
                    default:
                        System.out.println("Your Name is not in list");
                        break;
        }
    }
}