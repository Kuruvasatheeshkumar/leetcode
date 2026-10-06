class Solution {
    public int minAddToMakeValid(String s) {
       int open =0;
       int count =0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;

            }
            else if( open == 0) {
                count++;
            }
            else {
                open--;
            }


        }
        return count+open;



        
    }
}