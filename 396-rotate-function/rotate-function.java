class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
       long f=0;
       long numsum=0;
       for(int i=0;i<n;i++){
         numsum+=nums[i];
         f+=i*nums[i];
       }

       long res=f;
       for(int i=n-1;i>0;i--){
        f+=numsum-n*nums[i];
        res=Math.max(res,f);
       }
       return(int)res;
    }

}