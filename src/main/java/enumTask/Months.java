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

    public List<Months> monthsAsList(){
        List<Months> monthsList = new ArrayList<>();
        Collections.addAll(monthsList, values());
        return monthsList;
    }
    
    public boolean checkMonthExist(String months){
    return monthsAsList().contains(months.toUpperCase());
    }

}
