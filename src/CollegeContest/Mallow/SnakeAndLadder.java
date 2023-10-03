package CollegeContest.Mallow;

import java.util.*;

public class SnakeAndLadder {
    public static void main(String[] args) {
            HashMap<String,ArrayList<Integer>> ds = new HashMap<>();
            HashMap<Integer,String> players = new HashMap<>();
            HashMap<Integer, ArrayList<Integer>> positions = new HashMap<>();

            positions.put(4, new ArrayList<>(List.of(0, 12)));
            positions.put(6, new ArrayList<>(List.of(0, 15)));
            positions.put(14, new ArrayList<>(List.of(1, 5)));
            positions.put(18, new ArrayList<>(List.of(0, 23)));
            positions.put(24, new ArrayList<>(List.of(1, 16)));
            positions.put(21, new ArrayList<>(List.of(1, 2)));



            Scanner s = new Scanner(System.in);
            int no_players = s.nextInt();
            boolean bool = true;
            boolean[] complete = new boolean[no_players];
            boolean[] start = new boolean[no_players];

            for(int i=0;i<no_players;i++){
                players.put(i,s.next());
                ds.put(players.get(i), new ArrayList<>(List.of(0,0,0,0)));
            }

            String Start_Player = s.next();
            int curr_index = 0;
            for(int i=0;i<players.size();i++){
                if(Objects.equals(Start_Player, players.get(i))){
                    curr_index = i;
                }
            }
            int count_of_dice_thrown = s.nextInt();
            for(int i=0;i<count_of_dice_thrown;i++){
                bool = true;
                while (bool){
                int dice_value = s.nextInt();
                if (dice_value == 1 && !start[curr_index%players.size()]){
                    start[curr_index%players.size()] = true;
                }
                if(dice_value <=6 && start[curr_index%players.size()]){

                    String curr_player = players.get(curr_index%no_players);
                        if(ds.containsKey(curr_player)){
                            int curr_value = ds.get(curr_player).get(0) + dice_value;

                            ArrayList<Integer> toupdate = ds.get(curr_player);
                            if(positions.containsKey(curr_value)){
                                ArrayList<Integer> pos = positions.get(curr_value);
                                if(pos.get(0) == 0){
                                    curr_value = pos.get(1);
                                    toupdate.set(3,toupdate.get(3)+1);
                                }
                                else{
                                    curr_value = pos.get(1);
                                    toupdate.set(2,toupdate.get(2)+1);
                                }
                            }
                            if(curr_value > 25){
                                 curr_value -= dice_value;
                            } else if (curr_value == 25) {
                                complete[curr_index%3] = true;
                            }
                            toupdate.set(0,curr_value);
                            toupdate.set(1,25-curr_value);
                        }
                    }
                    if(!(dice_value == 1 || dice_value == 5)){
                        bool=false;
                        removeplayer(curr_index,players,ds);
                        break;
                    }
                    i++;
                }
                curr_index++;
            }

            for(int l=0;l<no_players;l++){
                ArrayList<Integer> printds  = ds.get(players.get(l));
                System.out.println(players.get(l) +"|"+printds.get(0)+"|"+printds.get(1)+"|"
                        +printds.get(2)+"|"+printds.get(3));
            }

            for (int k=0;k<no_players;k++){
                if(!complete[k]){
                    System.out.print(players.get(k)+" ");
                }
            }
            System.out.println("Lost the game");
    }

    public static void removeplayer(int currIndex,HashMap<Integer, String> players,HashMap<String,ArrayList<Integer>>ds) {
        int i = (( currIndex % players.size())+1)%players.size();
        while (i != currIndex % players.size()){
            if(Objects.equals(ds.get(players.get(i)).get(0),ds.get(players.get(currIndex % players.size())).get(0) )) {
                ArrayList<Integer> toremove = ds.get(players.get(i));
                toremove.set(0,1);
            }
            i = (i+1)%players.size();
        }
    }
}

