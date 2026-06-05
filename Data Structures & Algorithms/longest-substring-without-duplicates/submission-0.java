class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLenght = 0;
        var left = 0;
        HashSet<Character> uniq = new HashSet<>();

        for(int i = 0; i< s.length(); i++){
            while(uniq.contains(s.charAt(i))){
                uniq.remove(s.charAt(left));
                left++;
            }
                uniq.add(s.charAt(i));
                if (i - left +1 > maxLenght){
                    maxLenght = i - left +1;
                
            }
        }

        return maxLenght;
    }
}
