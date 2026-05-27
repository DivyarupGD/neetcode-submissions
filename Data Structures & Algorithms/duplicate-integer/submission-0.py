class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set1 = set()
        for val in nums:
            set1.add(val)
        if(len(set1) != len(nums)):
            return True
        else:
            return False