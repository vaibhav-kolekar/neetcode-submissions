class Solution {
    public int searchInsert(int[] nums, int target) {
        int lp = 0, rp = nums.length - 1;
        while(lp <= rp){
            int mid = lp + (rp - lp ) /2;
            if(nums[mid] >= target){
                rp = mid -1;
            }else{
                lp = mid + 1;
            }
        }

        return lp;
    }
}