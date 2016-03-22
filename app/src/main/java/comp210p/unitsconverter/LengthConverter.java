package comp210p.unitsconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



import java.util.ArrayList;

public class LengthConverter extends AppCompatActivity {
    static Spinner spinner01;
    static Spinner spinner02;
    static Spinner spinner03;
    static Spinner spinner04;
    static Spinner spinner05;
    static Spinner spinner06;
    static Spinner spinner07;
    ArrayAdapter<CharSequence> adapter;

    public static String UnitSymble;
    public int UnitIndex;

    public final double[] ConerterFactor = {0.001, 1, 10, 100, 1000, 0.0006213711922, 1.093613298, 3.280839895, 39.37007874};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);


        //set spinner list and layout
        spinner01 = (Spinner) findViewById(R.id.spinner);
        spinner02 = (Spinner) findViewById(R.id.spinner2);


        adapter = ArrayAdapter.createFromResource(this, R.array.UnitLength, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner01.setAdapter(adapter);
        spinner02.setAdapter(adapter);

    }



        //get spinner string

    private int getIndex(String text) {

        switch (text) {
            case "Kilometer":
                UnitIndex = 0;
                break;
            case "Meter":
                UnitIndex = 1;
                break;
            case "Decimeter":
                UnitIndex = 2;
                break;
            case "Centimeter":
                UnitIndex = 3;
                break;
            case "Millimeter":
                UnitIndex = 4;
                break;
            case "Mile":
                UnitIndex = 5;
                break;
            case "Yard":
                UnitIndex = 6;
                break;
            case "Feet":
                UnitIndex = 7;
                break;
            case "Inch":
                UnitIndex = 8;
                break;
        }
        return UnitIndex;

    }




}




