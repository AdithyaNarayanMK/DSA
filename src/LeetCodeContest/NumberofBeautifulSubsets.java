package LeetCodeContest;

import java.util.*;

public class NumberofBeautifulSubsets {
    public static void main(String[] args) {
        int[]  arr = {2,4,6};
        System.out.println(beautifulSubsets(arr,2));
    }
    public static int beautifulSubsets(int[] nums, int k) {
        Map<Integer,ArrayList<Integer>> combinations = new HashMap<>();
        //int answer = nums.length;
        for(int i=0;i<nums.length;i++){
            combinations.put(i,sub(nums,i,k));
        }
        // System.out.println(findCount(combinations));
        return findCount(combinations);
    }
    public static ArrayList<Integer> sub(int[] nums, int i,int k){
        ArrayList<Integer> com = new ArrayList<>();
        com.add(i);
        for(int index = i;index<nums.length-1;index++){
            int diff = Math.abs(nums[i] - nums[index+1]);
            if(! (diff==k))
                com.add(index+1);
        }
        return com;
    }
    public static int findCount(Map<Integer, ArrayList<Integer>> combinations){
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
       // int answer  = 0;
        for(int i=0;i<combinations.size();i++){
            findCombinations(combinations.get(i),uniqueCombinations);
        }
        return uniqueCombinations.size();
    }

    private static Set<List<Integer>> findCombinations(ArrayList<Integer> indicesList,Set<List<Integer>> uniqueCombinations) {


        // Iterate over all pairs of indices and add to set
        for (int i = 0; i < indicesList.size(); i++) {
            for (int j = i + 1; j < indicesList.size(); j++) {
                List<Integer> combination = new ArrayList<>();
                combination.add(indicesList.get(i));
                combination.add(indicesList.get(j));
                uniqueCombinations.add(combination);
            }
        }

        // Iterate over all triplets of indices and add to set
        for (int i = 0; i < indicesList.size(); i++) {
            for (int j = i + 1; j < indicesList.size(); j++) {
                for (int k = j + 1; k < indicesList.size(); k++) {
                    List<Integer> combination = new ArrayList<>();
                    combination.add(indicesList.get(i));
                    combination.add(indicesList.get(j));
                    combination.add(indicesList.get(k));
                    uniqueCombinations.add(combination);
                }
            }
        }

        // Iterate over all combinations of size 4 or more and add to set
        for (int k = 4; k <= indicesList.size(); k++) {
            // Use a recursive function to generate all combinations of size k
            generateCombinations(uniqueCombinations, new ArrayList<>(), indicesList, k, 0);
        }

        int count = uniqueCombinations.size();
        return uniqueCombinations;

    }
    private static void generateCombinations(Set<List<Integer>> uniqueCombinations, List<Integer> currentCombination, List<Integer> indicesList, int k, int start) {
        if (currentCombination.size() == k) {
            uniqueCombinations.add(new ArrayList<>(currentCombination));
        } else {
            for (int i = start; i < indicesList.size(); i++) {
                currentCombination.add(indicesList.get(i));
                generateCombinations(uniqueCombinations, currentCombination, indicesList, k, i + 1);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

}
