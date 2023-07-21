package LeetCodeContest.WeeklyContest354;

import java.util.*;

public class MinimumIndexofaValidSplit {
    public static int minimumIndex(List<Integer> nums) {
        int spiltIndex = 0;
        int leftdom = 0, rightdom = 0;
        while(spiltIndex < nums.size()){
                leftdom = findDominant(0,spiltIndex,nums);
                rightdom =  findDominant(spiltIndex+1,nums.size()-1,nums);
            if(leftdom == rightdom)
                return spiltIndex;
            else
                spiltIndex++;
        }
        return -1;
    }
    public static int findDominant(int x,int y,List<Integer> nums){
//        int m = y - x + 1;
//        int occ = 0;
//        int dom = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i = x; i<=y;i++){
//            for (int j = i;j <=y;j++){
//                if(Objects.equals(nums.get(j), nums.get(i)))
//                    occ++;
//            }
//            if(occ * 2 >m)
//                dom = nums.get(i);
//            occ = 0;
//        }
//    return dom;
        int m = y - x + 1;
        int dominant = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = x; i <= y; i++) {
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) * 2 > m)
                dominant = num;
        }
        return dominant;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int[] num = {3,3,3,3,7,2,2};
        for(int n : num){
            nums.add(n);
        }

        System.out.println(minimumIndex(nums));
    }
}
