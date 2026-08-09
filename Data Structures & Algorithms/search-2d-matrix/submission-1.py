class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0] :
            return False

        rows , columns = len(matrix) , len(matrix[0])
        start , end = 0 , rows*columns - 1

        while start <= end :
            mid = (start + end) // 2

            row = mid // columns
            col = mid % columns

            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                start = mid + 1
            else:
                end = mid - 1

        return False