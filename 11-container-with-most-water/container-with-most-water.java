class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int area=0;
        int maxarea=0;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            area=min*(j-i);
            maxarea=Math.max(maxarea,area);
            if(height[i]>height[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return maxarea;
    }
}