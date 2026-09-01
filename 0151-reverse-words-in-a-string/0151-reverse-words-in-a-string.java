class Solution {
    public String reverseWords(String s) {
       
        String ans[] = s.trim().split("\\s+");
        int l =0;
        int r = ans.length-1;
        while(l<r ){
        String temp   = ans[l];
        ans[l] =ans[r];
        ans[r] = temp;
        l++;
        r--;
            
        }
        return String.join(" ", ans);
        
    }
}