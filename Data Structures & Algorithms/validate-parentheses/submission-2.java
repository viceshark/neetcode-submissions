class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap();
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');

        ArrayDeque<Character> stack = new ArrayDeque();

        boolean result = true;

        for(Character st : s.toCharArray()){

            if(mapping.values().contains(st)){

                stack.push(st);
            }
            else if (!stack.isEmpty() && mapping.get(st).equals(stack.peek())){
                stack.pop();
            }
            else{
                result = false;
                return result;
            }
        
        }
        return stack.isEmpty() ? result : false;
    }
}
