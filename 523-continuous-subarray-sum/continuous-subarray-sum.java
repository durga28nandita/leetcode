class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            int r=s%k;
            if(map.containsKey(r))
            {
                if(i-map.get(r)>1)
                {
                    return true;
                }
            }
            else
            {
                map.put(r,i);
            }
        }
        return false;
        
    }
}