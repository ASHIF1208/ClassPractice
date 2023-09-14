public class For_Loopnest04{
    public static void main(String[]args){
        int num = 5;
        for(int i=num;i>=0;i--){
             char alp = 'Z';
         for(int j=num;j>=1;j--){
             System.out.print(alp);
             alp--;
         }
        System.out.println();
        }

    }
}