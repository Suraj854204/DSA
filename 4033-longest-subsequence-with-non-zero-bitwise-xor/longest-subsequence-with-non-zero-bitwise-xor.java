class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean allzero=true;
        for(int x:nums){
            xor^=x;
            if(x>0){
                allzero=false;
            }
        }
        if(xor>0){
            return n;
        }
        return allzero?0:n-1;

    }
}