class Solution {
    public static int atmost(int[]nums,int k)
    {
        if(k<0) return 0;
        int l=0;
        int r=0;
        int count=0;
        int s=0;
        for(r=0;r<nums.length;r++)
        {
            if(nums[r]%2!=0)
            {
                //odd numbers check
                s++;
            }
            //shrink window for the left
            while(s>k)
            {
                if(nums[l]%2!=0)
                {
                    s--;
                }
                l++;//move left  pointer
            }
            count+=r-l+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);

    }
}