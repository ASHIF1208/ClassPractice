import java.util.Scanner;
public class Grade{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if(a>90 && a<100){
            System.out.println("A+ Grade");
        }
        else if (a>80 && a<90){
            System.out.println("A Grade");
        }
        else if (a>70 && a<80){
            System.out.println("B Grade");
        }
        else if (a>60 && a<70){
            System.out.println("C Grade");
        }
        else if(a>50 && a< 60){
            System.out.println("D Grade");
        }
        else {
            System.out.println("Fail");

        }
        
    }
}