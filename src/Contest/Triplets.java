package Contest;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int alicepoints = 0;
        int bobpoints = 0;
        for(int i=0;i<3;i++){
            alice[i] = s.nextInt();
        }
        for(int i=0;i<3;i++){
            bob[i] = s.nextInt();
        }

        for(int i=0;i<3;i++){
            if(alice[i] > bob[i])
                alicepoints++;
            else if(bob[i] > alice[i])
                bobpoints++;
            else
                continue;
        }
        System.out.println(alicepoints +" "+bobpoints);
    }
}
