package Units;

/**
 * Created by xulian on 19/03/2016.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Length {
    private static Scanner scan = new Scanner(System.in);
    private static DecimalFormat threeDecPlc = new DecimalFormat("0.000");
    private static double inM, inInch, inFoot, inMile, inYard, inCmeter, inMmeter, inKmeter;
    private final double METER_TO_INCH = 39.3701;
    private final double METER_TO_FOOT = 3.28084;
    private final double METER_TO_MILE = 0.00062137121212121;
    private final double METER_TO_YARD = 1.0936133333333297735;
    private final double METER_TO_CMETER = 100;
    private final double METER_TO_MMETER = 1000;
    private final double METER_TO_KMETER = 0.001;


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
        double inyard = input * METER_TO_YARD;
    }


    public void cm_inch(double input) {
        double ininch = input * METER_TO_INCH / METER_TO_CMETER;
    }

    public void cm_oot(double input) {
        double infoot = input * METER_TO_FOOT / METER_TO_CMETER;
    }

    public void cm_mile(double input) {
        double inmile = input * METER_TO_MILE / METER_TO_CMETER;
    }

    public void cm_yard(double input) {
        double inyard = input * METER_TO_YARD / METER_TO_CMETER;
    }
}