import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
       
        if (s.length() != t.length()) return false; 
        

        HashMap<Character, Character> map = new HashMap<>();
        
        HashSet<Character> assignedValues = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
       
            if (map.containsKey(charS)) {
                
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
             
                if (assignedValues.contains(charT)) {
                    return false;
                }
                
               
                map.put(charS, charT);
                assignedValues.add(charT);
            }
        }
        
        return true;
    }
}
