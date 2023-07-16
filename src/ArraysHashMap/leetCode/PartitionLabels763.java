package ArraysHashMap.leetCode;

import java.util.*;

public class PartitionLabels763 {
    /*
        ### traverse through the string s and store (ch,maxOccurrenceIndex) in hashmap
        ### Now to find partitions length we use two pointers start = 0 and end = -1 initially and then
           finds the positions where the partitions in the input string s should end. It updates the start and end variables
           accordingly and calculates the lengths of the partitions.
           These lengths are then added to the ans list, which is returned at the end of the function.

           here technically the start and end pointer role is inverse

        T.C - O(N)
        S.C - O(1) - The solution uses hashmap to store the last occurrence index of elements in string s
                     which is at most 26 for lowercase English letters -  Therefore, the space complexity can
                      be considered constant or O(1) in practice.
                     here we use Arraylist to store partition length which is typically smaller than length of
                     input string - Thus, it does not contribute significantly to the space complexity.
                     By these two we can conclude that space complexity is O(1).
     */

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
        answer = partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(answer);
    }
}
