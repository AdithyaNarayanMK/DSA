package LeetCodeContest.WeeklyContest363;

import java.util.List;

public class SumOfValueOfKbits {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        return 0;
    }

    private static int countSetBits(String numBinary) {
        int setBit = 0;
        for(char bit :numBinary.toCharArray()){
            if(bit == '1'){
                setBit++;
            }
        }
        return setBit;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,1,5,2};
        sumIndicesWithKSetBits(List.of(5,10,1,5,2),1);
    }
}
