package comp210p.unitsconverter;
//created by Lian

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import java.text.DecimalFormat;
import java.util.ArrayList;

public class LengthConverter extends AppCompatActivity {
    private static final DecimalFormat df = new DecimalFormat("#.00");

    static Spinner spinner01;
    static Spinner spinner02;
    ArrayAdapter<CharSequence> adapter;

    public String UnitSymble, firstunit, secondunit;
    public int UnitIndex,UnitIndex01,UnitIndex02;
    public double inputnum,outputnum;
    public TextView outputText=null,firstunitsymbol, secondunitsymbol;


    public final double[] ConverterFactor = {0.001, 1, 10, 100, 1000, 0.0006213711922, 1.093613298, 3.280839895, 39.37007874};
    private final String[] Unitsymbol = {"km","m","dm","cm","mm","mi","yd","ft","in"};


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



        //refer
        outputText = (TextView) findViewById(R.id.textView5);
        firstunitsymbol = (TextView) findViewById(R.id.textView);
        secondunitsymbol = (TextView) findViewById(R.id.textView2);


        EditText amountEditText1 = (EditText) findViewById(R.id.editText);
        amountEditText1.addTextChangedListener(amountEditTextWatcher);








    }








    //
    //get the value in editText1
    //
    private final TextWatcher amountEditTextWatcher = new TextWatcher() {
                @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {

            try {
                inputnum = Double.parseDouble(s.toString());
                outputnum = calculate(UnitIndex01, UnitIndex02);
                outputText.setText(String.valueOf(df.format(outputnum)));
            }
            catch (NumberFormatException e) {

                outputText.setText("");

            }


        }

        @Override
        public void afterTextChanged(Editable s) { }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }
    };

    //----------------------------------------------
    //Calculation of the convertion
    //
    //---------------
        private double calculate(int index01, int index02) {
            double outputNum=0;

            firstunit = spinner01.getSelectedItem().toString();
            UnitIndex01 = getIndex(firstunit);
            firstunitsymbol.setText(Unitsymbol[UnitIndex01]);
            secondunit = spinner02.getSelectedItem().toString();
            UnitIndex02 = getIndex(secondunit);
            secondunitsymbol.setText(Unitsymbol[UnitIndex02]);

            double factor1=ConverterFactor[index01];
            double factor2=ConverterFactor[index02];
            outputNum = inputnum/factor1*factor2;


            return outputNum;
        }



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









