import java.util.Scanner; //26-06-2023
public class Switchstatement02{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str ;
        System.out.println("Enter Gender : ");
        str=scan.nextLine();

        switch(str){
            case "M":
            case "m":
            System.out.println("Male");
            break;
            case "F":
            case "f":
            System.out.println("Female");
            break;
            default:
                System.out.println("null");


        }
    }
}