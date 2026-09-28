class Solution(object):
    def maxProductDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums1=sorted(nums)
        return (nums1[-1]*nums1[-2]-nums1[0]*nums1[1])