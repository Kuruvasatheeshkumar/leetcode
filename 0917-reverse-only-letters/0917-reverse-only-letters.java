class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ans = s.toCharArray();
        int l =0;
        int r=ans.length-1;
        while(l<r) {
            if(Character.isLetter(ans[l])&&Character.isLetter(ans[r])){
            char temp  = ans[l];
            ans[l] = ans[r];
           ans[r] = temp;
            l++;
            r--;
            }
            else if(!Character.isLetter(ans[l])){
                l++;
            }
            else {
                r--;
            }

        }
        return new String(ans);
    }
}