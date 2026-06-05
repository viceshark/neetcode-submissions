class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int lenght1 = s1.length(); 
        int lenght2 = s2.length();
        if(lenght2<lenght1) return false;

    Map<Character, Integer> need = new HashMap<>();
    Map<Character, Integer> window = new HashMap<>();
    for (int i = 0; i < lenght1; i++) {
        need.merge(s1.charAt(i), 1, Integer::sum);    
        window.merge(s2.charAt(i), 1, Integer::sum);  
    }
    if (need.equals(window)) return true;

    for (int i = lenght1; i < lenght2; i++) {
        char in = s2.charAt(i), out = s2.charAt(i - lenght1);
        window.merge(in, 1, Integer::sum);
        if(window.merge(out, -1, Integer::sum) == 0){
            window.remove(out);
        }
        if(need.equals(window)) return true;
    }

        return false;

    }
}
