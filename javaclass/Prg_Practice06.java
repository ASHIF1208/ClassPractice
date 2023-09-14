import java.util.Scanner;
public class Prg_Practice06{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        float amount ;
        amount = scan.nextFloat();
        float percentage = (amount/100)*3;

        double profit = percentage*5+amount;

        System.out.println("5yrs Profit is: "+profit);
    }
}