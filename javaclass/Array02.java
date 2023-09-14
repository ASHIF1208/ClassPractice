public class Array02{
    public static void main(String[]args){
        int num[]={2,4,6,8,10,12,14,16,18,20};
        int len = num.length;
        for(int i=0;i<=len-1;i++){
        System.out.println(num[i]);
        }
        for(int i=len-1;i>=0;i--){
        System.out.println(num[i]);
        }
    }
}