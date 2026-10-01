class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num,1) +1);
    
        }
PriorityQueue<Integer> pb = new PriorityQueue<>( (a, b) -> map.get(a) - map.get(b));
        for(int num : map.keySet()) {
            pb.add(num);
            if(pb.size()> k) {
                pb.poll();
            }

        }
        int[] ans = new int[k];
        for(int i =k-1;i>=0;i--) {
            ans[i] = pb.poll();

        }
        return ans;


        
    }
}