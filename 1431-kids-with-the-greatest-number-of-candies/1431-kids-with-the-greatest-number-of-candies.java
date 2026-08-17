class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int n = 0;
      for(int i =0;i<candies.length;i++) {
        if(candies[i]>n){
            n =candies[i];
        }
      }
      List<Boolean> A = new ArrayList<>();
      for(int i = 0;i<candies.length;i++) {
        if(candies[i] + extraCandies >=n){
            A.add(true);
        }
        else {
            A.add(false);
        }
      }
      return A;

    }
}