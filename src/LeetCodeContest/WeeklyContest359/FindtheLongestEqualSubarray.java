package LeetCodeContest.WeeklyContest359;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindtheLongestEqualSubarray {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int x: nums){
            ArrayList temp = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if(x == nums.get(j)){
                    temp.add(j);
                }
            }
            map.put(x,temp);
        }
        System.out.println(map.toString());
        return 0;
    }
}

