class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        helper(list,new ArrayList<>(),nums,0);
        return list;
    }
    private void helper(List<List<Integer>>list,List<Integer>templist,int[]nums,int start){
        list.add(new ArrayList<>(templist));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])continue;
            templist.add(nums[i]);
            helper(list,templist,nums,i+1);
            templist.remove(templist.size()-1);
        }

    }
}