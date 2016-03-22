package Units;

/**
 * Created by Cathy on 20/03/2016.
 */
public class Time {
    public static void main(String[] args)
    {
       int inSeconds, seconds,  modMinutes, modSeconds;

        int hours = inSeconds / 3600;
        modMinutes = inSeconds % 3600;
        int minutes = modMinutes / 60;
        modSeconds = modMinutes % 60;

        int secondsEquivalent = (hours * 60 * 60) + (minutes * 60) + seconds;


    }
}
