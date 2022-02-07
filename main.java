//cNguyen  2.7.2022
//MySpecificAge calculates age in days, hours, minutes and seconds
//Given: birthdate input
//Localdate used to find current date
//ChronoUnit comparison of days between current date and given birthdate
//Conversion of days to years old, hours, minutes and seconds old

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class MySpecificAge {
	public static void main(String[] args) throws Exception {
        try {
            new MySpecificAge().run();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
    public void run() {
        LocalDate currentDate = LocalDate.now();                        //Getting the current date value of the system
        LocalDate birthday = LocalDate.of(1922,01,17);                  //Betty White's birthday
       
       System.out.println("Current date: "+ currentDate);
        System.out.println("Given birthday: "+ birthday);
        
        long daysOld = ChronoUnit.DAYS.between(birthday, currentDate);  //get number of days between dates
        long currentAge = daysOld / 365;                                // years old = days / 365
        long hoursOld = daysOld * 24;                                   //24 hours in a day
        long minutesOld = hoursOld * 60;                                //60 minutes in an hour
        long secondsOld = minutesOld * 60;                              //60 minutes in an hour;
        
        System.out.println("Age in years: " + currentAge); 
        System.out.println("You are " + daysOld + " days old.");
        System.out.println("        " + hoursOld + " hours old.");
        System.out.println("        " + minutesOld + " minutes old.");
        System.out.println("        " + secondsOld + " seconds old.");
    }
}
