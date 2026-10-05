class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    
int r=0;
int l=0;
int c=0;
int p=1;
if(k<=1)
{
    return 0;
}
while(r<nums.length)
{
    p*=nums[r];
    while(p>=k)
    {
        p/=nums[l];
        l++;
    }
    c+=(r-l+1);
    r++;

}

return c;
    }
}