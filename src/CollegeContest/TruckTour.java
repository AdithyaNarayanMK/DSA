package CollegeContest;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfBunks = s.nextInt();
        int[] petrol = new int[noOfBunks];
        int[] distance = new int[noOfBunks];
        for(int i=0;i<noOfBunks;i++){
            petrol[i] = s.nextInt();
        }
        for(int i=0;i<noOfBunks;i++){
            distance[i] = s.nextInt();
        }
        int ans = tour(petrol,distance,noOfBunks);
        System.out.println(ans);
    }
    public static int tour(int[] petrol,int[] distance,int length){
        int start = 0;
        int end = 1;
        int petrol_level = petrol[start] - distance[start];
        while(end != start || petrol_level < 0) {
            while(petrol_level < 0 && start != end) {
                petrol_level -= petrol[start] - distance[start];
                start = (start + 1) % length;
                if(start == 0)
                    return -1;
            }
            petrol_level += petrol[end] - distance[end];

            end = (end + 1)%length;
        }
        return start;
    }

}
