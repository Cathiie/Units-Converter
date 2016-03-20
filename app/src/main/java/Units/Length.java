package Units;

/**
 * Created by aliizzzzz on 19/03/2016.
 */

import java.text.DecimalFormat;
public class Length {

    private static DecimalFormat threeDecPlc = new DecimalFormat("0.000");
    private static double inM, inInch, inFoot, inMile, inYard, inCmeter, inMmeter, inKmeter;
    private final double METER_TO_INCH = 39.3701;
    private final double METER_TO_FOOT = 3.28084;
    private final double METER_TO_MILE = 0.00062137121212121;
    private final double METER_TO_YARD = 1.0936133333333297735;
    private final double METER_TO_CMETER = 100;
    private final double METER_TO_MMETER = 1000;
    private final double METER_TO_KMETER = 0.001;

    public void m_cm (double input)
    {
        inCmeter = input * METER_TO_CMETER;
        inM = input / METER_TO_CMETER;
    }

    public void m_mm (double input)
    {
        inMmeter = input * METER_TO_MMETER;
        inM = input / METER_TO_MMETER;
    }

    public void m_km (double input)
    {
        inKmeter = input * METER_TO_KMETER;
        inM = input / METER_TO_KMETER;
    }

    public void m_inch(double input) {
        inInch = input * METER_TO_INCH;
        inM = input / METER_TO_INCH;
    }

    public void m_foot(double input) {
        inFoot = input * METER_TO_FOOT;
        inM = input / METER_TO_FOOT;
    }

    public void m_mile(double input) {
        inMile = input * METER_TO_MILE;
        inM = input / METER_TO_MILE;
    }

    public void m_yard(double input) {
        inYard = input * METER_TO_YARD;
        inM = input / METER_TO_YARD;
    }


    public void cm_inch(double input) {
        inInch = input * METER_TO_INCH / METER_TO_CMETER;
        inCmeter = input / METER_TO_INCH * METER_TO_CMETER;
    }

    public void cm_foot(double input) {
        inFoot = input * METER_TO_FOOT / METER_TO_CMETER;
        inCmeter = input / METER_TO_FOOT * METER_TO_CMETER;
    }

    public void cm_mile(double input) {
        inMile = input * METER_TO_MILE / METER_TO_CMETER;
        inCmeter = input / METER_TO_MILE * METER_TO_CMETER;
    }

    public void cm_yard(double input) {
        inYard = input * METER_TO_YARD / METER_TO_CMETER;
        inCmeter = input / METER_TO_YARD * METER_TO_CMETER;
    }

    public void cm_mm (double input)
    {
        inMmeter = input / METER_TO_CMETER * METER_TO_MMETER;
        inCmeter = input * METER_TO_CMETER / METER_TO_MMETER;
    }

    public void cm_km (double input)
    {
        inKmeter = input / METER_TO_CMETER * METER_TO_KMETER;
        inCmeter = input * METER_TO_CMETER / METER_TO_KMETER;
    }

    public void mm_inch (double input)
    {
        inInch = input / METER_TO_MMETER * METER_TO_INCH;
        inMmeter = input * METER_TO_MMETER / METER_TO_INCH;
    }

    public void mm_mile (double input)
    {
        inMile = input / METER_TO_MMETER * METER_TO_MILE;
        inMmeter = input * METER_TO_MMETER / METER_TO_MILE;
    }

    public void mm_foot (double input) {

        inFoot = input / METER_TO_MMETER * METER_TO_FOOT;
        inMmeter = input * METER_TO_MMETER / METER_TO_FOOT;
    }

    public void mm_yard (double input)
    {
        inYard = input / METER_TO_MMETER * METER_TO_YARD;
        inMmeter = input * METER_TO_MMETER / METER_TO_YARD;
    }

    public void mm_km (double input)
    {
        inKmeter = input / METER_TO_MMETER * METER_TO_KMETER;
        inMmeter = input * METER_TO_MMETER / METER_TO_KMETER;
    }

    public void km_mile (double input)
    {
        inMile = input / METER_TO_KMETER * METER_TO_MILE;
        inKmeter = input * METER_TO_KMETER / METER_TO_MILE;
    }

    public void km_inch (double input)
    {
        inInch = input / METER_TO_KMETER * METER_TO_INCH;
        inKmeter = input * METER_TO_KMETER / METER_TO_INCH;
    }

    public void km_foot (double input)
    {
        inFoot = input / METER_TO_KMETER * METER_TO_FOOT;
        inKmeter = input * METER_TO_KMETER / METER_TO_FOOT;
    }

    public void km_yard (double input)
    {
        inYard = input / METER_TO_KMETER * METER_TO_YARD;
        inKmeter = input * METER_TO_KMETER / METER_TO_YARD;
    }
    public void inch_mile (double input)
    {
        inMile = input / METER_TO_INCH * METER_TO_MILE;
        inInch = input * METER_TO_INCH / METER_TO_MILE;
    }

    public void inch_foot (double input)
    {
        inFoot = input / METER_TO_INCH * METER_TO_FOOT;
        inInch = input * METER_TO_INCH / METER_TO_FOOT;
    }

    public void inch_yard (double input)
    {
        inYard = input / METER_TO_INCH * METER_TO_YARD;
        inInch = input *METER_TO_INCH / METER_TO_YARD;
    }

    public void mile_foot (double input)
    {
        inFoot = input / METER_TO_MILE * METER_TO_FOOT;
        inMile = input * METER_TO_MILE / METER_TO_FOOT;
    }

    public void mile_yard (double input)
    {
        inYard = input / METER_TO_MILE * METER_TO_YARD;
        inMile = input * METER_TO_MILE / METER_TO_YARD;
    }

    public void foot_yard (double input)
    {
        inYard = input / METER_TO_FOOT * METER_TO_YARD;
        inFoot = input * METER_TO_FOOT / METER_TO_YARD;
    }

    public double convertMtoCM (double input)
    {
        m_cm(input);
        return inCmeter;
    }

    public double convertCMtoM (double input)
    {
        m_cm(input);
        return inM;
    }

    public double convertMtoMM (double input)
    {
        m_mm(input);
        return inMmeter;
    }

    public double convertMMtoM (double input)
    {
        m_mm(input);
        return inM;
    }
    public double convertMtoMile (double input)
    {
        m_mile(input);
        return inMile;
    }

    public double convertMiletoM (double input)
    {
        m_mile(input);
        return inM;
    }

}