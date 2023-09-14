import java.util.Scanner;
public class For_Loop03{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num ;
        System.out.println("Enter Number: ");
        num = scan.nextInt();
        for(int i = 1 ; i <= 15 ; i++){
            System.out.println(i +"*" +num+ "=" +(i*num));
        }
            
    }
}