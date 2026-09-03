class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int m = 0;
    
        while(left <= right){

            int mid = left + (right-left)/2;
             m = mid;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        if(nums[m] < target){
            return m + 1;
        }

        return m;
    }
}