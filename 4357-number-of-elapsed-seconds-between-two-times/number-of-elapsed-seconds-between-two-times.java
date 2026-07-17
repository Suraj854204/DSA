class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return Math.abs(convertToSeconds(endTime) - convertToSeconds(startTime));
    }

    private int convertToSeconds(String time){
        String parts[]=time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int minuts=Integer.parseInt(parts[1]);
        int second=Integer.parseInt(parts[2]);
        return hours*3600 + minuts*60 +second; 

    }
    
}