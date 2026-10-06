class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int res=0;
        for(char br:s.toCharArray())
        {
            if(br=='(')
            {
                st.push(br);
            }
            else
            {
                if(st.isEmpty())
                {
                    res+=1;
                }
                else
                {
                    st.pop();
                }
            }
        }
        if(!st.isEmpty())
        {
            res+=st.size();
        }
        return res;
    }
}