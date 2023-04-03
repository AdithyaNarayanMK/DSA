package LeetCodeContest;

import java.util.ArrayList;

public class NumberofEvenandOddBits {
    public static void main(String[] args) {

    }
    public int[] evenOddBit(int n) {
        int[] answer = new int[2];
        int evencount=0;
        int oddcount = 0;
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
        binary.reverse();

        for(int i=0;i<binary.length();i++){
            if(i%2 == 0 && binary.charAt(i) == '1')
                evencount++;
            else if(i%2 != 0 && binary.charAt(i) == '1')
                oddcount++;
        }
        answer[0] = evencount;
        answer[1] = oddcount;

        return answer;
    }
}
