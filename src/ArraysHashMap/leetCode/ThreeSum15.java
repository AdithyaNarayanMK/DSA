package ArraysHashMap.leetCode;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ansList = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> twoElements = findTwoSum(nums,0-nums[i],i);
            if(!twoElements.isEmpty()){
                for(int k=0;k<twoElements.size();k++){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(twoElements.get(k).get(0));
                    ans.add(twoElements.get(k).get(1));
                    Collections.sort(ans);
                    ansList.add(ans);
                }
            }
        }
        return ansList.stream().toList();
    }
    public static List<List<Integer>> findTwoSum(int[] nums, int target,int firstElement) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> answers = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i != firstElement){
                int difference = target - nums[i];
                if(map.containsKey(difference)){
                    answers.add(List.of(nums[i],nums[map.get(difference)]));
                    //return new int[]{nums[i],nums[map.get(difference)]};
                }
                map.put(nums[i],i);
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
