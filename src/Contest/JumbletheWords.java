package Contest;

import java.util.Scanner;

public class JumbletheWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String one = s.next();
        String two = s.next();

        int len=Math.min(one.length(),two.length());
        StringBuilder answer = new StringBuilder();
        for(int i =0;i<len;i++){
            answer.append(one.charAt(i));
            answer.append(two.charAt(i));
        }

        if(one.length() > two.length()){
            answer.append(one.substring(len));
        }
        if(one.length() < two.length()){
            answer.append(two.substring(len));
        }

        System.out.println(answer);
    }
}
