class Solution {
    public int maxProduct(int n) {
        int max=0;int d1=0,d2=0;
        if(n==0)return 0;
        while(n>0)
        {
            int digit=n%10;
            if(digit>d1)
            {
                int temp=d1;
                d1=digit;
                d2=temp;
               
            } else if(digit>d2)
            {
                d2=digit;
            }
           n/=10;
        
        }return d1*d2;
    }
}