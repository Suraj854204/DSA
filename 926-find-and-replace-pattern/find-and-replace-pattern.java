class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>result=new ArrayList<>();
        for(String word:words){
            if(match(word,pattern)){
                result.add(word);
            }
        }
        return result;
    }
    private boolean match(String word,String pattern){
       HashMap<Character,Character>map=new HashMap<>();
       HashSet<Character>user=new HashSet<>();
       for(int i=0;i<word.length();i++){
        char p=pattern.charAt(i);
        char w=word.charAt(i);
        if(map.containsKey(p)){
            if(map.get(p)!=w)return false;
        }else{
            if(user.contains(w)){
                return false;
            }
            map.put(p,w);
            user.add(w);
        }
       }
       return true;
    }
}