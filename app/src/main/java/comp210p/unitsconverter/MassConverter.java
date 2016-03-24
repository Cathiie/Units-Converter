package comp210p.unitsconverter;
//Created by Catherine
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



import java.util.ArrayList;

public class MassConverter extends AppCompatActivity {
    static Spinner spinner01;
    static Spinner spinner02;

    ArrayAdapter<CharSequence> adapter;

    public static String UnitSymbol;
    public int UnitIndex;

    public final double[] ConverterFactor = {0.06479891, 28.35, 453.59237, 0.907185, 0.001, 1000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_converter);


        //set spinner list and layout
        spinner01 = (Spinner) findViewById(R.id.spinner);
        spinner02 = (Spinner) findViewById(R.id.spinner2);


        adapter = ArrayAdapter.createFromResource(this, R.array.UnitMass, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner01.setAdapter(adapter);
        spinner02.setAdapter(adapter);

    }



    //get spinner string

    private int getIndex(String text) {

        switch (text) {
            case "Grain":
                UnitIndex = 0;
                break;
            case "Ounce":
                UnitIndex = 1;
                break;
            case "Pound":
                UnitIndex = 2;
                break;
            case "Ton":
                UnitIndex = 3;
                break;
            case "Kilograms":
                UnitIndex = 4;
                break;
            case "Milligrams":
                UnitIndex = 5;
                break;

        }
        return UnitIndex;

    }




}
