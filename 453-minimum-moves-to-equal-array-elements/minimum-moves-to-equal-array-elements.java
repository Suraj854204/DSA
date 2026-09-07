class Solution {
    public int minMoves(int[] nums) {
       int min=Integer.MAX_VALUE;
       Arrays.sort(nums);
      for(int num:nums){
        if(num<min){
            min=num;
        }
      }
      int maxsum=0;
      for(int num:nums){
        maxsum+=Math.abs(min-num);
      }
      return maxsum;
    }
}