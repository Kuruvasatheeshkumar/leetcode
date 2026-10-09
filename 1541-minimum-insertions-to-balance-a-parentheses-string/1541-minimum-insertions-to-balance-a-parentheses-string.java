class Solution {   
    public int minInsertions(String s) {       
        int insertions = 0;       
        int openParenthesesNeeded = 0;    
        for (int i = 0; i < s.length(); i++) {          
            char c = s.charAt(i);          
            if (c == '(') {              
                openParenthesesNeeded += 2; 
                             
                if (openParenthesesNeeded % 2 == 1) {
                    insertions++;                   
                    openParenthesesNeeded--;
                }
            } else {
                openParenthesesNeeded--; 
                if (openParenthesesNeeded < 0) {                    
                    insertions++; // Fixed typo here (added 's')                  
                    openParenthesesNeeded = 1;
                }      
            } 
        } 
        return insertions + openParenthesesNeeded; 
    }
}