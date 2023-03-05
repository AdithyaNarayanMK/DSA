package LeetCodeContest;

public class EarnPoints {
    public static void main(String[] args) {
        int target = 6;
        int[][] types = {{6,1},{3,2},{2,3}};
        int ans = waysToReachTarget(target, types);
        System.out.println(ans);
    }
    public static int waysToReachTarget(int target, int[][] types) {
        int noOfWays = 0;
        for(int i =0;i<types.length;i++){
            if(types[i][1] <target){
                int temp = types[i][1];
                while (temp < types[i][0])
                    temp+=types[i][1];
                if(temp == target)
                    noOfWays++;
            }
            break;
        }
        return noOfWays;
    }
}
