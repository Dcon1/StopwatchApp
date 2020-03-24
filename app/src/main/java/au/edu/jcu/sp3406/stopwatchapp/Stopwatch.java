package au.edu.jcu.sp3406.stopwatchapp;

import java.util.Locale;

public class Stopwatch {
    private int seconds = 0;
    private int hours;
    private int minutes;

    public void tick(){
        seconds++;
        hours = seconds / 3600;
        minutes = (seconds%3600)/59;
    }

    public String toString(){
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds%60);

    }

}
