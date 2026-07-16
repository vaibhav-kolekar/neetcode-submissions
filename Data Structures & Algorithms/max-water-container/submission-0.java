class Solution {
    public int maxArea(int[] h) {
        int lp = 0, rp = h.length - 1;
        int MAXW = Integer.MIN_VALUE;
        while(lp < rp){
            int min = Math.min(h[lp], h[rp]);
            int w = rp-lp;
            int water_storage = min * w;
            MAXW = Math.max(MAXW, water_storage);
            if(h[lp] < h[rp]){
                lp ++;
            }else{
                rp--;
            }
        }
        return MAXW;
    }
}
