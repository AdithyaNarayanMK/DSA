package ArraysHashMap.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        spiralOrder(array);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        List<Integer> answer = new ArrayList<>();
       // boolean[][] boolarray = new boolean[m][n];
        int rbegin = 0, cbegin = 0;
//        while (answer.size() < m * n) {
//            while (cbegin < n) {
//                if(!boolarray[rbegin][cbegin]){
//                    boolarray[rbegin][cbegin]=true;
//                    answer.add(matrix[rbegin][cbegin]);
//                }
//                else
//                    break;
//                cbegin++;
//            }
//            while (rbegin < m) {
//                if(!boolarray[rbegin][cbegin]){
//                    boolarray[rbegin][cbegin]=true;
//                    answer.add(matrix[rbegin][cbegin]);
//                }
//                else
//                    break;
//                rbegin++;
//            }
//            while (cbegin > 0) {
//                if(!boolarray[rbegin][cbegin-1])
//                    cbegin--;
//                if(!boolarray[rbegin][cbegin]){
//                    boolarray[rbegin][cbegin]=true;
//                    answer.add(matrix[rbegin][cbegin]);
//                }
//                else
//                    break;
//            }
//            while (rbegin >= 0) {
//                if(!boolarray[rbegin-1][cbegin])
//                    rbegin--;
//                if(!boolarray[rbegin][cbegin]){
//                    boolarray[rbegin][cbegin]=true;
//                    answer.add(matrix[rbegin][cbegin]);
//                }
//                else
//                    break;
//            }
//
//        }
        while (rbegin <= m && cbegin <= n) {
            // Traverse Right
            for (int j = cbegin; j <= n; j ++) {
                answer.add(matrix[rbegin][j]);
            }
            rbegin++;

            // Traverse Down
            for (int j = rbegin; j <= m; j ++) {
                answer.add(matrix[j][n]);
            }
            n--;

            if (rbegin <= m) {
                // Traverse Left
                for (int j = n; j >= cbegin; j --) {
                    answer.add(matrix[m][j]);
                }
            }
            m--;

            if (cbegin <= n) {
                // Traver Up
                for (int j = m; j >= rbegin; j --) {
                    answer.add(matrix[j][cbegin]);
                }
            }
            cbegin ++;
        }
        System.out.println(answer.toString());
        return answer;
    }
}
