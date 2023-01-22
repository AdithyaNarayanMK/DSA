package ArraysHashMap.leetCode;

import java.util.Arrays;

public class SortColors75 {

    public static int[] sortColors(int[] nums) {
//Simiplified code :
//        int[] countArr = new int[3];
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0) countArr[0]++;
//            else if(nums[i] == 1) countArr[1]++;
//            else countArr[2]++;
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(i < countArr[0]) nums[i] = 0;
//            else if(i < countArr[0]+countArr[1]) nums[i] = 1;
//            else nums[i] = 2;
//        }
        int red =0,white=0,blue=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                red++;
            if(nums[i] == 1)
                white++;
            if(nums[i] == 2)
                blue++;
        }
        int j= 0;
        while (j<red){
            nums[j] = 0;
            j++;
        }
        int i = j;
        while (i<white+red) {
            nums[i] = 1;
            i++;
        }
        j=j+white;
        while (j< nums.length){
            nums[j] = 2;
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
