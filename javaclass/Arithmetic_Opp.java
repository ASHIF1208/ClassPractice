public class Arithmetic_Opp{
    public static void main(String[]args){
        int a = 10;
        float b = 77.06f;

        float sum = a+b;
        float sum1 = a*b;
        float sum2 = a-b;
        float sum3 = a/b;
        float sum4 = a%b;


        System.out.println( sum+" "+sum1+" "+sum2+" "+sum3+" "+sum4);
        System.out.println(sum + sum1 - (sum2/sum3) * sum4);
        

    }
}