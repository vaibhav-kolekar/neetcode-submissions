class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0, j = nums.length - 1;
        int []res = new int[2];
        Arrays.fill(res, 1);
        while(i<j){
            if(nums[i] + nums[j] == target){
                res[0] = i+1;
                res[1] = j+1;

                return res;
            }
            if(nums[i] + nums[j] > target){
                j = j-1;
            }
            if(nums[i] + nums[j] < target){
                i = i+1;
            }
        }

        return res;
    }
}
