class Solution(object):
    def countAsterisks(self, s):
        """
        :type s: str
        :rtype: int
        """
        if '*' not in s:
            return 0
        c=0
        cl=0
        for i in range(len(s)):
            if s[i]=='|':
                cl=cl+1
            if s[i]=="*" and cl%2==0:
                c=c+1
        return c

        