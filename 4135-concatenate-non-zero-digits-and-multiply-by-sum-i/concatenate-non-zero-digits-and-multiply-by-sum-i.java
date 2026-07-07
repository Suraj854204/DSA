class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        long placeholder=1;
        long rev=0;
        int sum=0;
        while(0<n){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
                rev= digit * placeholder + rev;
                placeholder*=10;
            }
            n=n/10;
        }
        return rev*sum;
        
    }
}