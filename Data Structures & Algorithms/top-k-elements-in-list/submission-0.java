class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> first = new HashMap<>();
        for(int n:nums){
            if(first.containsKey(n)){
                first.put(n,first.get(n)+1);
            }else{
                first.put(n,1);
            }
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(first.entrySet());
        list.sort((a,b) -> b.getValue() - a .getValue());

        int[] arr = new int[k];
        for(int i = 0;i<k;i++){
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}
