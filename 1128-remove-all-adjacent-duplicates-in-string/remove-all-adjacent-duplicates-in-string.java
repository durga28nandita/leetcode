class Solution {
    public String removeDuplicates(String s) {
        Deque<Character>stack=new ArrayDeque<>();
        for(char c:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek()==c)
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty())
        {
            res.append(stack.removeLast());
        }
        return res.toString();
        
    }
}