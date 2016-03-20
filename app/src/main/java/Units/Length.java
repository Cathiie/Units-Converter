package Units;

/**
 * Created by AliZz on 19/03/2016.
 */

import java.text.DecimalFormat;
public class Length {

    private static DecimalFormat threeDecPlc = new DecimalFormat("0.000");
    private static double inM, inInch, inFoot, inMile, inYard, inCmeter, inMmeter, inKmeter;
    private static double METER_TO_INCH = 39.3701;
    private static double METER_TO_FOOT = 3.28084;
    private static double METER_TO_MILE = 0.00062137121212121;
    private static double METER_TO_YARD = 1.0936133333333297735;
    private static double METER_TO_CMETER = 100;
    private static double METER_TO_MMETER = 1000;
    private static double METER_TO_KMETER = 0.001;

    public static void m_cm (double input)
    {
        inCmeter = input * METER_TO_CMETER;
        inM = input / METER_TO_CMETER;
    }

    public static void m_mm (double input)
    {
        inMmeter = input * METER_TO_MMETER;
        inM = input / METER_TO_MMETER;
    }

    public static void m_km (double input)
    {
        inKmeter = input * METER_TO_KMETER;
        inM = input / METER_TO_KMETER;
    }

    public static void m_inch(double input) {
        inInch = input * METER_TO_INCH;
        inM = input / METER_TO_INCH;
    }

    public static void m_foot(double input) {
        inFoot = input * METER_TO_FOOT;
        inM = input / METER_TO_FOOT;
    }

    public static void m_mile(double input) {
        inMile = input * METER_TO_MILE;
        inM = input / METER_TO_MILE;
    }

    public static void m_yard(double input) {
        inYard = input * METER_TO_YARD;
        inM = input / METER_TO_YARD;
    }

    public static void cm_inch(double input) {
        inInch = input * METER_TO_INCH / METER_TO_CMETER;
        inCmeter = input / METER_TO_INCH * METER_TO_CMETER;
    }

    public static void cm_foot(double input) {
        inFoot = input * METER_TO_FOOT / METER_TO_CMETER;
        inCmeter = input / METER_TO_FOOT * METER_TO_CMETER;
    }

    public static void cm_mile(double input) {
        inMile = input * METER_TO_MILE / METER_TO_CMETER;
        inCmeter = input / METER_TO_MILE * METER_TO_CMETER;
    }

    public static void cm_yard(double input) {
        inYard = input * METER_TO_YARD / METER_TO_CMETER;
        inCmeter = input / METER_TO_YARD * METER_TO_CMETER;
    }

    public static void cm_mm (double input)
    {
        inMmeter = input / METER_TO_CMETER * METER_TO_MMETER;
        inCmeter = input * METER_TO_CMETER / METER_TO_MMETER;
    }

    public static void cm_km (double input)
    {
        inKmeter = input / METER_TO_CMETER * METER_TO_KMETER;
        inCmeter = input * METER_TO_CMETER / METER_TO_KMETER;
    }

    public static void mm_inch (double input)
    {
        inInch = input / METER_TO_MMETER * METER_TO_INCH;
        inMmeter = input * METER_TO_MMETER / METER_TO_INCH;
    }

    public static void mm_mile (double input)
    {
        inMile = input / METER_TO_MMETER * METER_TO_MILE;
        inMmeter = input * METER_TO_MMETER / METER_TO_MILE;
    }

    public static void mm_foot (double input) {

        inFoot = input / METER_TO_MMETER * METER_TO_FOOT;
        inMmeter = input * METER_TO_MMETER / METER_TO_FOOT;
    }

    public static void mm_yard (double input)
    {
        inYard = input / METER_TO_MMETER * METER_TO_YARD;
        inMmeter = input * METER_TO_MMETER / METER_TO_YARD;
    }

