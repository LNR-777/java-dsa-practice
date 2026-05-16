package arrays;

// Problem: Find max profit from one buy and one sell (buy before sell).
// Naive approach: check every pair (buy day, sell day) — O(n^2).
// Better approach: track the minimum price seen so far as we walk forward.
//   At every price, the best profit we can make TODAY is:
//   currentPrice - minPriceSoFar
//   We keep updating the global maxProfit with this value.
//   We never need to look back — one pass is enough.
// Time: O(n) — single pass
// Space: O(1) — two variables only

public class BestTimeToBuyStock {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];          // found a cheaper buy day
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        // Output: 5  -  buy at 1, sell at 6

        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        // Output: 0  -  prices only fall, no profit possible

        System.out.println(maxProfit(new int[]{1, 2}));
        // Output: 1  -  buy at 1, sell at 2
    }
}