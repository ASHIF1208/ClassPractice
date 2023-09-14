public class Array14_Pattern{
    public static void main(String[]args){
        int count = 10;
        for(int i=1;i<=count;i++){
            for(int j=1;j<=count;j++){
                if(i==1||i==count||j==1||j==count){
                   System.out.print("* "); 
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}