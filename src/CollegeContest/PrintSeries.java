package CollegeContest;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int noOfQueries = s.nextInt();
        while(noOfQueries > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int q = s.nextInt();
            printSeries(a,b,q);
            noOfQueries--;
        }
    }
    public static void printSeries(int a,int b,int q){
        double val = a;
        for(int i=0;i<q;i++){
            val += Math.pow(2,i)*b;
            System.out.println((int)val);
        }
    }
}
