class Solution {
    public boolean canJump(int[] nums) {
        boolean f=false;
        if(nums.length<2)
        {
            return true;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==0)
            {
                f=false;
                int j=i-1;
                while(j>=0)
                {
                    if(nums[j]>i-j)
                    {
                        f=true;
                        break;
                    }
                    j--;
                }
                if(!f)
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}