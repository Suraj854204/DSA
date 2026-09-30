class Solution {
    public int jump(int[] nums) {
        if(nums==null ||nums.length<=1){
            return 0;
        }
        int n=nums.length;
        int jump=0;
        int maxjump=0;
        int currreach=0;
        for(int i=0;i<nums.length;i++){
            maxjump=Math.max(maxjump,i+nums[i]);
            if(i==currreach){
                jump++;
                currreach=maxjump;
            }
            if(nums.length-1<=currreach){
                break;
            }
        }
        return jump;
    }
}