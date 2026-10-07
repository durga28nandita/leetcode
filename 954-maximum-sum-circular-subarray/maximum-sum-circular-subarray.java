class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=0;
        int currMin=0;
        int  tot=0;
        int maxS=Integer.MIN_VALUE;
        int minS=Integer.MAX_VALUE;
        for(int curr:nums)
        {
            currMax=Math.max(curr+currMax,curr);
            maxS=Math.max(currMax,maxS);
            currMin=Math.min(curr+currMin,curr);
            minS=Math.min(minS,currMin);
            tot+=curr;
        }
        if(maxS<0)
        {
            return maxS;
        }
        return Math.max(maxS,tot-minS);
    }
}