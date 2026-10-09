class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,res);
        return res;
    }
    public static void solve(int idx,int[] nums,List<List<Integer>> res)
    {
        if(idx==nums.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int k=0;k<nums.length;k++)
            {
                ds.add(nums[k]);
            }
            res.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(idx,i,nums);
            solve(idx+1,nums,res);
            swap(idx,i,nums);
        }
    }
    public static void swap(int a,int b,int[] nums)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }        
    
}