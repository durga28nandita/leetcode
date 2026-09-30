class Solution {
    public int minEatingSpeed(int[] piles, int h){
        int max=piles[0];
        for(int i:piles)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int l=1;
        int high=max;
        int ans=0;
        while(l<=high)
        {
            int m=(l+high)/2;
            long totaltime=calculate(piles,m);
            if(totaltime<=h)
            {
                ans=m;
                high=m-1;
                
            }
            else
            {
                l=m+1;
            }
        }
        return ans;
    }
    long calculate(int []nums,int mid)
    {
        long totaltime=0;
        for(int num:nums)
        {
            totaltime+=(long)Math.ceil((double)num/mid);
           
        }
        return totaltime;
    }
}