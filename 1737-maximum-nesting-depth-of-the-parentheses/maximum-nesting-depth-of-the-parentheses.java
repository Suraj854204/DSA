class Solution {
    public int maxDepth(String s) {
        int max=0;
        int step=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                step++;
            }else if(ch==')'){
                step--;
            }
            max=Math.max(max,step);
        }
        return max;
    }
}