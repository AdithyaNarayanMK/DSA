package Contest;

import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int answer = 0;
        // System.out.println(input);
        for(int i=0;i<input.length();i++){
            String onedigit = input.substring(i,i+1);
            for(int j=i+1;j<input.length();j++){
                String twodigit = input.substring(i,j+1);
                int val2 = Integer.parseInt(twodigit);

                if (val2 >= 10 && val2<= 26) {
                    answer++;
                }
            }
            int val1 = Integer.parseInt(onedigit);
            if (val1 >= 1 && val1 <= 9) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
