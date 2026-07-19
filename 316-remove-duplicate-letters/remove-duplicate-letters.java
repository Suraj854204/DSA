class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']=i;
        }
        Stack<Character>stack=new Stack<>();
        HashSet<Character>set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                continue;
            }

            while(!stack.isEmpty() && stack.peek()>ch && freq[stack.peek()-'a']>i){
                set.remove(stack.pop());
            }
            stack.push(ch);
            set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}