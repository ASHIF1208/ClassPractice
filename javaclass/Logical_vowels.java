import java.util.Scanner;
public class Logical_vowels{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String Vowels="A";
       Vowels = scan.nextLine();
        if( Vowels== "a"|| Vowels=="e"|| Vowels== "i"|| Vowels== "o"|| Vowels=="u"){
            System.out.println("this words have Vowel");
        }
        else if(Vowels== "A"|| Vowels=="E"|| Vowels== "I"|| Vowels== "O"|| Vowels=="U"){
            System.out.println("this word have Vowels");
        }
        else{
            System.out.println("No Vowels");
        }
    }
}
