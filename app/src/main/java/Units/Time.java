package Units;

/**
 * Created by Cathy on 20/03/2016.
 */
public class Time {
    public static void main(String[] args)
    {
       int seconds,  modMinutes, modSeconds;

        int hours = seconds / 3600;
        modMinutes = seconds % 3600;
        int minutes = modMinutes / 60;
        modSeconds = modMinutes % 60;

        int hours, minutes, seconds;

        int secondsEquivalent = (hours * 60 * 60) + (minutes * 60) + seconds;


    }
}
