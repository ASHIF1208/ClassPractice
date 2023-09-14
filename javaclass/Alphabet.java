import java.util.Scanner;
public class Alphabet{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        char a ;
        a = scan.next().charAt(0);

        if ( (a>= '0') && (a<'9')){
            System.out.println("This is a Number");
        }
        else if ((a>='a'&&a<= 'z' )|| (a>='A'&&a<='Z')){
            System.out.println("This is a Alphabet");
        }
        else{
            System.out.println("This is a Special Character");
        }
    }
}