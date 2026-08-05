class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>ans=new ArrayList<>();
        ans.add(words[0]);
        int last=0;
       for(int i=1;i<groups.length;i++){
        if(groups[i]!=groups[last]){
            ans.add(words[i]);
            last=i;
        }
       }
       return ans;
    }
}