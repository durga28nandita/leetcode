class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)
        {
            return s;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            int oddlen=expand(s,i,i);
            int evelen=expand(s,i,i+1);
            int l=Math.max(oddlen,evelen);
            if(l>(end-start+1))
            {
                start=i-(l-1)/2;
                end=i+(l/2);
            }
        }
        return s.substring(start,end+1);    
    }
    int expand(String s,int  left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return (right-left-1);
    }
}