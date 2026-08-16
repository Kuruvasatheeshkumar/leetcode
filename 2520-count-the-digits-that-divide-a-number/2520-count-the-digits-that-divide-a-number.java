class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp > 0){
            int digit = temp % 10;
            if(digit !=0 && num % digit == 0) {
                count++;
            }
            temp= temp/10;
        }
        return count;
        
    }
}