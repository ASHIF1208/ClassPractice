import java.util.Scanner;//22-06-2023
public class Homework{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        
        a = scan.nextInt();
        if(a%3==0){
            System.out.println("Yes,this number is multiplied by 3");
        }
        else{
            System.out.println("No,this number is not multiplied by 3");
        }
        int b;
        int c;
        b = scan.nextInt();
        c = scan.nextInt();
        if(b%c==1){
            System.out.println("Reminder is 1");
        }
        else{
            System.out.println("Reminder is 0");
        }
    }
}