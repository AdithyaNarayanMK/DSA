package ArraysHashMap.leetCode.BinarySearch;

public class CountNegativeNumbersinaSortedMatrix1351 {
    public  static int countNegatives(int[][] grid) {
        int len = grid[0].length;
        int count = 0;
        for(int[] num : grid){
            int start = 0;
            int end = len - 1;
            int mid = (start + end) / 2;
            while (start<=end){
                if(num[mid] < 0){
                    end = mid - 1;
                }else {
                    end = mid - 1;
                }
            }
            count+= len - start;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        int[][] grid = {{5,1,0},{-5,-5,-5}};
        int[][] grid = {{3,-1,-3,-3,-3},{2,-2,-3,-3,-3},{1,-2,-3,-3,-3},{0,-3,-3,-3,-3}};

        System.out.println(countNegatives(grid));
    }
}
