class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for(int x : nums){
            set.add(x);
        }

        int [] arr = new int[set.size()];
        int a = 0;
        for(int x : set){
            arr[a++] = x;
        }
        int cnt = 1;
        int max_cnt = 0;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] - arr[i-1] == 1){
                cnt++;
            }else{
                max_cnt = Math.max(cnt, max_cnt);
                cnt = 1;
            }
        }

        return Math.max(cnt, max_cnt);
    }
}
