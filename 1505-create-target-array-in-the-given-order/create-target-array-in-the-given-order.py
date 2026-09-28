class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        target=[]
        i=0
        for i,n in zip(index,nums):
            target.insert(i,n)
        return target

            