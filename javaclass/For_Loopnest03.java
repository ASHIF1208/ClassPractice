public class For_Loopnest03{
    public static void main(String[]args){
        int num=10;
        for(int i=1;i<=num;i++){
         char alp='A';
        for(int j=1;j<=i;j++){
            System.out.print(alp);
             alp++;  
        }
            System.out.println( );
       }
    }
}