package CollegeContest;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] frequency = new int[6]; // frequency[i] stores the frequency of bird type i
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        int maxFrequency = 0;
        int mostFrequentType = 0;
        for (int i = 1; i <= 5; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentType = i;
            }
        }

        System.out.println(mostFrequentType);

    }
}
