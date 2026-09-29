class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //  Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // List<Integer> resultList = new ArrayList<>();
        // int i = 0, j = 0;

        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] == nums2[j]) {
        //         resultList.add(nums1[i]);
        //         i++;
        //         j++;
        //     } else if (nums1[i] < nums2[j]) {
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }

        // int[] result = new int[resultList.size()];
        // for (int k = 0; k < resultList.size(); k++) {
        //     result[k] = resultList.get(k);
        // }
        // return result;
        HashMap<Integer, Integer> map = new HashMap<>();
          for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            
          }
              
          ArrayList<Integer> list = new ArrayList<>();
          for(int num : nums2) {
          if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num,map.get(num) -1);

            }
          }
        int[] ans = new int[list.size()];
        for(int i =0;i<list.size();i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}