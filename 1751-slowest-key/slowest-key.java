class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char ans=keysPressed.charAt(0);

        for(int i=1;i<releaseTimes.length;i++){
            int currdur=releaseTimes[i]-releaseTimes[i-1];

            if(currdur>max){
                max=currdur;
                ans=keysPressed.charAt(i);
            }else if(currdur==max && keysPressed.charAt(i)>ans){
                ans=keysPressed.charAt(i);
            }
        }
        return ans;
    }
}