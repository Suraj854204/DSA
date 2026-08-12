class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap();
        int ans=0;
        int start=-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.get(nums[i])>k){
                start++;
                map.put(nums[start],map.get(nums[start])-1);
            }
            ans=Math.max(ans,i-start);

        }
        return ans;
    }
}