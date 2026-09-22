class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='['||s.charAt(i)=='{')
            {
                l.add(s.charAt(i));
            }
            else
            {
                if(l.isEmpty())
                {
                    return false;
                }
                char  top=l.get(l.size()-1);
                if(s.charAt(i)==')' && top!='(')
                {
                    return false;
                }
                if(s.charAt(i)==']' &&  top!='[')
                {
                    return false;
                }
                if(s.charAt(i)=='}' && top!='{')
                {
                    return false;
                }
                l.remove(l.size()-1);
            }
        }
        return l.isEmpty();
    }
}