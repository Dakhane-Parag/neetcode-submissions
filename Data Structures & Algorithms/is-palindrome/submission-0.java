class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] newChararr = newS.toCharArray();

        int l = 0;
        int r = newChararr.length - 1;

        while(l<=r){
            if(newChararr[l] != newChararr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
