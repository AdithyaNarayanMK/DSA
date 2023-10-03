package CollegeContest.Mallow;


import java.util.Objects;
import java.util.Scanner;

public class TennisScoringSystem {


    public static void gameResult(int no_of_points,char[] input_score){
        int A_score = 0;
        int B_score = 0;

        int A_game_won = 0;
        int B_game_won = 0;

        int A_set_won = 0;
        int B_set_won = 0;

        int A_match_won = 0;
        int B_match_won = 0;
        int i = -1;
        while (i<input_score.length){
            i++;
            if(input_score[i] == 'A'){
                A_score++;
            }else{
                B_score++;
            }
            if(A_score == 3 && B_score == 3){
              String[] gamewinner =  AdvantageWinner(i+1,input_score);
              if(Objects.equals(gamewinner[0], "A")){
                  A_game_won++;
                  i = Integer.parseInt(gamewinner[1]);
              }else if(Objects.equals(gamewinner[0],"B")){
                  B_game_won++;
                  i=Integer.parseInt(gamewinner[1]);
              }else{
                  continue;
              }
            }else if(A_score == 4 && B_score < 4){
                A_game_won++;
                A_score = 0;
                B_score = 0;
            }else if(B_score == 4 && A_score < 4){
                B_game_won++;
                A_score = 0;
                B_score = 0;
            }

            try {
                String[] setwinner = SetWinner(A_game_won,B_game_won,input_score,i+1);
                if(Objects.equals(setwinner[0], "A")){
                    A_set_won++;
                    i=Integer.parseInt(setwinner[1]);
                } else if (Objects.equals(setwinner[0] , "B")) {
                    B_set_won++;
                    i=Integer.parseInt(setwinner[1]);
                }
            }
           catch (Exception e){

            }
        }
//        System.out.println(A_game_won);
//        System.out.println(A_set_won);
//        System.out.println(B_game_won);
//        System.out.println(B_set_won);
    }


    public static String[] AdvantageWinner(int curr_point , char[] input_score){
        int A_score = 0;
        int B_score = 0;
        int j = 0;
        for(j = curr_point;j<input_score.length;j++){
            if(input_score[j] == 'A'){
                A_score++;
            }else{
                B_score++;
            }
            if(A_score == 2 && B_score == 0){
                return new String[]{"A", String.valueOf(j)};
            } else if (B_score == 2 && A_score == 0) {
                return new String[]{"B", String.valueOf(j)};
            }else if(A_score == 1 && B_score == 1){
                return AdvantageWinner(j+1,input_score);
            }
        }
        return null;
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_points = 44;//10
        String input = "AAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBB";
//        String input = "AABBABABAABBBAAABABB";

        char[] input_score = input.toCharArray();
        gameResult(no_of_points,input_score);
    }
}
