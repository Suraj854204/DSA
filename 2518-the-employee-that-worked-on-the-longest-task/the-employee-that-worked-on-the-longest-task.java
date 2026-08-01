class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int prevend=0;
        int maxduration=0;
        int ans=0;
        
        for(int []log:logs){
            int id=log[0];
            int duration=log[1]-prevend;
            if(duration>maxduration || duration==maxduration && id<ans){
                maxduration=duration;
                ans=id;
            }

           prevend=log[1];
        }
        return ans;
    }
}