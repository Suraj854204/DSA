class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
           int prevIdx=i-k;
           int nextIdx=i+k;

           if((prevIdx>=0 && num<=nums[prevIdx]) || (nextIdx<nums.length && num<=nums[nextIdx])){
            continue;
           }
           sum+=num;
        }
        return sum;
    }
}