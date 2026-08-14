class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n=prices.length;
        int m=discounts.length;
        double total=0;

        int discountIndex=m-1;
        for(int i=n-1;i>=0;i--){
          
            if(discountIndex>=0){
               //used formula (p * (100 - d)) / 100
               double discountPrice=prices[i]*(100 - discounts[discountIndex])/100.0;
               total+=discountPrice;
               discountIndex--;
            }else{
                total+=prices[i];
            }

        }
        return total;
    }
}