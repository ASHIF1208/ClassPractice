public class Array24_Rotate{
    public static void main(String[]args){
        int nums[]={1,2,3,4,5,6,7};
        int k = 3;
        int len = nums.length;
        int num[]= new int [len];
        int j = 0;
        for(int i=0;i<len;i++){
            if(i<k){
                num[i]=nums[len-k+i];
            }
            else{
                num[i]=nums[j];
                j++;
            }
            System.out.print(num[i]);
        }
        
    }
}