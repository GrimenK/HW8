package enumTask;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static enumTask.Seasons.*;

public enum Months {
    JANUARY(30,WINTER),
    FEBRUARY(28,WINTER),
    MARCH(30,SPRING),
    APRIL(31,SPRING),
    MAY(31,SPRING),
    JUNE(31,SUMMER),
    JULY(31,SUMMER),
    AUGUST(31,SUMMER),
    SEPTEMBER(31,AUTUMN),
    OCTOBER(31,AUTUMN),
    NOVEMBER(31,AUTUMN),
    DECEMBER(31,WINTER);

    private int days;

    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }

    private Seasons season;

    Months(int days, Seasons season){
        this.days = days;
        this.season = season;
    }

    public static ArrayList<Months> monthsAsList(){
        ArrayList<Months> monthsList = new ArrayList<>();
        Collections.addAll(monthsList, values());
        return monthsList;
    }
    
    public static boolean checkMonthExist(String month){
    return monthsAsList().contains(valueOf(month.toUpperCase()));
    }

    public static void printMonthsWithSeason(Seasons season){
        for (Months month: monthsAsList()
             ) {
            if (month.getSeason() == season){
                System.out.println(month);
            }
        }
    }

    public static void printMonthsWithDays(int days){
        for (Months month: monthsAsList()
        ) {
            if (month.getDays() == days){
                System.out.println(month);
            }
        }
    }

    public static void printMonthsWithEvenDays(){
        for (Months month: monthsAsList()
        ) {
            if (month.getDays()%2 == 0){
                System.out.println(month);
            }
        }
    }

    public static void printMonthsWithOddDays(){
        for (Months month: monthsAsList()
        ) {
            if (!(month.getDays()%2 == 0)){
                System.out.println(month);
            }
        }
    }

    public static boolean isMonthEven(String month){
      return Months.valueOf(month.toUpperCase()).getDays()%2 == 0;
    }

}
