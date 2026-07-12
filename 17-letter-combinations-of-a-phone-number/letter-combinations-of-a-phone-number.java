class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        String []mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helpher(result,digits,0,new StringBuilder(),mapping);
        return result;
    }
    private void helpher(List<String>result,String digits,int index,StringBuilder current,String []mapping){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            helpher(result,digits,index+1,current,mapping);
            current.deleteCharAt(current.length()-1);
        }

    }
}