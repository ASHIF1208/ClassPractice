import java.util.Scanner;
public class Rough06{
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter char:  ");
        char cha = scan.next().charAt(0);

        if (cha == 'a'||cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'){
            System.out.print("Vowels");
        }
        else if (cha == 'A'||cha == 'E' || cha == 'I' || cha == 'O' || cha == 'U'){
            System.out.print("Vowels");
        }
        else{
            System.out.print("Consonants");
        }
    }
}
