class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        for(String command:commands){
            char direction=command.charAt(0);

            if(direction == 'U'){
                i--;
            }else if(direction == 'D'){
                i++;
            }else if(direction == 'R'){
                j++;
            }else{
                j--;
            }
        }
        return n*i+j;
    }
}