package ArraysHashMap.leetCode;

import java.util.HashMap;

public class MaxProduct1464 {
    public static int maxProduct(int[] nums){
        int maxProduct = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currNumber = nums[i]-1;
            if(map.containsKey(currNumber) && map.get(currNumber) != i){
                int product = (nums[i] - 1) * currNumber;
                maxProduct = Math.max(product, maxProduct);
            }else{
                map.put(nums[i]-1,i);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        maxProduct(nums);
    }
}
