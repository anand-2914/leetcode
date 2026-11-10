class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dicta={}
        for n in nums:
            if n in dicta:
                return True
            dicta[n]=True

        return False