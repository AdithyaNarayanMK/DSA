package LeetCodeContest.WeeklyContest354;

public class SumofSquaresofSpecialElements {
    public static int sumOfSquares(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for(int i=1;i<=len;i++){
            if(len%i == 0){
                ans += nums[i-1]*nums[i-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));
    }
}
