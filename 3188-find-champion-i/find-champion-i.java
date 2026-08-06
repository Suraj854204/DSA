class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        for(int j=0;j<n;j++){
            boolean champion=true;

            for(int i=0;i<n;i++){
                if(i!=j && grid[i][j]==1){
                    champion=false;
                }
            }
            if(champion){
                return j;
            }


        }
        return -1;
    }
}