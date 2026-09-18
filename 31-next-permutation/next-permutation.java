class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                break;
            }
        }
        if(i<0)
        {
            rev(nums,0,nums.length-1);
            return;
        }
        for(int j=n-1;j>0;j--)
        {
            if(nums[j]>nums[i])
            {
                swap(nums,i,j);
                //rev(nums,i+1,n-1);
                break;
            }
        }
        rev(nums,i+1,n-1);
        
    }
    public void rev(int []nums,int left,int right)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void swap(int []nums,int a,int b)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}