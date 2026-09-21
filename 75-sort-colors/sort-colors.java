class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}