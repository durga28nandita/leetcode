class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int s=0;
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            int rem=s%k;
            if(rem<0)
            {
                rem+=k;
            }
            c+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
        
    }
}