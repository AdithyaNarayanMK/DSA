package ArraysHashMap.leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum01 {
    //Solution by  Brute Force
    //TC = O(N^2)
    //SC = O(1) -  The space required does not depend on the size of the input array, so only constant space is used.
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1]=j;
                }

            }
        }

        return ans;
    }
    //Solution Using HashMap
    //TC = O(N)
    //SC = O(N)
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static void main(String[] args) {

        int[] arr ={2,7,11,15};
        int target = 9;
        int[] sol = twoSumHashMap(arr,target);

    }
}
