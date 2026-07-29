class Solution {
    public int maximumCount(int[] nums) {
      Arrays.sort(nums);;
      int negative=0;
      int positive=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            positive++;
        }else if(nums[i]<0){
            negative++;
        }
      }
      return Math.max(negative,positive);
    }
}