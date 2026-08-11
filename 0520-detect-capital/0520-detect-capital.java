class Solution {
    public boolean detectCapitalUse(String word) {
        int n =0;
        for(int i =0;i<word.length();i++) {
            if(Character.isUpperCase(word.charAt(i))){
                n++;
            }
        }
        return n ==0 || n==1 && Character.isUpperCase(word.charAt(0)) ||n == word.length();
        
    }
}