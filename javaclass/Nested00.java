public class nested{
    public static void main(String [] args){
        int a=10;
        if(a%2==0){
            System.out.println("The given number  is even");
            if(a%4==0){
                System.out.println("The number is also divided by 4");
            }
            else if(a==10){
                       System.out.println("The number is 10");
            }
            else{
              System.out.println("The number is not divided by 4");  
            }

        }
        else{
            System.out.println("The given number  is odd");
              if(a%3==0){
                System.out.println("The number is also divided by 3");
            }
            else{
              System.out.println("The number is not divided by 3");  
            }

        }
    }
}