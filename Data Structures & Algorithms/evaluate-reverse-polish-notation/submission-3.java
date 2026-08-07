class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String n : tokens){
            if(n.equals("+") || n.equals("-") || n.equals("*") || n.equals("/")){
                int top = stack.peek();
                int secondTop = stack.get(stack.size() - 2);
                int result = 0;
                switch(n){
                    case "+":
                        result = top + secondTop;
                        stack.pop();
                        stack.pop();
                        stack.push(result);
                        break;

                    case "-":
                        result = secondTop - top;
                        stack.pop();
                        stack.pop();
                        stack.push(result);
                        break;
                    
                    case "*":
                        result = top * secondTop;
                        stack.pop();
                        stack.pop();
                        stack.push(result);
                        break;

                    case "/":
                        result = secondTop/top;
                        stack.pop();
                        stack.pop();
                        stack.push(result);
                        break;       
                }
            }else{
                stack.push(Integer.parseInt(n));
            }
        }
        return stack.peek();
    }
}
