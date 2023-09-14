import java.util.Scanner;
public class Rough09{
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Gender: ");
    String gender = scan.nextLine();
    gender = gender.toLowerCase();
    if(gender.contains("male") && !gender.contains("female")){
        System.out.println("Enter Mark: ");
        int mark = scan.nextInt();
        if(mark>=70){
            System.out.println("Your Application is Ready!..");
        }
        else{
            System.out.println("Sorry!..Your Mark is not eligible..");
        }
    }
    else{
        System.out.println("Sorry!..This is male college..");
    }
}
}
