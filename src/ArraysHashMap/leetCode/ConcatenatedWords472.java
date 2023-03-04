package ArraysHashMap.leetCode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcatenatedWords472 {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<Character,List<String>> map = new HashMap<>();

        for (int i=0;i<words.length;i++){
            map.computeIfAbsent(words[i].charAt(0), k -> new ArrayList<>());
        }
        Set<Character> keys  = map.keySet();
        for(int key : keys){
           for (int j=0;j<words.length;j++){
               if(words[j].charAt(0) == key)
                   map.get(key).add(words[j]);
           }
        }
        int[] sub = new int[words.length];
        for(int i=0;i<words.length;i++){
            String word  = words[i];
            Pattern pattern = Pattern.compile(word);
            for(int j =i+1;j<words.length;j++){
                String temp = words[j];
                Matcher matcher = pattern.matcher(temp);
                System.out.println(matcher.find());
            }

        }
        return null;
    }

}
