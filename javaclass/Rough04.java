import java.util.Scanner;
public class Rough04{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int h = 33;

        float area = (b*h)/2f;
        int peri = a+b+c;
        System.out.println(area+"\t"+peri);
    }
}