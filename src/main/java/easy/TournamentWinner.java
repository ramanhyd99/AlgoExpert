package easy;

import java.lang.reflect.Array;
import java.util.*;

public class TournamentWinner {
    public static void main(String[] args) {
    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, List<Integer> results) {
        // Write your code here.

        HashMap<String,Integer> map = new HashMap<>();

        int i = 0, maxVal = 0;
        String res = "";
        for(ArrayList<String> c : competitions){

            String winner;
            if(results.get(i) == 0){
                winner = c.get(1);
            } else winner = c.get(0);

            int val = 3;
            if(map.containsKey(winner)){
                val += map.get(winner);
            }

            if(val > maxVal){
                res = winner;
                maxVal = val;
            }
            map.put(winner,val);
            i++;
        }
        return res;
    }
}
