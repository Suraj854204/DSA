class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int partion=n/2;
        char[] chars=s.toCharArray();
        Arrays.sort(chars, 0 ,partion);
        for(int i=0;i<partion;i++){
            chars[n-1-i]=chars[i];
        }
        return new String(chars);

    }
}