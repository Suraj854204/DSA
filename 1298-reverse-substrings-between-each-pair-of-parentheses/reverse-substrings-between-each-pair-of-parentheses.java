class Solution {
    public String reverseParentheses(String s) {
       Stack<String>stack=new Stack<>();
       StringBuilder ans=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(ch=='('){
            stack.push(ans.toString());
            ans.setLength(0);
        }else if(ch==')'){
            ans.reverse();
            ans.insert(0,stack.pop());
        }else{
            ans.append(ch);
        }
       }
       return ans.toString();
    }
}