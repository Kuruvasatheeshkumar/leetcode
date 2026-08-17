class Solution {
    public int reverse(int x) {
        long rev =0;
        while(x!=0) {
            int digit = x%10;
            rev +=digit;
            rev *=10; 
            x/=10;
        }
        rev /=10;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        if(x<0) {
            return (int)(-1*rev);
        }
        return (int)(rev);
    }
}


