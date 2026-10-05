class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer, Integer> res = new HashMap<>();
       res.put(0,1);
       int sum = 0, ans=0;
       for(int i =0;i<nums.length;i++) {
        sum = (sum + nums[i]) % k;
        if(sum < 0)
        sum +=k;
        if(res.containsKey(sum)) {
            ans += res.get(sum);
            res.put(sum, res.get(sum) +1);

        }
        else {
            res.put(sum,1);
        }
       }
       return ans;
        
    }
}