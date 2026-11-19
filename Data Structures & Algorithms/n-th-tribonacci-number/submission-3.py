class Solution:
    def solve(self,n,dp):
        if n == 0:
            return 0
        
        if n == 1 or n == 2:
            return 1

        for i in range(3,n+1):
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
        return dp[i]

    def tribonacci(self, n: int) -> int:
       dp = [0] * (n+1) 

       if n>=1:
        dp[1] = 1
       if n >= 2:
        dp[2] = 1

       return self.solve(n,dp)

