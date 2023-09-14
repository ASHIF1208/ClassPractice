public class Search_Insert_Position035{
    public int searchInsert() {
        int[] nums={1,3,4,5};
        int target = 5;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left; 
         
    }
    
}
