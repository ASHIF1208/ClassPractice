import java.util.Scanner;
public class Prg_Practice16{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        char str;
        str = scan.next().charAt(0);

        if( str >= 'a' && str<= 'z' || str >= 'A' && str <='Z'){
            System.out.println("ALPHABET");
        }
        else if(str>='0' && str<='9'){
            System.out.println("NUMBERS");
        }
        else{
            System.out.println("SPECIAL CHARACTERS");
        }
    }
}