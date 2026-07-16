class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for(Integer x : nums){
            if(x != val){
                list.add(x);
            }
        }

        for(int i = 0; i< list.size(); i++){
            nums[i] = list.get(i);
        }
        
        return list.size();
    }
}