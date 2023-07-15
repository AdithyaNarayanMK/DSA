package CollegeContest;

import java.util.Scanner;

public class StockProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] array = new int[len];
        for (int i =0;i<len;i++){
            array[i] = s.nextInt();
        }
        StockProfit(array);
    }
    public static void StockProfit(int[] prices) {
        int l=prices.length;

        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<l; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        System.out.println(maxProfit);
    }
}
