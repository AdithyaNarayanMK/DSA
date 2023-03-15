package LeetCodeContest;

public class CounttheNumberofVowelStringsinRange {

    public static int vowelStrings(String[] words, int left, int right) {
        char[] vowel = {'a', 'e', 'i', 'o','u'};
       int answer =0 ;
        for(int i=left;i<=right;i++){
            String word = words[i];
            boolean start = check(word.charAt(0),vowel);
            boolean end = check(word.charAt(word.length()-1),vowel);
            if(start && end)
                answer++;
        }
        return answer;
    }
    public static boolean check(char letter,char[] vowel){
        for(int j=0;j<vowel.length;j++){
            if(letter == vowel[j])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"are","amy","u"};
        int ans = vowelStrings(words,0,2);
        System.out.println(ans);
    }
}
