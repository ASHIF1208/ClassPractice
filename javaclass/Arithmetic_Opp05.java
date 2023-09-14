public class Arithmetic_Opp05{
    public static void main(String[]args){
        int num = 765;
        
        int d  = num%10; 
        int d1 = num/10%10;
        int d2 = num/100;
        int num1 = d*100+(d1*10+d2);

        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        //System.out.println();
        
System.out.println(num1);

    }
}