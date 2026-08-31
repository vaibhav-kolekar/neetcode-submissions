class Solution {
    public int findMin(int[] nums) {
        int lp = 0, rp = nums.length - 1, min = -1, res = Integer.MAX_VALUE;
        while(lp <= rp){
            int mid = lp + (rp - lp) / 2;
            min = nums[mid];
            res= Math.min(min, res);
            if(nums[mid] > nums[rp]){
                lp = mid + 1;
            }else{
                rp = mid - 1;
            }
        }

        return res;
    }
}
