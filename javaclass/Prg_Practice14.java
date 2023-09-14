import java.util.Scanner;
public class Prg_Practice14{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int age;
        age = scan.nextInt();
        if (age>=18 && age < 60){
            System.out.println("Major");
        }
        else if(age<18){
            System.out.println("Minor");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
}