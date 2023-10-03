package Sorting;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int mergep = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[mergep--] = nums1[p1--];
            }else{
                nums1[mergep--] = nums2[p2--];
            }
        }

    }

    public static void main(String[] args) {
        merge(new int[]{1,3,4,4,5,0,0,0,0},5,new int[]{2,4,6,7},4);
    }
}
