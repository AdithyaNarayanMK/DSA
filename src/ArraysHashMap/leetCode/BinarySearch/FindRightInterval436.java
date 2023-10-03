package ArraysHashMap.leetCode.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindRightInterval436 {
    public static int[] findRightInterval(int[][] intervals) {
        //int[][] temp =Arrays.copyOf(intervals,intervals.length);
        int[][] intervalsSorted = Arrays.copyOf(intervals,intervals.length);;
        int[] ans = new int[intervals.length];
        Arrays.sort(intervalsSorted, Comparator.comparingInt(a -> a[0]));
       // System.out.println(Arrays.deepToString(intervalsSorted));
            for(int j=0;j<intervals.length;j++){
                int rightInterval = find(0,intervals.length-1,intervals[j][0],intervalsSorted);
                if(rightInterval == -1)
                    ans[j] = -1;
                else
                    ans[j] = findIndex(rightInterval,intervals);
            }
        return ans;
    }

    public static int findIndex(int element, int[][] intervals){
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0] == element)
                return i;
        }
        return -1;
    }

    public static int find(int start, int end, int element, int[][] intervals){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(intervals[mid][0] == element){
                if(mid < intervals.length-1){
//                    return (intervals[mid+1][0] >= intervals[mid][1]) ? intervals[mid+1][0] :  -1;
                    for(int i=mid ; i<intervals.length-1;i++){
                        int ele = intervals[mid][1];
                        if(intervals[i+1][0] >= ele)
                            return intervals[i+1][0];
                    }
                }
                else
                    return -1;
                 //return (mid < intervals.length) ? ((intervals[mid+1][0] >= intervals[mid][1]) ? intervals[mid+1][0] :  -1) : -1;
            }else if(intervals[mid][0] >= element){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,12},{2,9},{3,10},{13,14},{15,16},{16,17}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
}
