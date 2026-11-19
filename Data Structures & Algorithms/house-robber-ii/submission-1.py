class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)

        if n == 1:
            return nums[0]

        memo = [-1] * (len(nums))

        def dfs(i,end,memo):
            if i > end:
                return 0

            if memo[i] != -1:
                return memo[i]

            memo[i] = max(
                nums[i] + dfs(i+2,end,memo),
                dfs(i+1,end,memo)
            )

            return memo[i]

        memo1 = [-1] * len(nums)
        memo2 = [-1] * len(nums)

        return max(
            dfs(0,n-2,memo1),
            dfs(1,n-1,memo2)
        )




        

        