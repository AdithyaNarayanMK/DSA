package CollegeContest;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char[] iarray = input.toCharArray();
        for(int i=0;i<iarray.length;i++){
            for(int j = 0;j<iarray.length;j++){
                if(i == j || (i+j == iarray.length -1)){
                    System.out.print(iarray[j]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
