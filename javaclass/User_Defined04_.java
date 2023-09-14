import java.util.*;
public class User_Defined04_. {
    public static  Scanner s=new Scanner (System.in);
    public static void main(String [] args){
 
        int arr[]=new int [10];
         for(int i=0;i<arr.length;i++){
             arr[i]=s.nextInt();
         }
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
         }
        sum();
    }
    public static void sum(){
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println(num1+num2);
    }
}