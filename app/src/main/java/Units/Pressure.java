package Units;

/**
 * Created by AliZz on 20/03/2016.
 */
public class Pressure {

    private static double inG, inKG, inIb;
    private static double KG_TO_G = 1000;
    private static double KG_TO_IB = 2.20462;
    private static double G_TO_IB = 0.00220462;

    public static void g_kg (double input)
    {
        inKG = input / KG_TO_G;
        inG = input * KG_TO_G;
    }

    public static void g_ib (double input)
    {
        inIb = input * G_TO_IB;
        inG = input / G_TO_IB;
    }

    public static void kg_ib (double input)
    {
        inIb = input * KG_TO_IB;
        inKG = input / KG_TO_IB;
    }

    public static double convertGtoKG (double input)
    {
        g_kg(input);
        return inKG;
    }

    public static double convertKGtoG (double input)
    {
        g_kg(input);
        return inG;
    }

    public static double convertGtoIB (double input)
    {
        g_ib(input);
        return inIb;
    }

    public static double convertIBtoG (double input)
    {
        g_ib(input);
        return inG;
    }

    public static double convertKGtoIB (double input)
    {
        kg_ib(input);
        return inIb;
    }

    public static double convertIBtoKG (double input)
    {
        kg_ib(input);
        return inKG;
    }

}
