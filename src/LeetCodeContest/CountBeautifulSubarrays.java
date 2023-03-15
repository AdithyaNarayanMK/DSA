package LeetCodeContest;

public class CountBeautifulSubarrays {
    public long beautifulSubarrays(int[] nums) {
        int count=0;
        String[] binaryArray;
        for(int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;i++){
                binaryArray = new String[(j-i)+1];
                for (int k=0;k<binaryArray.length;k++){
                    binaryArray[k] = Integer.toBinaryString(nums[k]);
                }



            }
        }

        return count;
    }
}
