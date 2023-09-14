import java.util.Scanner; //22-06-2023
public class Assign_Opp{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a+=b);
        c = scan.nextInt();
        System.out.println(a-=c);
        d = scan.nextInt();
        System.out.println(a*=d);
        e = scan.nextInt();
        System.out.println(a/=e);
        f = scan.nextInt();
        System.out.println(a%=f);

        System.out.println(a);




    }
}