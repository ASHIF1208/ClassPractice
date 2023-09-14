 import java.util.*;//26-06-2023
public class Switchstatement02{
    public static void main(String[]args){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        num = scan.nextInt();
        int st=num%2;           
       

        switch(st){
            case 0:
             System.out.println("Even Number..");
            if(num%4==0){
                System.out.println("This NUmber is Multiplied by 4...");
            }
            else{
                System.out.println("This number is not Multiplied by 4..");
            }
            break;

            case 1:
                System.out.println("Odd Number..");
            //System.out.println("Odd Number..");
            if(num%3==0){
                System.out.println("This number is Multiplied by 3...");
            }
            else{
                System.out.println("This number is not Multiplied by 3...");
            }
            break;

            default:
                System.out.println("ERROR ERROR");
        }
    }
}