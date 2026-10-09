class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int s=0;
        int c=0;
        map.put(0,1);
        for(int i:nums)
        {
            s+=i;
            c+=map.getOrDefault(s-k,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
        
        
    }
}