class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}
        for i in range(len(nums)):
            dif = target - nums[i]
            if dif in m:
                return [m.get(dif),i]
            m[nums[i]] = i
        return [None,None]