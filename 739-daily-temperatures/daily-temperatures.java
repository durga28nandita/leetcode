class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int ans[]=new int[n];
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
            int curr=t[i];
            while(!st.isEmpty() && curr>=t[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek()-i;
            }
            else
            {
                ans[i]=0;
            }
            st.push(i);
        }
        return ans;


    
    }
}