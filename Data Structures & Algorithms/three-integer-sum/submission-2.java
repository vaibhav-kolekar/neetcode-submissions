class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i< nums.length - 2; i++){
            for(int j = i+1; j<nums.length; j++){
                int tmp = -nums[i] - nums[j];
                List<Integer>tmpList = new ArrayList<>();
                if(map.containsKey(tmp) && map.get(tmp) != i && map.get(tmp) != j){
                    tmpList.add(nums[i]);
                    tmpList.add(nums[j]);
                    tmpList.add(tmp);
                    Collections.sort(tmpList);
                    res.add(tmpList);
                }
            }
        }

        return new ArrayList<>(res);
    }
}
