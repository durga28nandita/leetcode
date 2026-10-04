class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int rm=height[r];
        int lm=height[0];
        int w=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(lm<height[l])
                {
                    lm=height[l];
                }
                else
                {
                    w+=(lm-height[l]);
                }
                l++;
            }
            else
            {
                if(rm<height[r])
                {
                    rm=height[r];
                }
                else
                {
                    w+=(rm-height[r]);
                }
                r--;
            }
        }
        return w;
        
    }
}