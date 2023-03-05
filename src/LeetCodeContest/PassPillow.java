package LeetCodeContest;

public class PassPillow {
    public static void main(String[] args) {
        int ans = passThePillow(18,38);
        System.out.println(ans);
    }
    public static int passThePillow(int n, int time) {
        int[] arr = new int[time+1];
        int i = 0;
        int j = 1;
        while(j<=time+1){
            while(j-1<=time && i<n){
                arr[j-1]=++i;
                j++;
            }
            while (i>1 && j<=time+1){
                arr[j-1] = --i;
                j++;
            }
        }
        System.out.println(arr[time]);
        return arr[time];
    }
}
