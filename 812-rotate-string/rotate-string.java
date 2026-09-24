class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s+s;
        if(s.length()!=goal.length())
        {
            return false;
        }
        int i=0;
        while(i<s.length())
        {
            int k=i;
            int j=0;
            if(s1.charAt(k)==goal.charAt(0))
            {
                while(j<goal.length())
                {
                    if(s1.charAt(k)==goal.charAt(j))
                    {
                        k++;
                        j++;
                    }
                    else
                    {
                        j=0;
                        break;
                    }
                }
                if(j==goal.length())
                {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}