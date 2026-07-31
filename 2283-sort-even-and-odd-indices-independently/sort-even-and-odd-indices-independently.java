class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
         
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(e++);
            }else{
                nums[i]=odd.get(o++);
            }
        }
        return nums;

    }
}