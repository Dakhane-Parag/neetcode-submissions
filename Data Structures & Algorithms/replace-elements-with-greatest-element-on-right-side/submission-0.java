class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            int largest = Integer.MIN_VALUE;
            for(int j = i+1; j <arr.length;j++){
                largest = Math.max(largest,arr[j]);
            }
            arr[i] = largest;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}