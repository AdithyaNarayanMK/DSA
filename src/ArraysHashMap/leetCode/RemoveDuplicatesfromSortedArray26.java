package ArraysHashMap.leetCode;

public class RemoveDuplicatesfromSortedArray26 {

    /*
        ### Initialize Two pointers slow = 0 and fast = 1
        ## if given array nums is empty then return 0
        ## For each element, it compares it with the element at the slow pointer.
        ##If the elements are different, it means a new unique element is found.
        In this case, the slow pointer is incremented by 1, and the unique element is assigned to the next
        position at nums[slow].Essentially, we are overwriting duplicate elements with new unique elements in the array.

        T.C - O(N)
        S.C - O(1)

     */
    public  static int removeDuplicates(int[] nums) {
        int slow = 0;
        if(nums.length == 0)
            return 0;
        for(int fast = 1;fast<nums.length;fast++){
            if(nums[slow] != nums[fast])
                nums[++slow] = nums[fast];
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int[] nums = {0 ,0 ,1 ,1 ,1, 2, 2 ,3 ,3 ,4};
        System.out.println(removeDuplicates(nums));
    }
}
