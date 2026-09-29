class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num ,1 );

        }
        ArrayList<Integer> list = new ArrayList<>();
          for(int  num : nums2) {
            if(map.containsKey(num)) {
                list.add(num);
                map.remove(num);
            }

          }
          int[] ans = new int[list.size()];
          for(int i =0;i<list.size();i++) {
            ans[i] = list.get(i);

          }
          return ans;
    }
}