package CollegeContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            String original = br.readLine();
            palindrome(original);
        }
    }
    public static void palindrome(String original){
        String reverse="";
        int length = original.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)){
            System.out.println(0);
        }
        else{
            char[] og = original.toCharArray();
            int len = og.length;
            int size = len/2;
            char[] first = new char[size];
            char[] last = new char[size];
            if(len %2 == 0){
                for(int i =0;i<size;i++)
                    first[i] = og[i];
                int j =0;
                for(int i=len-1;i>=size;i--)
                {
                    last[j] = og[i];
                    j++;
                    while(j > size)
                        break;

                }
                reduce(first,last,size);
            }else{
                for(int i =0;i<size;i++)
                    first[i] = og[i];
                int j=0;
                for(int i=len-1;i>size;i--)
                {
                    last[j] = og[i];
                    j++;
                    while(j > size)
                        break;
                }
                reduce(first,last,size);
            }
        }
    }
    public static void reduce(char[] first , char[] last, int size){
        int diff = 0;
        for (int k =0;k<size;k++){
            if(first[k] != last[k]){
                if(last[k] > first[k])
                    diff +=( last[k] - first[k]);
                else
                    diff+=(first[k] - last[k]);
            }
        }
        System.out.println(diff);
    }
}
