package ArraysHashMap.leetCode;

import java.util.HashMap;

public class Subarraysumk {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int possibleSubarrays = 0;
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        for(int j =0;j<nums.length;j++){// 0 1
            int m = j+1;
            if(map.get(j) == k){
                possibleSubarrays++;
            }
            while (m<nums.length){// 1 2
                map.put(j, map.get(j) + nums[m]);
                if(map.get(j) == k){
                    possibleSubarrays++;
                }
                m++;
            }
        }
        return possibleSubarrays;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
}
