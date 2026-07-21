class Solution {
    public int mostFrequent(int[] nums, int key) {
        int maxcount=0;
        int result=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int target=nums[i+1];
                int count=freq.getOrDefault(target,0)+1;
                freq.put(target,count);

                if(count>maxcount){
                    maxcount=count;
                    result=target;
                }
            }
        }
        return result;
    }
}