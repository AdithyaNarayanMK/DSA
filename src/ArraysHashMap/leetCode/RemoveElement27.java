package ArraysHashMap.leetCode;

import java.util.Arrays;

public class RemoveElement27 {

    /*
        ##  we iterate through the array and if a non-val element is found then move the element
        to front of the array i.e. in the place of the last val element present i.c kth index
        T.C - The solution iterates through the array once, examining each element. The number of iterations is
              directly proportional to the size of the input array. Therefore, the time complexity is linear, or O(n).
     */
    public int removeElement(int[] nums, int val) {
        int k = 0; // Variable to store the count of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the non-val element to the front
                k++; // Increment the count of non-val elements
            }
        }

        return k;
    }
}
