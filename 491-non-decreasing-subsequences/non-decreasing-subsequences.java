class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0,new ArrayList<>());
        return ans;
        
    }
    private void backtracking(int[]nums,int start,List<Integer>curr){
        if(curr.size()>=2){
            ans.add(new ArrayList<>(curr));
        }
        //DUBLICATE REMOVE
        HashSet<Integer>set=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            //remove dublicate
            if(set.contains(nums[i])){
                continue;
            }

            ///create non decreasing order
            if(!curr.isEmpty() && nums[i]< curr.get(curr.size()-1)){
                continue;
            }
            set.add(nums[i]);
            curr.add(nums[i]);
            backtracking(nums,i+1,curr);//explore 
            curr.remove(curr.size()-1);//backtrack
        }
    }
}