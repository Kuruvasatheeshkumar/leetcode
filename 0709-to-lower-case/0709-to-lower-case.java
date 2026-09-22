class Solution {
    public String toLowerCase(String s) {
        

       //return s.toLowerCase();
       char[] c = s.toCharArray();
       for(int i =0;i<c.length;i++) {
        if(c[i] >= 'A'  && c[i] <= 'Z' ) {
            c[i] = (char) (c[i] + 32);
        }
       }
       return String.valueOf(c);
    }
           
}