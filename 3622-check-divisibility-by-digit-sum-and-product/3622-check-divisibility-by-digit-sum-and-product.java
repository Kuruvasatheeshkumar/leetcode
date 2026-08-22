class Solution {
    public boolean checkDivisibility(int n) {
        int temp =n;
        int sum =0;
        int product = 1;
        while(n!=0) {
            int digit = n%10;
            sum += digit;
            product *=digit;
             n= n/10;
        }
        int total = sum + product;
        if(temp % total == 0) {
            return true;
        }  
        return false;     
    }
}