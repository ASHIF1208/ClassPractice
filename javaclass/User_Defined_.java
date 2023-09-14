import java.util.*;
public class User_Defined_{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        num1= scan.nextInt();
        num2= scan.nextInt();
        System.out.println(num(num1,num2));

    }
    public static int num(int num1,int num2){
        return num1+num2;
    }
}