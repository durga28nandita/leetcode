class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;;
        int s=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            s+=nums[r];
            while(s>=target)
            {
                min=Math.min(r-l+1,min);
                s-=nums[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}