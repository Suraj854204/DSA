class Solution {
    public String truncateSentence(String s, int k) {
        //using inbuilt function
        String[]word=s.split(" ");
        return String.join(" ",Arrays.copyOfRange(word,0,k));
    }
}