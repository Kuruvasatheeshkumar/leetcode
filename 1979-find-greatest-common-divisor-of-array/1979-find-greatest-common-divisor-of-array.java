class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max= nums[0];
        for(int A : nums) {
    
        if(A < min)
            min = A;    
            if(A > max)
                max = A;
          
            
        }
        
        while(max !=0) {
            int temp = max;
            max= min%max;
            min =temp;
        }
        return min;
        
        
    }
}