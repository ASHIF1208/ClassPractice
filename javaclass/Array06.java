public class Array06{
    public static void main(String[]args){
        int num[]={1,3,5,7,9};
        int num1[]={2,4,6,8,10};
        int len=num.length;
        int len1=num1.length;
        int num2[]=new int[len1+len];
        int len2= num2.length;
        int j=0;
        for(int i=0;i<len2;i++){
            if(len>i){
                num2[i]=num[i];
            }
            else{
                num2[i]=num1[j];
                j++;
            }
        }
        for(int i=0;i<len2;i++){
         
            System.out.print(num2[i]);
        }
        
    }
}