package LeetCodeContest;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperationstoMakeAllArrayElementsEqual {
    public static void main(String[] args) {
       int[] nums=  {2,9,6,3};
       int[] q = {10};
        System.out.println(minOperations(nums,q));
    }
    public static  List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> answer = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
            }
            long sum1 = 0;
            long sum2 = 0;
            for (int j = 0; j < nums.length; j++) {
                sum1 += Math.abs(nums[j] - query);
                sum2 += Math.min(Math.abs(nums[j] - min) + Math.abs(query - min), Math.abs(nums[j] - max) + Math.abs(query - max));
            }
            answer.add(Math.min(sum1, sum2));
        }
        return answer;
    }
}
