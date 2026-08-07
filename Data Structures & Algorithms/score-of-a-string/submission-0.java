class Solution {
    public int scoreOfString(String s) {
        char[] temp = s.toCharArray();
        int score = 0;
        for(int i = 0;i<temp.length -1 ;i++){
            score += Math.abs(temp[i+1] - temp[i]);
        }
        return score;
    }
}