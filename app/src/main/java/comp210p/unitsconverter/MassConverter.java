package comp210p.unitsconverter;
//Created by Catherine

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


public class MassConverter extends AppCompatActivity {
    private static final DecimalFormat df = new DecimalFormat("#.000");

    static Spinner spinner1;
    static Spinner spinner2;
    ArrayAdapter<CharSequence> adapter;

    public String firstUnit, secondUnit;
    public int unitIndex,unitIndex1,unitIndex2;
    public double inputNum,outputNum;
    public TextView outputText=null,firstUnitSymbol, secondUnitSymbol;


    public final double[] ConverterFactor = {0.06479891, 28.35, 1, 453.59237, 0.907185, 0.001, 1000};
    private final String[] unitSymbol = {"Grain","Ounce","Ton", "Grams", "Kilograms","Milligrams"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_converter);


        //set spinner list and layout
        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);


        adapter = ArrayAdapter.createFromResource(this, R.array.unitMass, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);


        spinner2.setAdapter(adapter);



        //refer
        outputText = (TextView) findViewById(R.id.textDisplay);
        firstUnitSymbol = (TextView) findViewById(R.id.firstMass);
        secondUnitSymbol = (TextView) findViewById(R.id.secondMass);


        EditText amountEditText1 = (EditText) findViewById(R.id.editText);
        amountEditText1.addTextChangedListener(amountEditTextWatcher);

    }








    //
    //get the value in inputText
    //
    private final TextWatcher amountEditTextWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {

            try {
                inputNum = Double.parseDouble(s.toString());
                outputNum = calculate(unitIndex1, unitIndex2);
                outputText.setText(String.valueOf(df.format(outputNum)));
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
    //Calculation for conversion
    //---------------
    private double calculate(int index1, int index2) {
        double outputNum=0;

        firstUnit = spinner1.getSelectedItem().toString();
        unitIndex1 = getIndex(firstUnit);
        firstUnitSymbol.setText(unitSymbol[unitIndex1]);
        secondUnit = spinner2.getSelectedItem().toString();
        unitIndex2 = getIndex(secondUnit);
        secondUnitSymbol.setText(unitSymbol[unitIndex2]);

        double factor1=ConverterFactor[index1];
        double factor2=ConverterFactor[index2];
        outputNum = inputNum/factor1*factor2;


        return outputNum;
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
            case "Grams":
                UnitIndex = 4;
                break;
            case "Kilograms":
                UnitIndex = 5;
                break;
            case "Milligrams":
                UnitIndex = 6;
                break;

        }
        return UnitIndex;

    }




}
