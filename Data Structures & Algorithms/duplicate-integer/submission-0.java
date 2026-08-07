class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> first = new HashSet<>();
        for(int n: nums){
            if(first.contains(n)){
                return true;
            }
            first.add(n);
        }
        return false;
    }
}