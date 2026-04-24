import java.util.*;
class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i = 0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            profit = prices[i] - buy;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}