class Solution:
    def solve(self,n,dp):
        dp[0] = 1
        if n >= 1:
            dp[1] = 1


        for i in range(2,n+1):
            dp[i] = dp[i-2] + dp[i-1]

        return dp[n]

    def climbStairs(self, n: int) -> int:
        dp = [0] * (n+1)
        return self.solve(n,dp)

        