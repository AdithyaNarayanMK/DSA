package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervalsofArray {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,
                Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> mergedList = new ArrayList<>();
        for(int[] list : intervals){
            if(mergedList.isEmpty()){
                mergedList.add(list);
            }if(mergedList.get(mergedList.size()-1)[0] ==1){

            }
        }
        return null;
    }

}
