package ForStart;

import java.util.ArrayList;
import java.util.Collections;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int tempMinValue = Integer.MAX_VALUE;
        ArrayList<Integer> profit = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (tempMinValue > prices[i]) {
                tempMinValue = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    if (tempMinValue < prices[j]) {
                        profit.add(prices[j] - tempMinValue);
                    }
                }
            }
        }
        if(!profit.isEmpty()){
            return Collections.max(profit);
        }
        return 0;
    }
}
