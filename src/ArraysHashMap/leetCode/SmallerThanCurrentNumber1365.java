package ArraysHashMap.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallerThanCurrentNumber1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j = (i+1)%nums.length;
            while (i!=j){
                if(nums[j] < nums[i])
                    count++;
                j = (j+1)%nums.length;
            }
            ans[i] = count;
            count =0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] sol = smallerNumbersThanCurrent(nums);
    }
}
