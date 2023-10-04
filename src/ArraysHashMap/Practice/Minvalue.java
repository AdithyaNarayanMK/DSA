package ArraysHashMap.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Minvalue {
    public static int minValue(int A[], int B[]){
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        Integer[] integerArray = Arrays.stream(B)
                .boxed()
                .sorted()
                .toArray(Integer[]::new);
        Arrays.sort(integerArray,Collections.reverseOrder());
        int minvalueAns = 0;
        for(int i=0;i<A.length;i++){
            minvalueAns += A[i] * integerArray[i];
        }
        return minvalueAns;
    }

    public static void main(String[] args) {
        int[] a = {6,1,9,5,4};
        int[] b = { 3, 4, 8, 2, 4};
        System.out.println(minValue(a,b));
    }
}
