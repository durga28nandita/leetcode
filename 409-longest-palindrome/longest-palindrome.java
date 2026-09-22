class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new  HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int res=0;
        int co=0;
        for(int i:map.values())
        {
            if(i%2==0)
            {
                res+=i;
            }
            else
            {
                res+=i-1;
                co=1;
            }
        }
        if(co==1)
        {
            res+=1;
        }
        return res;
    }
}