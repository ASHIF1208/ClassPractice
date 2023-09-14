public class For_Loopnest07{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
           
            for(int j=5*2;j>=i*2;j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}