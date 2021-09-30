package logic;

import java.time.LocalDate;

public class TimeOfDay {
    private static final int MAX = 24*60*60;
    private static final int MIN = 0;

    public static String timeOfDay(Integer countOfSec){
        int hours = 60*60;
        int minutes = 60;
        int seconds = 1;
        if (MIN>=countOfSec)
            return null;
        if (MAX<=countOfSec)
            return null;
        int hours1 = countOfSec/hours;
        countOfSec -= hours*hours1;
        int minutes1 = countOfSec/minutes;
        countOfSec -= minutes*minutes1;
        seconds = countOfSec;
        return hours1 +" hours "+ minutes1 +" minutes "+ seconds+" seconds";
    }
}
