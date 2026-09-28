class Solution(object):
    def countSymmetricIntegers(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: int
        """
        c=0
        for i in range(low,high+1):
            s=str(i)
            l=len(s)
            if l%2!=0:
                continue
            else:
                h=l/2
                if(sum(map(int,s[:h])))==sum(map(int,s[h:])):
                    c=c+1
        return c