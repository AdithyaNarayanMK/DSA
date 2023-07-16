package ArraysHashMap.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsandStones771 {

    /*
       ### Logic - Traverse through the characters of jewels string and for each character count its occurrence
           in stones string but incrementing ans pointer.

           T.C - O(n*m)[due to nested loop] where n - length of jewels , m - length of stones
           S.C - 0(1)
     */

    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<jewels.length();i++){
            for(int j =0;j<stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j))
                    ans++;
            }
        }
        return ans;
    }

    /*
        ### create an HashSet and add all characters of jewels in that set .
        ### Then for each character in stones string check whether the hashset contains that character then increment
        the ans val and return it.

        T.C - O(n+m)
        S.C - O(n)
     */
    public int numJewelsInStonesHashMap(String jewels, String stones) {
        int ans=0;
        Set<Character> set = new HashSet<>();
        for(char c: jewels.toCharArray()){
            set.add(c);
        }
        for(int j =0;j<stones.length();j++){
            if(set.contains(stones.charAt(j)))
                ans++;
        }
        return ans;
    }
}
