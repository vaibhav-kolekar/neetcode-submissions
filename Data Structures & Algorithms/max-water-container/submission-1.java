class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int min = Math.min(heights[left], heights[right]);
            int w = min * (right - left);
            max = Math.max(w, max);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}
