package array;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,5,3,8,2,1};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue = prices[i];

            }else if(prices[i] - minValue > maxProfit){
                maxProfit =prices[i]-minValue;
            }
        }
        return maxProfit;

    }
}
