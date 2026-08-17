class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result="";
        dictionary.sort((String a,String b)->
        a.length()==b.length()?a.compareTo(b):b.length()-a.length());
        for(String str:dictionary){
            if(isSubseqence(s,str)) return result=str;
        }
        return result;
    }
    public boolean isSubseqence(String s,String dictionary){
        int i=0,j=0;
        while(i<s.length() && j<dictionary.length()){
            if(s.charAt(i)==dictionary.charAt(j))j++;
            i++;
        }
        return j==dictionary.length();
    }
}