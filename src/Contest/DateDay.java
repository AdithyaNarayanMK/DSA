package Contest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dategiven = s.nextLine();
        try{
            LocalDate date = LocalDate.parse(dategiven,DateTimeFormatter.ofPattern("dd MM yyyy"));
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            String temp = dayOfWeek.toString().substring(0,1)+dayOfWeek.toString().substring(1).toLowerCase();
            System.out.println(temp);
        }catch (Exception err){
            System.out.println("Invalid Date");
        }

    }
}
