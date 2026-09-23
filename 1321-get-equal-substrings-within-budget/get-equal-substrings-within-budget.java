class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0;
        int ans=0;
        int totalcost=0;
        for(int right=0;right<s.length();right++)
        {
            int cost=Math.abs(s.charAt(right)-t.charAt(right));
            totalcost+=cost;
            while(totalcost>maxCost)
            {
                int l_cost=Math.abs(s.charAt(left)-t.charAt(left));
                totalcost-=l_cost;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}