class Solution(object):
    def minimumAverage(self, nums):
        """
        :type nums: List[int]
        :rtype: float
        """
        a=0
        l=[]
        while(nums!=[]):
            l.append((min(nums)+max(nums))/2.0)
            nums.remove(min(nums))
            nums.remove(max(nums))
        return min(l)



        