    public static void mm_km (double input)
    {
        inKmeter = input / METER_TO_MMETER * METER_TO_KMETER;
        inMmeter = input * METER_TO_MMETER / METER_TO_KMETER;
    }

    public static void km_mile (double input)
    {
        inMile = input / METER_TO_KMETER * METER_TO_MILE;
        inKmeter = input * METER_TO_KMETER / METER_TO_MILE;
    }

    public static void km_inch (double input)
    {
        inInch = input / METER_TO_KMETER * METER_TO_INCH;
        inKmeter = input * METER_TO_KMETER / METER_TO_INCH;
    }

    public static void km_foot (double input)
    {
        inFoot = input / METER_TO_KMETER * METER_TO_FOOT;
        inKmeter = input * METER_TO_KMETER / METER_TO_FOOT;
    }

    public static void km_yard (double input)
    {
        inYard = input / METER_TO_KMETER * METER_TO_YARD;
        inKmeter = input * METER_TO_KMETER / METER_TO_YARD;
    }
    public static void inch_mile (double input)
    {
        inMile = input / METER_TO_INCH * METER_TO_MILE;
        inInch = input * METER_TO_INCH / METER_TO_MILE;
    }

    public static void inch_foot (double input)
    {
        inFoot = input / METER_TO_INCH * METER_TO_FOOT;
        inInch = input * METER_TO_INCH / METER_TO_FOOT;
    }

    public static void inch_yard (double input)
    {
        inYard = input / METER_TO_INCH * METER_TO_YARD;
        inInch = input *METER_TO_INCH / METER_TO_YARD;
    }

    public static void mile_foot (double input)
    {
        inFoot = input / METER_TO_MILE * METER_TO_FOOT;
        inMile = input * METER_TO_MILE / METER_TO_FOOT;
    }

    public static void mile_yard (double input)
    {
        inYard = input / METER_TO_MILE * METER_TO_YARD;
        inMile = input * METER_TO_MILE / METER_TO_YARD;
    }

    public static void foot_yard (double input)
    {
        inYard = input / METER_TO_FOOT * METER_TO_YARD;
        inFoot = input * METER_TO_FOOT / METER_TO_YARD;
    }

    public static double convertMtoCM (double input)
    {
        m_cm(input);
        return inCmeter;
    }

    public static double convertCMtoM (double input)
    {
        m_cm(input);
        return inM;
    }

    public static double convertMtoMM (double input)
    {
        m_mm(input);
        return inMmeter;
    }

    public static double convertMMtoM (double input)
    {
        m_mm(input);
        return inM;
    }

    public static double convertMtoKM (double input)
    {
        m_km(input);
        return inKmeter;
    }

    public static double convertKMtoM (double input)
    {
        m_km(input);
        return inM;
    }
    public static double convertMtoMile (double input)
    {
        m_mile(input);
        return inMile;
    }

    public static double convertMiletoM (double input)
    {
        m_mile(input);
        return inM;
    }

    public static double convertMtoFoot (double input)
    {
        m_foot(input);
        return inFoot;
    }

    public static double convertFoottoM (double input)
    {
        m_foot(input);
        return inM;
    }

    public static double convertMtoInch (double input)
    {
        m_inch(input);
        return inInch;
    }

    public static double convertInchtoM (double input)
    {
        m_inch(input);
        return inM;
    }

    public static double convertMtoYard (double input)
    {
        m_yard(input);
        return inYard;
    }

    public static double convertYardtoM (double input)
    {
        m_yard(input);
        return inM;
    }

    public static double convertCMtoMM (double input)
    {
        cm_mm(input);
        return inMmeter;
    }

    public static double convertMMtoCM (double input)
    {
        cm_mm(input);
        return inCmeter;
    }

    public static double convertCMtoKM (double input)
    {
        cm_km(input);
        return inKmeter;
    }

    public static double convertKMtoCM (double input)
    {
        cm_km(input);
        return inCmeter;
    }

