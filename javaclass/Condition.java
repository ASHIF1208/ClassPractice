import java.util.Scanner;//22-06-2023
public class Condition{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if (a==1){
            System.out.println("SUNDAY");
        }
        if (a==2){
            System.out.println("MONDAY");
        }
        if (a==3){
            System.out.println("TUESDAY");
        }
        if (a==4){
            System.out.println("WEDNESDAY");
        }
        if (a==5){
            System.out.println("THURSDAY");
        }
        if (a==6){
            System.out.println("FRIDAY");
        }
        if (a==7){
            System.out.println("SATURDAY");
        }
    }
}