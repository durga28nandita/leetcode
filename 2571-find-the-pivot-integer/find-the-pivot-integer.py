class Solution(object):
    def pivotInteger(self, n):
        """
        :type n: int
        :rtype: int
        """
        l=[]
        for i in range(1,n+1):
            l.append(i)
        for i in range(n):
            if(sum(l[:i+1])==sum(l[i:])):
                return l[i]
        return -1


