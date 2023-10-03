package CollegeContest.Mallow;

import java.util.*;

public class TennisMy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String points,adv;
        points=sc.next();
        adv="";
        int scoreA=0,scoreB=0,gameA=0,gameB=0,setA=0,setB=0;
        boolean matchPro=false;
        boolean tie=false;

        for(int i=0;i<n;i++){
            if(points.charAt(i)=='A'){
                if(scoreA==40 && scoreB==40){
                    if(adv=="A"){
                        gameA++;
                        adv="";
                    }
                    else if(adv=="B"){
                        adv="";
                    }else{
                        adv="A";
                    }
                }
                else if(scoreA==30){
                    scoreA=40;
                }
                else if(scoreA==15){
                    scoreA=30;
                }
                else if(scoreA==0){
                    scoreA=15;
                }
                else if(scoreA==40 && scoreB<40){
                    gameA++;
                    adv="";
                    scoreA=0;
                    scoreB=0;
                }
                else if(gameA>=6 && (gameA-gameB)>=2){
                    setA++;
                    System.out.println(gameA+"-"+gameB);
                    gameA=0;
                    gameB=0;

                }


            }

            else if(points.charAt(i)=='B'){
                if(scoreA==40 && scoreB==40){
                    if(adv=="B"){
                        gameB++;
                        adv="";
                    }
                    else if(adv=="A"){
                        adv="";
                    }
                    else{
                        adv="A";
                    }
                }
                else if(scoreB==30){
                    scoreB=40;
                }
                else if(scoreB==15){
                    scoreB=30;
                }
                else if(scoreB==0){
                    scoreB=15;
                }
                else if(scoreB==40 && scoreA<40){
                    gameB++;
                    adv="";
                    scoreA=0;
                    scoreB=0;
                }
                else if(gameB>=6 && gameB-gameA>=2){
                    setB++;
                    System.out.println(gameA+"-"+gameB);
                    gameA=0;
                    gameB=0;
                    adv="";

                }
            }

            if(gameA==6 && gameB==6){
                tie=true;
            }
            if(setA==2 || setB==2){
                matchPro=true;
            }
            System.out.println(scoreA+" "+scoreB+" "+gameA+" "+gameB+" "+setA+" "+setB);
        }
        if(matchPro){
            System.out.println("Match Completed");
        }else{
            System.out.println("Match Progress");
        }

    }
}
