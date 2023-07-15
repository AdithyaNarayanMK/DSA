package CollegeContest;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int len1 = s.nextInt();
            int[] arr1 = new int[len1];
            for(int i=0;i<len1;i++){
                arr1[i] = s.nextInt();
            }
            int len2 = s.nextInt();
            int[] arr2 = new int[len2];
            for(int j=0;j<len2;j++){
                arr2[j] = s.nextInt();
            }

            int[] arr3 = new int[len1 + len2];
            System.arraycopy(arr1, 0, arr3, 0, len1);
            System.arraycopy(arr2, 0, arr3, len1, len2);

            Arrays.sort(arr3);
            Median(arr3);
    }
    public static void Median(int[] array)
    {
        int n = array.length;
        if (n % 2 == 0)
        {
            int z = n / 2;
            double temp1 = array[z];
            double temp2 = array[z - 1];

            double ans = (temp1 + temp2)/ 2;
            System.out.println(ans);
        }
        else
        {
            int z = Math.round(n / 2);
            System.out.println(array[z]);
        }
    }

}
