class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0;
        int start=0;
        int tank=0;
        for(int i=0;i<gas.length;i++)
        {
            int pro=gas[i]-cost[i];
            tot+=pro;
            tank+=pro;
            if(tank<0)
            {
                start=i+1;
                tank=0;
            }
        }
    return tot < 0 ? -1 :  start;
    }
}