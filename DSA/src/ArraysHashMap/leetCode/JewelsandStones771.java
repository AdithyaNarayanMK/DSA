package ArraysHashMap.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsandStones771 {
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
