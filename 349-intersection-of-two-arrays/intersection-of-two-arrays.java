class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>resultSet=new HashSet<>();
        for(int nums:nums1){
            set.add(nums);
        }
        for(int nums:nums2){
            if(set.contains(nums)){
                resultSet.add(nums);
            }
        }
        int ans[]=new int [resultSet.size()];
        int i=0;
        for(int num:resultSet){
            ans[i++]=num;

        }
        return ans;
    }
}