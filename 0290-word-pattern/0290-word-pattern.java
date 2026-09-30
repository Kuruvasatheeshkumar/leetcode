class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern .length()){
            return false;
        }
        HashMap<Character ,String> map  = new HashMap<>();
        for(int i =0;i<pattern.length();i++) {
       char ch = pattern.charAt(i);
            String ans = word[i];

            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(ans)) {
                    return false;
                }
            }
                else {
                   if(map.containsValue(ans)) {
                    return false;
                   
                }
                map.put(ch,ans);
                
            }
        }
        return true;

    }
}