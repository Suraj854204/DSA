class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int dp[]=new int[n+1];
        for(int center=0;center<2*n-1;center++){
            int l=center/2;
            int r=l+center%2;
            dp[l+1]=Math.max(dp[l+1],dp[l]);
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                if(r-l+1>=k){
                    dp[r+1]=Math.max(dp[r+1],dp[l]+1);
                }
                l--;
                r++;
            }
        }
        return dp[n];
    }
}