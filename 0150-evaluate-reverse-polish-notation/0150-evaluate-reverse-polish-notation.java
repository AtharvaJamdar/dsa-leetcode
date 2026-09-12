class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){

            String token = tokens[i];

            if (!token.equals("+") && 
            !token.equals("-") &&
            !token.equals("*") &&
            !token.equals("/")) {
                int num = Integer.parseInt(token);

                stack.push(num);
            }
            else{
                int b = stack.poll();
                int a = stack.poll();

                int result = 0;

                switch(token){
                    case "+" :
                    result = a+b;
                    break;

                    case "-" :
                    result = a-b;
                    break;

                    case "*" :
                    result = a*b;
                    break;

                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.poll();
    }
}