class Solution {
    public void sortColors(int[] nums) {
        int zero = 0,one = 0, two = 0;

        for(Integer x : nums){
            if(x == 0){
                zero ++;
            }else if(x == 1){
                one ++;
            }else{
                two ++;
            }
        }

        int j = 0, i = 0;
        while(i < zero){
            nums[j++] = 0;
            i++;
        }
        i = 0;
        while(i < one){
            nums[j++] = 1;
            i++;
        }
        i = 0;
        while(i < two){
            nums[j++] = 2;
            i++;
        }

        return;
    }
}