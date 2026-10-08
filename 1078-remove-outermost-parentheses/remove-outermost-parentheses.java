class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char num:s.toCharArray()){
            if(num=='('){
                if(count>0){
                    sb.append(num);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    sb.append(num);

                }
            }
        }
        return sb.toString();
    }
}