package ArraysHashMap.leetCode;

import java.util.Arrays;

public class MergeSortedArray88 {

    //1st Logic :
    /*
        Step 1 - Traverse the nums2 array and append the elements in nums1 starting from mth index.
        Step 2 - Then Sort the nums1 array using sort method.

        T.C  - [O(m+n)log(m+n)](Due to sort method)
        S.C  - O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    //2nd Logic : Two pointers
    /*
        ### initialize the 2 pointers i = m - 1 (pointing at mth index i.e. 1st zero , largest element in the array) and
        j = n - 1 (pointing at last element of nums2 i.e. Largest element in array) and
        k = m+n-1(last index of nums1 array) for arranging the  larger elements inplace.
        ### Now we start iterating the both arrays from ith and jth index compare those elements
        we place the largest element in kth index and the decrement the corresponding pointer i or j accordingly
        ### We continue it until we have iterated over all the elements in nums2 and if there are elements left in nums1
        we don't need to do anything as the elements are already in correct positions.

        T.C  - O(m+n)
        S.C  - O(1)
     */
    public void mergeTwoPointers(int[] nums1,int m,int[] nums2,int n){
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (j >= 0){
            if(i>=0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }

}
