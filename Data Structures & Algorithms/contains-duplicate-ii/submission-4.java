class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0; i< nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return true;
        //     }
        //     set.add(nums[i]);
        //     if(set.size() > k){
        //         set.remove(nums[i-k]);
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(right - left > k){
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
        }
        return false;
    }
}