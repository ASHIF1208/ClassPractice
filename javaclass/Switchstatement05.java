import java.util.Scanner;
public class Switchstatement05{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter your Name : ");
        name = scan.nextLine();
        switch(name){
            case "ASHIF":
                System.out.println("Hai!"+name);
                System.out.println("You're a Recent Graduated.");
                System.out.println("Hindusthan College..");
                System.out.println("Coimbatore. ");
                break;
                case "SARAVANAN":
                    System.out.println("Hai!"+name);
                    System.out.println("You're a Recent Graduated.");
                    System.out.println("RVS College..");
                    System.out.println("SULUR. ");
                    break;
                    case "VISHNU":
                        System.out.println("Hai!"+name);
                        System.out.println("You're a Recent Graduated.");
                        System.out.println("RVS College..");
                        System.out.println("SULUR.  ");
                        break;
                        case "JALAL":
                            System.out.println("Hai!"+name);
                            System.out.println("You're a Recent Graduated.");
                            System.out.println("NANDHA College..");
                            System.out.println("Erode");
                            break;
                            default:
                                System.out.println("Your name is not in list!...");
                                break;
        }
    }
}