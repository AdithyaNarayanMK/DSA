package CollegeContest;

import java.util.Scanner;

public class MrRobotsPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        if(password.length() < 6 || password.contains(" ") || password.contains("/") ){
            System.out.println("Invalid Password, Try again");
        }
    }
}
