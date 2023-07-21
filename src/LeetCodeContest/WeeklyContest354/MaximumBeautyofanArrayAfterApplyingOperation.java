package LeetCodeContest.WeeklyContest354;



public class MaximumBeautyofanArrayAfterApplyingOperation {
    static int offset = 100000;
    public static int maximumBeauty(int[] nums, int k) {
        int[] freq = new int[300002];
        for(int i=0;i<nums.length;i++){
            int start = nums[i] - k;
            int end = nums[i] + k;

            freq[start+offset]++;
            freq[end+offset+1]--;
        }
        int ans = freq[0];
        for(int j=1;j<300002;j++){
            freq[j] += freq[j-1];
            ans = Math.max(ans,freq[j]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,6,1,2};
        int k =2;
        System.out.println(maximumBeauty(nums,k));
    }
}

/*
    public static int maximumBeauty(int[] nums, int k) {
        int beauty = 0;
        Arrays.sort(nums);
        List<int[]> range = new ArrayList<>();
        ArrayList<Integer> beautyArray = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int[] subseq = generateArray(nums[i] - k,nums[i]+k);
            range.add(subseq);
        }
        for(int j=0;j<range.size()-1;j++){
            int[] arr1 =  range.get(j);
            int[] arr2;
            for(int x = 0;x<range.size();x++){
                arr2 =  range.get(x%range.size());
                int commonvalue = findCommonValue(arr1,arr2);
                if(commonvalue != Integer.MIN_VALUE)
                    beauty++;
            }
            beautyArray.add(beauty);
            beauty = 0;
        }

        return Collections.max(beautyArray);
    }

    private static int findCommonValue(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int p =0;p<arr1.length;p++){
            int searchElement = arr1[p];
            boolean search = SearchForIntersection(searchElement,arr2);
            if(search)
                intersection.add(searchElement);
        }
        if(intersection.isEmpty())
            return Integer.MIN_VALUE;
        else
            return Collections.min(intersection);

    }

    private static boolean SearchForIntersection(int searchElement, int[] arr2) {
        int start2 = 0,end2 = arr2.length-1;

        while (start2 <= end2) {
            int mid2 = start2 + (end2 - start2) / 2;

            if (searchElement == arr2[mid2])
                return true;
            else if (searchElement < arr2[mid2]) {
                end2 = mid2 - 1;
            } else {
                start2 = mid2 + 1;
            }
        }
        return false;
    }

    private static int[] generateArray(int i, int j) {
        int[] ans = new int[j-i+1];
        for(int m = 0 , n=i;m<j-i+1;n++,m++){
            ans[m] = n ;
        }
        return ans;
    }
 */
