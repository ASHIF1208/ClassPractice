import java.util.*;
public class arr112{
    public static void main(String []args){
        int num1[]={1,2,3,4 };
        int num2[]={5,6,7,8,9};
        int num3[]=Arrays.copyOf(num1num2,(num1.length+num2.length));
        //int num4[]=Arrays.copyOf(num2,num2.length);

        for(int i=0;i<num3.length;i++){
            System.out.print(num3[i]);
            
        }
        // for(int i=0;i<num4.length;i++){
        //     System.out.print(num4[i]);
        // }
    }
}