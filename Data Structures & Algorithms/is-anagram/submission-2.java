class Solution {

    //BruteForce 
    // public boolean isAnagram(String s, String t) {
    //     char[] s1 = s.toCharArray();
    //     Arrays.sort(s1);
    //     String sortedS = new String(s1);

    //     char[] t1 = t.toCharArray();
    //     Arrays.sort(t1);
    //     String sortedT = new String(t1);

    //     if(sortedS.equals(sortedT)){
    //         return true;
    //     }
    //     return false;
    // }

    public boolean isAnagram(String s, String t){
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> t1 = new HashMap<>();

        char[] str1 = s.toCharArray();
        char[] ttr1 = t.toCharArray();

        for(char n:  str1){
            if(s1.containsKey(n)){
                s1.put(n,s1.get(n)+1);
            }else{
                s1.put(n,1);
            }
        }

        for(char n: ttr1){
            if(t1.containsKey(n)){
                t1.put(n,t1.get(n)+1);
            }else{
                t1.put(n,1);
            }
        }

        if(s1.equals(t1)){
            return true;
        }
        return false;
    }
}
