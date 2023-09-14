public class Array17_2D{
    public static void main(String[]args){
        int num[][]={{2,4,6},{8,10,12},{14,16,18}};
        for(int i=0;i<num.length;i++){
            for(int j=num[0].length-1;j>=0;j--){
                System.out.print(num[i][j]+"   ");
            }
             System.out.println();
        }
    }
}