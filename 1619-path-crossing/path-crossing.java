class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String>visited=new HashSet<>();
        int x=0;
        int y=0;
        visited.add("0,0");
        for(char ch:path.toCharArray()){
            if(ch=='N')y++;
            else if(ch=='S')y--;
            else if(ch=='E')x++;
            else if(ch=='W')x--;

            String pos= x+","+y;

            if(visited.contains(pos)){
                return true;
            }
            visited.add(pos);
        }
        return false;
       
    }
}