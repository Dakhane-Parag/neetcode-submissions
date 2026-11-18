class Solution:
    def rob(self, nums: List[int]) -> int:
        memo = [-1] * (len(nums))

        def solve(i):
            if i >= len(nums):
                return 0

            if memo[i] != -1:
                return memo[i]

            memo[i] = nums[i] + max(solve(i+2),solve(i+3))
            return memo[i]

        return max(solve(0),solve(1))