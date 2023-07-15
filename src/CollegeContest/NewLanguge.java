package CollegeContest;

import java.util.Scanner;

public class NewLanguge {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int NoOperations = Integer.parseInt(s.next());
        int x = 0;
        while (NoOperations > 0){
            String operation = s.next();
            int value = s.nextInt();
            if(operation.toLowerCase().equals("add"))
                x+=value;
            if(operation.toLowerCase().equals("set"))
                x = value;
            NoOperations--;
        }

        System.out.println(x);
    }
}
