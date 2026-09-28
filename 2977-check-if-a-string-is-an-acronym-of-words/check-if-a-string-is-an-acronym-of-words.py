class Solution(object):
    def isAcronym(self, words, s):
        """
        :type words: List[str]
        :type s: str
        :rtype: bool
        """
        ac=""
        for i in words:
            ac+=i[0]
        return ac==s