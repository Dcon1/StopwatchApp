package au.edu.jcu.sp3406.stopwatchapp;

import java.util.Locale;

public class Stopwatch {
    private int seconds = 0;
    private int hours = seconds / 3600;
    private int minutes = (seconds%3600)/60;
    private int secs = seconds%60;

    public String tick(){
        String time = String.format(Locale.getDefault(), "%d:%02d;%02d", hours, minutes, secs);
        seconds++;
        return time;

    }

    public String toString(){
        return tick().toString();

    }

}
