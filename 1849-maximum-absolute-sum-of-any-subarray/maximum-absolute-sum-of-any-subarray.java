class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currmax=nums[0];
        int max=nums[0];
        int min=nums[0];
        int currmin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currmax=Math.max(currmax+nums[i],nums[i]);
            max=Math.max(max,currmax);
            currmin=Math.min(currmin+nums[i],nums[i]);
            min=Math.min(min,currmin);
        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}