    public static double convertCMtoMile (double input)
    {
        cm_mile(input);
        return inMile;
    }

    public static double convertMiletoCM (double input)
    {
        cm_mile(input);
        return inCmeter;
    }

    public static double convertCMtoFoot (double input)
    {
        cm_foot(input);
        return inFoot;
    }

    public static double convertFoottoCM (double input)
    {
        cm_foot(input);
        return inCmeter;
    }

    public static double covertCMtoYard (double input)
    {
        cm_yard(input);
        return inYard;
    }

    public static double convertYardtoCM (double input)
    {
        cm_yard(input);
        return inCmeter;
    }

    public static double convertCMtoInch (double input)
    {
        cm_inch(input);
        return inInch;
    }

    public static double convertInchtoCM (double input)
    {
        cm_inch(input);
        return inCmeter;
    }

    public static double convertMMtoKM (double input)
    {
        mm_km(input);
        return inKmeter;
    }

    public static double convertKMtoMM (double input)
    {
        mm_km(input);
        return inMmeter;
    }

    public static double convertMMtoMile (double input)
    {
        mm_mile(input);
        return inMile;
    }

    public static double convertMiletoMM (double input)
    {
        mm_mile(input);
        return inMmeter;
    }

    public static double convertMMtoInch (double input)
    {
        mm_inch(input);
        return inInch;
    }

    public static double convertInchtoMM (double input)
    {
        mm_inch(input);
        return inMmeter;
    }

    public static double convertMMtoFoot (double input)
    {
        mm_foot(input);
        return inFoot;
    }

    public static double convertFoottoMM (double input)
    {
        mm_foot(input);
        return inMmeter;
    }

    public static double convertMMtoYard (double input)
    {
        mm_yard(input);
        return inYard;
    }

    public static double convertYardtoMM (double input)
    {
        mm_yard(input);
        return inMmeter;
    }

    public static double convertKMtoInch (double input)
    {
        km_inch(input);
        return inInch;
    }

    public static double convertInchtoKM (double input)
    {
        km_inch(input);
        return inKmeter;
    }

    public static double convertKMtoMile (double input)
    {
        km_mile(input);
        return inMile;
    }

    public static double convertMiletoKM (double input)
    {
        km_mile(input);
        return inKmeter;
    }

    public static double convertKMtoFoot (double input)
    {
        km_foot(input);
        return inFoot;
    }

    public static double convertFoottoKM (double input)
    {
        km_foot(input);
        return inKmeter;
    }

    public static double convertKMtoYard (double input)
    {
        km_yard(input);
        return inYard;
    }

    public static double convertYardtoKM (double input)
    {
        km_yard(input);
        return inKmeter;
    }

    public static double convertInchtoFoot (double input)
    {
        inch_foot(input);
        return inFoot;
    }

    public static double convertFoottoInch (double input)
    {
        inch_foot(input);
        return inInch;
    }

    public static double convertInchtoMile (double input)
    {
        inch_mile(input);
        return inMile;
    }

    public static double convertMiletoInch (double input)
    {
        inch_mile(input);
        return inInch;
    }

    public static double convertInchtoYard (double input)
    {
        inch_yard(input);
        return inYard;
    }

    public static double convertYardtoInch (double input)
    {
        inch_yard(input);
        return inInch;
    }

    public static double convertMiletoFoot (double input)
    {
        mile_foot(input);
        return inFoot;
    }

    public static double convertFoottoMile (double input)
    {
        mile_foot(input);
        return inMile;
    }

    public static double convertMiletoYard (double input)
    {
        mile_yard(input);
        return inYard;
    }

    public static double convertYardtoMile (double input)
    {
        mile_yard(input);
        return inMile;
    }

    public static double convertFoottoYard (double input)
    {
        foot_yard(input);
        return inYard;
    }

    public static double convertYardtoFoot (double input)
    {
        foot_yard(input);
        return inFoot;
    }
}
