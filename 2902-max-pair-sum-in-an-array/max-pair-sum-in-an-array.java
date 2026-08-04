class Solution {
    public int max(int n){
        int max=0;
        while(n!=0){
            int rem=n%10;
            max=Math.max(rem,max);
            n/=10;

        }
        return max;
    }
    public int maxSum(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(max(nums[i])==max(nums[j])){
                    ans=Math.max(ans,(nums[i]+nums[j]));
                }
            }
        }
        return ans;
    }
}