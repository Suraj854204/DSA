class Solution {
    public List<String> generateParenthesis(int n) {  //USING BACKTRACKING METHOD
       List<String>list=new ArrayList<>();
       helpher(list,"",0,0,n);
        return list;
    }
    private void helpher(List<String>list,String s,int open,int close,int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            helpher(list,s+"(",open+1,close,n);
        };
        if(close<open){
            helpher(list,s+")",open,close+1,n);
        };
    }

   
}