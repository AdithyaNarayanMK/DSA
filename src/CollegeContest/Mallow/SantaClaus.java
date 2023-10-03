package CollegeContest.Mallow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class SantaClaus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number_of_kids = s.nextInt();
        String[] kids_names = new String[number_of_kids];
        for(int i=0;i<number_of_kids;i++){
            kids_names[i] = s.next();
        }
        int total_number_of_kids = s.nextInt();
        String firstKid = s.next();
        String secondKid = s.next();
        findKidsWhoGotHighestNumberOfGifts(number_of_kids,kids_names,firstKid,secondKid);
    }

    private static void findKidsWhoGotHighestNumberOfGifts(int numberOfKids, String[] kidsNames, String firstKid, String secondKid) {
        HashMap<String,Integer> giftsCount = new HashMap<>();
        int firstKidIndex = 0;
        int secondKidIndex = 0;
        for(int i=0;i<kidsNames.length;i++){
            giftsCount.put(kidsNames[i],0);
            if(Objects.equals(kidsNames[i], firstKid)){
                firstKidIndex = i;
            } else if (Objects.equals(kidsNames[i],secondKid)) {
                secondKidIndex = i;
            }
        }



    }
    public  static String[] SetWinner(int noOfGamesWonByA,int noOfGamesWonByB,char[] input_score,int curr_point){
        if(noOfGamesWonByA == 6 && noOfGamesWonByB < 5) {
            return new String[]{"A", String.valueOf(curr_point)};
        }
        else if(noOfGamesWonByB == 6 && noOfGamesWonByA < 5) {
            return new String[]{"B", String.valueOf(curr_point)};
        }
        else if(noOfGamesWonByA == 7 && noOfGamesWonByB < 6) {
            return new String[]{"A", String.valueOf(curr_point)};
        }
        else if(noOfGamesWonByB == 7 && noOfGamesWonByA < 6) {
            return new String[]{"B", String.valueOf(curr_point)};
        }
        else if(noOfGamesWonByA == 6 && noOfGamesWonByB == 6) {
            int aTiePoints = 0;
            int bTiePoints = 0;

            for(int i = curr_point; i < input_score.length; i++) {
                if(input_score[i] == 'A') {
                    aTiePoints++;
                } else {
                    bTiePoints++;
                }

                if(aTiePoints >= 7 && aTiePoints - bTiePoints >= 2) {
                    return new String[]{"A", String.valueOf(i)};
                }
                else if(bTiePoints >= 7 && bTiePoints - aTiePoints >= 2) {
                    return new String[]{"B", String.valueOf(i)};
                }
            }
        }
        return null;
    }
}
