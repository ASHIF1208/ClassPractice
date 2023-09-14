import java.util.Scanner;
public class Rough05{
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter Yuor Age:  ");
        int age = scan.nextInt();

        if (age>18 && age<60){
            System.out.print("Your Major..");
        }
        else if (age<18){
            System.out.print("Your Minor..");
        }
        else{
            System.out.print("Your Senior citizen..");
        }
    }
}
