class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length * 2;
        int[] result = new int[x];

        for(int i = 0; i< nums.length; i++){
            result[i] = nums[i];
        }
        int j = 0;
        for(int i = nums.length; i< x; i++){
            result[i] = nums[j];
            j++;
        }

        return result;
    }
}