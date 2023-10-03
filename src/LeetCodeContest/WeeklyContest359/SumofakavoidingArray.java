package LeetCodeContest.WeeklyContest359;

import java.util.ArrayList;

public class SumofakavoidingArray {
    public static int minimumSum(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> notoavoid = new ArrayList<>();
        int num = 1;
        int sum = 0;
        while (arr.size() < n){
            if(!notoavoid.contains(num)){
                arr.add(num);
                sum+=num;
                notoavoid.add(Math.abs(num - k));
            }


            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2,6));
    }
}

