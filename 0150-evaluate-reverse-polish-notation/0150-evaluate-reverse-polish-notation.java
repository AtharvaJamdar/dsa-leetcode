class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for(String ch : tokens){
             if(ch.equals("+")|| ch.equals("-") || ch.equals("*") || ch.equals("/"))
             {
                int a = stack.poll();
                int b = stack.poll();
                switch(ch){
                    case "+": {ans = a+b;break;}
                    case "-": {ans = b-a;break;}
                    case "*": {ans = a*b;break;}
                    case "/":{ ans = b/a;break;}
                }
                stack.push(ans);
             }
             else
             stack.push(Integer.parseInt(ch));  
        } 

        return stack.poll();     
    }
}