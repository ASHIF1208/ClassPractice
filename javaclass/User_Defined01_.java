import java.util.*;
public class User_Defined01_{
    public static void main(String[]args){
        System.out.println("Enter Count: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        num(count);
        int arr[]={1,2,3,56,7};
        System.out.println(arr);
        
        
    }
    public static void num(int num1){
        for(int i = 0;i<=num1;i++){
            for(int j = i;j<= num1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}