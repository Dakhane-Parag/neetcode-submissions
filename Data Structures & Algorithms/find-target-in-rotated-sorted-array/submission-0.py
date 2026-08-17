class Solution:
    def binSrc(self,nums,target, left: int , right: int ) -> int:
        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid 
            elif target > nums[mid]:
                left = mid + 1
            else:
                right = mid - 1

        return -1


    def search(self, nums: List[int], target: int) -> int:
        n = len(nums) - 1
        l,r = 0 , n

        while l < r:
            mid = (l+r) //2
            if nums[mid] > nums[r]:
                l = mid + 1
            else:
                r = mid 

        pivot = l - 1

        if target > nums[n]:
            return self.binSrc(nums,target,0,pivot)
        
        return self.binSrc(nums,target,pivot+1,n)


