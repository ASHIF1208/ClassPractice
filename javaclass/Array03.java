public class Array03{
    public static void main(String[]args){
        int num []={1,2,3,4,5,6,7,8,9,10,10,6,7};
        int len = num.length;
        int a = 0;
        for(int i = 0;i<len;i++){
          a+=num[i];
          //System.out.println(a);
        }
        System.out.print(a);
    }
}