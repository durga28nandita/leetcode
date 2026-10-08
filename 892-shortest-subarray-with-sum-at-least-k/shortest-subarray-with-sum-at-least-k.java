class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int [] pre=new int [nums.length+1];
        int n=nums.length;
        //construct prefixsum
        for(int i=0;i<nums.length;i++)
        {
            pre[i+1]=pre[i]+nums[i];
        }
        int ans=Integer.MAX_VALUE;
        int head=0;
        int tail=0;
        int [] q=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            while(head<tail && pre[i]-pre[q[head]]>=k)
            {
                ans=Math.min(ans,i-q[head]);
                head++;
            }
            while(head<tail && pre[q[tail-1]]>pre[i])
            {
                tail--;
            }
            q[tail]=i;
            tail++;
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}