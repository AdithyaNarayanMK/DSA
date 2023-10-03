package LeetCodeContest.WeeklyContest359;

import java.util.List;

public class AcronymofWords {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acryonym = new StringBuilder();

        for(int i=0;i< words.size();i++){
            acryonym.append(words.get(i).charAt(0));
        }
        if(acryonym.toString().equals(s)){
            return true;
        }
        return false;
    }
}
