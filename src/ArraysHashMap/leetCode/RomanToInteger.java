package ArraysHashMap.leetCode;

import java.util.Hashtable;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int answer = romanToInt(s.next());
        System.out.println(answer);
    }
    public static int romanToInt(String s) {
        int ans =0;
        int b,i=0,a;
        String d;
        Hashtable<String, Integer> map = new Hashtable<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("E", 0);
        while (i<s.length()){
            String c = String.valueOf(s.charAt(i));
            if (i +1 == s.length()){

                d = String.valueOf("E");
            }
            else {
                d = String.valueOf(s.charAt(i+1));
            }

            a = map.get(c);
            b = map.get(d);
            // System.out.println(a);
            //  ans = ans + a;
            if(a < b){
                ans = ans +(b -a);
                i++;
            }
            else{
                ans = ans + a ;
            }
            i++;
        }



        return ans;
    }

}
