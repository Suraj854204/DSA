class Solution {
    public long numberOfWays(String s) {
        long n=s.length();
        long count0=0;
        long count1=0;
        for(char ch:s.toCharArray()){
            if(ch=='0')count0++;
            else count1++;
        }
        long ans=0;
        long left0=0;
        long left1=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){  ///101
                ans+=left1*(count1-left1);
                left0++;
            }else{//010
                ans+=left0*(count0-left0);
                left1++;
            }

        }
        return ans;
    }
}