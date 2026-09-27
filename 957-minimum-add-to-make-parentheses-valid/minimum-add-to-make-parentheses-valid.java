class Solution {
    public int minAddToMakeValid(String s) {
        int openbracket=0;
        int minreq=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                openbracket++;
            }else{
               if(openbracket>0){
                openbracket--;
               }else{
                minreq++;
               }
            }
        }
        return minreq+openbracket;
    }
}