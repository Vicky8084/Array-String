package DeepakSir.Programs;

/*
    -------------LeetCode-------------------

121. Best Time to Buy and Sell Stock
Easy
Topics
premium lock icon
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int buyPrice=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int currPrice=prices[i]-buyPrice;
            if(currPrice>maxProfit){
                maxProfit=currPrice;
            }
            if(buyPrice>prices[i]){
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Profit is :- "+maxProfit(prices));
    }
}
