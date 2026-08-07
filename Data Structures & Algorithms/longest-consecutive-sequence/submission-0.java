class Solution {
    public int longestConsecutive(int[] nums) {
    
       if(nums.length == 0){
        return 0;
       }

       HashSet<Integer> temp = new HashSet<>();
       for(int n: nums){
        temp.add(n);
       }

        int maxLength = 0;
       for(int num : temp){
        if(temp.contains(num - 1)){
            continue;
        }
        int currNum = num;
        int currLength = 1;

        while(temp.contains(currNum + 1)){
            currNum++;
            currLength++;
        }
        maxLength = Math.max(maxLength,currLength);
       }

       return maxLength;

    }
}
