class Solution {
    public int numSplits(String s) {
       HashMap<Character,Integer>left=new HashMap<>();
       HashMap<Character,Integer>right=new HashMap<>();
       for(char ch:s.toCharArray()){
          right.put(ch,right.getOrDefault(ch,0)+1);
        }
         int count=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            left.put(ch,left.getOrDefault(left,0)+1);
            right.put(ch,right.get(ch)-1);

            if(right.get(ch)==0){
                right.remove(ch);
            }
            if(left.size()==right.size()){
                count++;
            }

        }
        return count;
    }
}