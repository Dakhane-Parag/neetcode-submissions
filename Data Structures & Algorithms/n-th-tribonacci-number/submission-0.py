class Solution:
    def tribonacci(self, n: int) -> int:
        memo = [-1] * (n+1)

        def dfs(n):
            if n == 0:
                return 0
            if n == 1 or n == 2:
                return 1

            if memo[n] != -1:
                return memo[n]

            memo[n] = dfs(n-3) + dfs(n-2) + dfs(n-1)
            return memo[n]

        return dfs(n)