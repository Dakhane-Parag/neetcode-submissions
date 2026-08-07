class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //BruteForce solution

        // int[] result = new int[temperatures.length];
        // for(int i = 0;i<temperatures.length;i++){
        //     for(int j = i+1;j<temperatures.length;j++){
        //         if(temperatures[j] > temperatures[i]){
        //             result[i] = j - i;
        //             break;
        //         }else if(temperatures[j]<temperatures[i]){
        //             result[i] = 0;
        //         }
        //     }
        // }
        // return result;

        //Optimized Stack Solution
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<temperatures.length ;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
