package Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirdsMigration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] birdarr = new int[num];
        for(int i=0;i<num;i++){
            birdarr[i] = s.nextInt();
        }
        int answer = mostFrequent(birdarr);
        System.out.println(answer);

    }
        public static int mostFrequent(int[] arr) {
            HashMap<Integer, Integer> count = new HashMap<>();
            int maxCount = 0;
            int mostFrequent = 0;

            for (int i = 0; i < arr.length; i++) {
                if (!count.containsKey(arr[i])) {
                    count.put(arr[i], 1);
                } else {
                    count.put(arr[i], count.get(arr[i]) + 1);
                }

                if (count.get(arr[i]) > maxCount) {
                    maxCount = count.get(arr[i]);
                    mostFrequent = arr[i];
                } else if (count.get(arr[i]) == maxCount && arr[i] < mostFrequent) {
                    mostFrequent = arr[i];
                }
            }

            return mostFrequent;
        }
    }
