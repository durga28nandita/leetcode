class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k)
        {
            return 0;
        }
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char c:map.keySet())
        {
            if(map.get(c)<k)
            {
                int maxLen=0;
                for(String sub: s.split(String.valueOf(c)))
                {
                    maxLen=Math.max(maxLen,longestSubstring(sub,k));
                }
                return maxLen;
            }
        }
        return n;
    }
}