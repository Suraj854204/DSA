class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>list=new ArrayList<>();
        helper(list,"",0,0,n);
        return list;
    }
    private void helper(ArrayList<String>list,String s,int open,int close,int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            helper(list,s+"(",open+1,close,n);
        };
        if(close<open){
            helper(list,s+")",open,close+1,n);
        };
    }
}