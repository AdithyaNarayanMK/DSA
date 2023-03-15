package ArraysHashMap.leetCode;

import java.util.*;

public class PartitionLabels763 {
    public static List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start=0,end=-1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            start = Math.max(start,map.get(s.charAt(i)));
            if(start == i){
                ans.add(start - end);
                end = start;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> answer;
        answer = partitionLabels("hiakhkfafakjkhzmbvmzbmvzmbnz");
        System.out.println(answer);
    }
}
