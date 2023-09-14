 public class User_Defined02_{
    public static void main(String[]args){
         int dec[]={4,6,2,3,8,10};
         int dec1[] = decending(dec);
         for(int i = 0 ;i<dec1.length;i++){
         System.out.print(dec1[i]);
         }

    }
    public static int[] decending(int [] nums){
        int a = 0;
        for(int i = 0 ;i<nums.length;i++){
            for( int j = i+1;j<nums.length;j++){
                if(nums[i] < nums [j]){
                 a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
                }
            }
        }
        return nums;
    }
}