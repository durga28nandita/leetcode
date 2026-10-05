class Solution {
    public int largestRectangleArea(int[] arr) {
        Deque<Integer>st=new ArrayDeque<>();
        int h=0;
        int i=0;
        int a=0;
        int ma=0;
        int n=arr.length;
        for(i=0;i<=arr.length;i++)
        {
            int curr=(i==n)?0:arr[i];
            while(!st.isEmpty() &&  arr[st.peek()]>=curr)
            {
                h=arr[st.pop()];
                int pse=st.isEmpty()?-1:st.peek();
                int nse=i;
                int w=nse-pse-1;
                a=h*w;
                ma=Math.max(a,ma);
            }
            if(i<n)
            {
                st.push(i);
            }
        }
        return ma;

    }
}