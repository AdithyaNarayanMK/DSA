package Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurence {
    public static void main(String[] args) {
        int oddOccurrence = 0;
        Scanner s  = new Scanner(System.in);
        int len = s.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         int[] arr = new int[len];
         for(int i=0;i<len;i++){
             arr[i] = s.nextInt();
         }

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddOccurrence++;
            }
        }
        System.out.println(oddOccurrence);

    }
}
