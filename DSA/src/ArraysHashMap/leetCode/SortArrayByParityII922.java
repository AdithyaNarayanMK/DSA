package ArraysHashMap.leetCode;

import java.util.Arrays;

public class SortArrayByParityII922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int oddIndex = 1;
        for (int evenIndex=0;evenIndex< nums.length;evenIndex+=2){
            if(nums[evenIndex] % 2 == 1) {
                while (nums[oddIndex] % 2 == 1)
                    oddIndex += 2;

                int temp = nums[oddIndex];
                nums[oddIndex] = nums[evenIndex];
                nums[evenIndex] = temp;
            }
        }
         return nums;
    }

    public static void main(String[] args) {
        int[] nums ={2,3};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
}
