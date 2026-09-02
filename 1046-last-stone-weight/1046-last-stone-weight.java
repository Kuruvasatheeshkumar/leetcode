class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> ans = new PriorityQueue<>((a,b) -> b-a);
        for(int x : stones) 
        ans.offer(x);
        
    
    while(ans.size()>1) {
        int x = ans.poll();
        int y = ans.poll();
        if(x!= y)
        ans.offer(x-y);
    }
    return ans.isEmpty() ? 0 : ans.poll();
    }

}