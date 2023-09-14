import java.util.*;
public class RoughCode{
    public static void main(String[]args){
        // int [] arr = {1,2,3,4,5};
        // //swap(arr);
        // System.out.println(Arrays.toString(arr));
        int a = 5;
        int b = 20;
        swap(a,b);
        System.out.println(a);
    }
    public static void swap(int a ,int b){
        // int b = a[0];
        // a[0] = a[a.length-1];
        // a[a.length-1] = b;
        a += b ;
    }
}