class Solution {
    public String reformatDate(String date) {
        HashMap<String,String>months=new HashMap<>();
        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");

        String[]dates=date.split(" ");
        StringBuilder sb=new StringBuilder();
        sb.append(dates[2]+"-");
        sb.append(months.get(dates[1])+"-");
        String day=dates[0].substring(0,dates[0].length()-2);

        if(day.length()==1){
            sb.append("0"+day);
        }else{
            sb.append(day);
        }
        return sb.toString();


    }
}