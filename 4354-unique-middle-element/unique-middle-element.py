class Solution(object):
    def isMiddleElementUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n=(int)(len(nums)/2)
        if(nums.count(nums[n])==1):
            return True
        return False
        