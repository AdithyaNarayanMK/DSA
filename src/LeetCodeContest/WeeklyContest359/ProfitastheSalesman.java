package LeetCodeContest.WeeklyContest359;

import java.util.*;

public class ProfitastheSalesman {
    public static int maximizeTheProfit(int n, List<List<Integer>> offers) {
        ArrayList<Integer> maxProfits = new ArrayList<>();
        int maxProfit = 0;

        for(int i=0;i< offers.size();i++){
            boolean[] houses = new boolean[n];
            if(buyHouses(houses,offers.get(i))){
                maxProfit += offers.get(i).get(2);
            }
         for(int j = 0;j<offers.size();j++){
                if(j!=i && buyHouses(houses,offers.get(j))){
                    maxProfit += offers.get(j).get(2);
                }
            }

            maxProfits.add(maxProfit);
            maxProfit = 0;
        }

        return Collections.max(maxProfits);
    }
    public static boolean buyHouses(boolean[] houses,List<Integer>offer){
        for(int j = offer.get(0);j<=offer.get(1);j++){
            if(houses[j]){
                return false;
            }else{
                houses[j] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> offers = new ArrayList<>();

        // Adding rows to the 2D list
        offers.add(List.of(0,6,5));
        offers.add(List.of(2,9,4));
        offers.add(List.of(0,9,2));
        offers.add(List.of(3,9,3));
        offers.add(List.of(1,6,10));
        offers.add(List.of(0,1,3));
        offers.add(List.of(3,8,9));
        offers.add(List.of(4,8,3));
        offers.add(List.of(2,6,5));
        offers.add(List.of(0,4,6));
        System.out.println(maximizeTheProfit(10,offers));
    }
}
