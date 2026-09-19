class Solution {
    public int[] productExceptSelf(int[] nums) {
        //USING PREFIX AND SUFFIX METHOD
        int n=nums.length;
        int ans[]=new int[n];
        int prefix=1;
        for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];

        }
        return ans;

    }
}