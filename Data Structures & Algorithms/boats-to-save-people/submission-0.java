class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int left = 0, right = people.length - 1;
        while(left <= right ){
            if(people[right] + people[left] <= limit){
                left++;
            }
            right--;
            cnt++;
        }

        return cnt;
    }
}