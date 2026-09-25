class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int prefl = pref.length();
         
        for(int i = 1;i<strs.length;i++) {
            String s = strs[i];
           while (prefl > s.length() || !pref.equals(s.substring(0, prefl))) {
                prefl--;
                if (prefl == 0) {
                    return "";
                }
                pref = pref.substring(0,prefl);
        }
        
    }
    return pref;
    }
}