class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];

            while(sum >= target){
                minLen = Math.min(minLen, i - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}