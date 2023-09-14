import java.util.*;
public class User_Defined06_{
    public static void main(String[]args){
        int arr[]={43,75,98,43,65,768,90886,4434};
        int value = 65;
        int index = search(arr, value);
        System.out.println(index);
    }
    public static int search(int num[],int val){
        Arrays.sort(num);
        for(int a:num){
            System.out.println(a);
        }
        int i = Arrays.binarySearch(num,val);
        return i;
    }
}