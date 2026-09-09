class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length(),i=0,max=0;
        for(int j=0;j<n;j++){
            maxCost-=Math.abs(s.charAt(j)-t.charAt(j));
            if(maxCost<0){
                maxCost+=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}