package LeetCodeContest.WeeklyContest354;

import java.util.*;

public class MinimumIndexofaValidSplit {
    /*
        ### Find the Majority Element using Moore's voting Algorithm -
            ## initially consider the 1st element as currCandidate then traverse the array and increment
                currCandidate count if it is found
            ## else decrement the currCandidate count if count is less than 0 then reassign the curr element as the candidate
                element.
        ### Now count the occurrence of the majority element
        T.C - O(N)
        S.C - O(1)
     */
    public static int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int majCt = 0;
        int majElement = getMajorityElement(nums);
        for(int i =0;i<nums.size();i++){
            if(nums.get(i) == majElement){
                majCt++;
            }
        }
        int ans = -1;
        int currCt = 0;
        int firstSubArrayLen = 0;
        for(int i=0;i<n-1;i++){
            firstSubArrayLen++;
            if(nums.get(i) == majElement)
                currCt++;
            if(isMajority(currCt,firstSubArrayLen) && isMajority(majCt - currCt,n - firstSubArrayLen) ){
                return i;
            }
        }
        return ans;
    }

    private static boolean isMajority(int ElementCount, int arrayLen) {
        return (2*ElementCount) > arrayLen;
    }

    private static int getMajorityElement(List<Integer> nums) {
        int currCandidate = nums.get(0);
        int currCandidateCt = 0;
        int n = nums.size();
        for(int i = 1;i<n;i++){
            if(nums.get(i) == currCandidate)
                currCandidateCt++;
            else{
                currCandidateCt--;
                if(currCandidateCt < 0){
                    currCandidateCt = 1;
                    currCandidate = nums.get(i);
                }
            }
        }
        return currCandidate;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(new Integer[] {3,3,3,3,7,2,2});
//        int[] num = {};
//        for(int n : num){
//            nums.add(n);
//        }

        System.out.println(minimumIndex(nums));
    }
    /*
        public static int minimumIndex(List<Integer> nums) {
        int spiltIndex = 0;
        int leftdom = 0, rightdom = 0;
        while(spiltIndex < nums.size()){
                leftdom = findDominant(0,spiltIndex,nums);
                rightdom =  findDominant(spiltIndex+1,nums.size()-1,nums);
            if(leftdom == rightdom)
                return spiltIndex;
            else
                spiltIndex++;
        }
        return -1;
    }
    public static int findDominant(int x,int y,List<Integer> nums){
//        int m = y - x + 1;
//        int occ = 0;
//        int dom = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i = x; i<=y;i++){
//            for (int j = i;j <=y;j++){
//                if(Objects.equals(nums.get(j), nums.get(i)))
//                    occ++;
//            }
//            if(occ * 2 >m)
//                dom = nums.get(i);
//            occ = 0;
//        }
//    return dom;
        int m = y - x + 1;
        int dominant = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = x; i <= y; i++) {
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) * 2 > m)
                dominant = num;
        }
        return dominant;
    }
     */



}
