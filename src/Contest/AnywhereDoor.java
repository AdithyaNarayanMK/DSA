package Contest;

import java.util.Scanner;

public class AnywhereDoor {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        for(int i=0; i<26; i++){
            alphabet[i] = (char) ('a' + i);
        }
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine().trim().toLowerCase().replace(" ", "");;
        char[] sen = sentence.toCharArray();
        boolean flag = true;
        for(int i=0;i<alphabet.length;i++){
            boolean present = check(alphabet[i] , sen);
            if(!present){
                System.out.println("not pangram");
                flag = false;
            }
        }
        if(flag)
            System.out.println("pangram");

    }
    public static boolean check(char letter ,char[] sen){
        for(int j=0;j<sen.length;j++){
            if(sen[j] == letter)
                return true;
        }
        return false;
    }
}
