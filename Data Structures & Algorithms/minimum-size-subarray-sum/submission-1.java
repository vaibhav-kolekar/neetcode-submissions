class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j< nums.length; j++){
                sum = sum + nums[j];
                if(sum >= target){
                    int len = j-i + 1;
                    minLen = Math.min(len, minLen);
                }
            }
        }
        if(minLen < Integer.MAX_VALUE){
            return minLen;
        }

        return 0;
    }
}