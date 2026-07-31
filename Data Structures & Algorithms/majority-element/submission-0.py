class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        m = {}
        for i in range(len(nums)):          
                m[nums[i]] = 1 + m.get(nums[i],0)

        for key,value in m.items():
            if value > (n//2):
                return key