class Solution {
    public int findMaxLength(int[] nums) {
        int s=0;
        int m=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                s--;
            }
            else
            {
                s++;
            }
            if(map.containsKey(s))
            {
                int l=i-map.get(s);
                m=Math.max(l,m);
            }
            else
            {
                map.put(s,i);
            }

        }
        return m;
        
    }
}