import java.util.Scanner; //19-06-2023
public class scan{
    public static void main(String[]args){

        Scanner scann = new Scanner(System.in);

        String  sc ; 
        int a ;
        float f ;
        long l ;
        double d ;
        Boolean B ;
        Short c;
        Byte by;

       
        System.out.print("Enter String:");
        sc = scann.nextLine();
        System.out.print("Enter Int:");
        a = scann.nextInt();
        System.out.print("Enter Float:");
        f = scann.nextFloat();
        System.out.print("Enter long:");
        l = scann.nextLong();
        System.out.print("Enter double:");
        d = scann.nextDouble();
        System.out.print("Enter Booalean:");
        B = scann.nextBoolean();
        System.out.print("Enter Short:");
        c = scann.nextShort();
        System.out.print("Enter Byte:");
        by = scann.nextByte();
         
        }
}