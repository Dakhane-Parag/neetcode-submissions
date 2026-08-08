class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2 :
            return x

        start , end = 0 , x // 2
        while start <= end :
            mid = (start + end) // 2
            square = mid * mid 

            if square == x:
                return mid
            elif square < x :
                start = mid + 1
            else:
                end = mid -1 
        
        return end