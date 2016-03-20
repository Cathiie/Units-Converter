package Units;

/**
 * Created by xulian on 19/03/2016.
 */
public class Temperature {

    private static double inC, inF, inK;
    private static double COEFFICIENT = 9/5;
    private static double REMAINDER = 32;
    private static double KELVIN = 273.15;

    public static void c_f (double input)
    {
        inF = (input * COEFFICIENT) + REMAINDER;
        inC = (input - REMAINDER) / COEFFICIENT;
    }

    public static void c_k (double input)
    {
        inK = input + KELVIN;
        inC = input - KELVIN;
    }

    public static void f_k (double input)
    {
        inK = ((input - REMAINDER) / COEFFICIENT) + KELVIN;
        inF = ((input - KELVIN) * COEFFICIENT) + REMAINDER;
    }

    public static double convertCtoF (double input)
    {
        c_f(input);
        return inF;
    }

    public static double convertFtoC (double input)
    {
        c_f(input);
        return inC;
    }

    public static double convertCtoK (double input)
    {
        c_k(input);
        return inK;
    }

    public static double convertKtoC (double input)
    {
        c_k(input);
        return inK;
    }

    public static double convertFtoK (double input)
    {
        f_k(input);
        return inK;
    }

    public static double convertKtoF (double input)
    {
        f_k(input);
        return inF;
    }
}

