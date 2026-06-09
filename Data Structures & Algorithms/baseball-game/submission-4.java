class Solution {
    public int calPoints(String[] operations) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    



        for(String st : operations){
            
            if(st.matches("-?\\d+")){
                stack.push(Integer.parseInt(st));
            }
            else if(st.equals("+") && !stack.isEmpty()){
                int top = stack.pop();
                int second = stack.peek();
                stack.push(top);
                stack.push(top+second);
            }
            else if (st.equals("C") && !stack.isEmpty()){
                stack.pop();
            }
            else if (st.equals("D") && !stack.isEmpty()){
                stack.push(stack.peek() * 2);
            }

        }
        int count = 0;
        while(!stack.isEmpty()){
            count += stack.pop();
        }
        return count;
    }
}