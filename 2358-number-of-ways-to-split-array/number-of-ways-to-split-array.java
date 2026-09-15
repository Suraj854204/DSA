class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long leftsum=0;
        long rightsum=0;
        for(int num:nums){
            rightsum+=num;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum-=nums[i];

            if(leftsum>=rightsum){
              count++;
            }
        }
        
        return count;

    }
}