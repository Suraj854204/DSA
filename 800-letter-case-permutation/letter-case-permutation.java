class Solution {
    public List<String> letterCasePermutation(String S) {
        LinkedList<String>list=new LinkedList<>();
        list.add(S);

        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isLetter(ch)){
                for(int size=list.size();size>0;size--){
                    String s=list.poll(),left=s.substring(0,i),right=s.substring(i+1);
                    list.add(left + Character.toLowerCase(ch)+right);
                    list.add(left+ Character.toUpperCase(ch)+right);

                }
            }
        }
        return list;
    }
}