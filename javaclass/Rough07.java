public class Rough07{
    public static void main(String[]args){
       int solution =Increment(10);
       System.out.println(solution);
       int solution1 = Decrement(10);
       System.out.println(solution1);
    }
    public static int Increment(int num){
        ++num;
        return num;
    }
    public static int Decrement(int num1){
        --num1;
        return num1;
    }
}