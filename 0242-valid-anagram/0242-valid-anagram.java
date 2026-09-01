class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
    
    if(m!= n) {
        return false;
    } 

        int[] arr = new int[26];
        for(int i =0;i<m;i++) {
            arr[s.charAt(i) - 'a']++;
          }
          for(int i =0;i<n;i++) {
            arr[t.charAt(i) - 'a']--;
          }
          for(int i =0;i<arr.length;i++) {
            if(arr[i] != 0) {
                return false;

            }
          }

      return true;   
    }
}