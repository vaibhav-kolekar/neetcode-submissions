class Solution {
    public int mySqrt(int x) {
        int lp = 0, rp = x, res = 0;
        while(lp <= rp){
            int mid = lp + (rp - lp)/2;
            if((long)mid * mid == x){
                return mid;
            }
            if((long)mid * mid > x){
                rp = mid-1;
            }else{
                lp = mid + 1;
                res = mid;
            }
        }

        return res;
    }
}