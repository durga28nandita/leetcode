class Solution {
    public int countGoodSubstrings(String s) {
        char[] str=s.toCharArray();
        int c=0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(str[i]!=str[i+1] && str[i+1]!=str[i+2] && str[i+2]!=str[i])
            {
                c++;
            }
        }
        return c;
        
    }
}