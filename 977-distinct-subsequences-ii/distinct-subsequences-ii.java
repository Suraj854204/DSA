class Solution {
    public int distinctSubseqII(String s) {
      final int MOD=1000000007;
      int total=1;
      int lastcordi[]=new int[26];
      for(char c:s.toCharArray()){
        int index=c-'a';
        int newSub=total;
        total=(total+newSub)%MOD;
        total=(total-lastcordi[index]+MOD)%MOD;
        lastcordi[index]=newSub;
      }
      return(total-1+MOD)%MOD;
    }
}