import java.util.Scanner;
public class Prg_Practice09{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int age;
        age = scan.nextInt();
        if(age>=18){
            System.out.println("Major");
        }
        else{
            System.out.println("Minor");
        }
    }
}