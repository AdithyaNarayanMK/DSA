package LeetCodeContest;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Coprime {
    public static void main(String[] args) {
        int[] nums = {4,7,15,8,3,5};
        int ans = findValidSplit(nums);
        System.out.println(ans);
    }
    public static int findValidSplit(int[] nums){
        int index = -1;
        for (int i=0;i<nums.length-1;i++){
            BigInteger num1 = BigInteger.valueOf(calculateLeft(nums,i));
            BigInteger nums2 = BigInteger.valueOf(calculateRight(nums,i+1));
            BigInteger gcd = num1.gcd(nums2);
            int g = gcd.intValue();
            if(g == 1){
                index = i;
                break;
            }
        }

        return index;
    }
    public static int calculateLeft(int[] nums,int index){
        int leftpro = 1;
        for(int k=0;k<=index;k++){
            leftpro*=nums[k];
        }
        return leftpro;
    }
    public static int calculateRight(int[] nums,int index){
        int rightpro = 1;
        for(int k=index;k<nums.length;k++){
            rightpro*=nums[k];
        }
        return rightpro;
    }
}
