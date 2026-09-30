class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        Set<Integer>set=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int c=1;
        int m=c;
        for(int a:set)
        {
            
            if(set.contains(a+1))
            {
                c++;
                m=Math.max(m,c);
            }
            else
            {
                c=1;
            }
        }
        return m;
    }
}