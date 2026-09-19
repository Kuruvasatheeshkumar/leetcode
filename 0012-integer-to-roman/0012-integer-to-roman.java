class Solution {
    public String intToRoman(int num) {
        String result="";
        String sym[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        int temp = num;
        while(temp>0)
        {
            for(int i=0;i<val.length;i++)
            {
                if(temp-val[i]>=0)
                {
                    result = result+sym[i];
                    temp = temp-val[i];
                    break;
                }
            }
        }

        return result;
    }
}