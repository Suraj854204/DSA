class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<j;k++){
                   int xor1=0,xor2=0;
                   for(int x=i;x<=j;x++){
                    xor1^=arr[x];
                   }
                   for(int x=j;x<=k;x++){
                    xor2^=arr[x];
                   }
                   if(xor1==xor2){
                    count++;
                   }
                }
            }
        }
        return count;
        
    }
}