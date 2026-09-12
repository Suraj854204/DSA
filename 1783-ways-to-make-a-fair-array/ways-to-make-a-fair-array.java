class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int res=0;
        int left[]=new int[2];
        int right[]=new int[2];
        for(int i=0;i<n;i++){
            right[i%2]+=nums[i];
        }
        for(int i=0;i<n;i++){
            right[i%2]-=nums[i];
            if(left[0]+right[1]==left[1]+right[0])res++;
             left[i%2]+=nums[i];

        }
        return res;

    }
}