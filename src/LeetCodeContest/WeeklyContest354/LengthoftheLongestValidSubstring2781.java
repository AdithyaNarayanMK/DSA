package LeetCodeContest.WeeklyContest354;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LengthoftheLongestValidSubstring2781 {
    public static int longestValidSubstring(String word, List<String> forbidden) {
        Set<String> invaild = new HashSet<>();
        invaild.addAll(forbidden);
        /*
        for(String currWord: forbidden)
            invaild.add(currWord);
         */
        int ans = 0;
        int currRight = word.length()-1;


        for(int left = word.length()-1;left>=0;left--){
            for(int right = left;right<=Math.min(left+10,currRight);right++){
                String curr = word.substring(left,right+1);
                if(invaild.contains(curr))
                    currRight = right-1;
            }
            ans = Math.max(ans,currRight-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String word = "cbaaaabc";
        List<String> forbidden  = List.of(new String[] {"aaa", "cb"});
        System.out.println(longestValidSubstring(word,forbidden));
    }
}
