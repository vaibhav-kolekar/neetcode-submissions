class Solution {
    public int search(int[] nums, int target) {
        int lp = 0, rp = nums.length - 1;
        while(lp <= rp){
            int mid= lp + (rp - lp)/2;
            if(nums[mid] == target){
                return mid;
            }if (nums[lp] <= nums[mid]) {
                if (target > nums[mid] || target < nums[lp]) {
                    lp = mid + 1;
                } else {
                    rp = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums [rp]) {
                    rp = mid - 1;
                } else {
                    lp = mid + 1;
                }
            }
        }

        return -1;
    }
}
