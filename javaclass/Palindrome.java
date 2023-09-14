public class Palindrome{
    public static void main(String[]args){
        int x = 1231;
        int a=x;
        int digit;
        long r = 0;
        for (;x!=0;x /=10){
        digit = x%10;
        r = r * 10 + digit ;
        
      }
      if(r<0){
        System.out.print(false);
      }
    else if(a==r){
        System.out.print(true);
      }
      else{
        System.out.print(false);
      }
    }
}