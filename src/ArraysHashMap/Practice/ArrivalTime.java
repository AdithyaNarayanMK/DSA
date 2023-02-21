package ArraysHashMap.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrivalTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int initialhour = s.nextInt(),initialmin = s.nextInt();
        int finalhour = s.nextInt(),finalmin = s.nextInt();
        int arrivalhour = 0, arrivalmin = 0;
        arrivalmin = initialmin + finalmin;
        arrivalhour = initialhour+finalhour;
        if(arrivalmin > 60){
            arrivalmin = arrivalmin - 60;
            arrivalhour++;
        }
        System.out.println(arrivalhour + " "+arrivalmin);

    }
}
