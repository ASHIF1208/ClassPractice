public class Array07{
    public static void main(String[]args){
        int num1[]={4,8,12,16,20};
        int len1=num1.length;
        int num2[]={5,10,15,20,25};
        int len2=num2.length;
        int num3[]= new int[len1+len2];
        int len3 = num3.length;
        int j=0;
        for(int i=0;i<len3;i++){
            if(len1>i){
                    num3[i]=num1[i];
            }
            else{
                num3[i]=num2[j];
                j++;
            }
        }
        for(int i =0;i<len3;i++){
            System.out.print(num3[i]);
        }
    }
}