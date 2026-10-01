class Solution {
    public boolean isValid(String s) {
        Deque<Character>st=new ArrayDeque<>();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(c==')' && st.pop()!='(')
                {
                    return false;
                }
                else  if(c==']' && st.pop()!='[')
                {
                    return false;
                }
                else if(c=='}' && st.pop()!='{')
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}