class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        memo = [-1] * len(cost)
        def dfs(i):
            if i >= len(cost):
                return 0

            #here we are actually checking if the minimum cost is already calculated or not , if it is already calculated then we can directly return the minimum value from the array
            if memo[i] != -1:
                return memo[i]

            memo[i] = cost[i] + min(dfs(i+1),dfs(i+2)) #here we are calculating and storing the minimum cost required to pass the last index from the ith index 
            return memo[i]

        return min(dfs(0),dfs(1))