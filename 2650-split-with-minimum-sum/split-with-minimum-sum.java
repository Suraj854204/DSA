class Solution {
    public int splitNum(int num) {
        char[]digit=String.valueOf(num).toCharArray();
        Arrays.sort(digit);
        int num1=0;
        int num2=0;
        for(int i=0;i<digit.length;i++){
            if(i%2==0){
                num1=num1*10+(digit[i]-'0');
            }else{
                num2=num2*10+(digit[i]-'0');
            }

        }
        return num1+num2;
    }
}