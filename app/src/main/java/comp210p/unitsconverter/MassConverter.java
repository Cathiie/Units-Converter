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
    private static final DecimalFormat df = new DecimalFormat("0.00000");

    static Spinner spinner1;
    static Spinner spinner2;
    ArrayAdapter<CharSequence> adapter;

    public String firstUnit, secondUnit;
    public int unitIndex,unitIndex1,unitIndex2;
    public double inputNum,outputNum;
    public TextView outputText=null,firstUnitSymbol, secondUnitSymbol;

    // multiply by this to convert from grams
    public final double[] ConverterFactor =
            {15.432358353, 0.03527396195,
                    0.0022046, 0.0000011023113109 ,
                    1, 0.001,
                    1000};
    private final String[] unitSymbol =
            {"Grain","Ounce",
                    "Pound", "Ton",
                    "Grams", "Kilograms",
                    "Milligrams"};

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
        firstUnitSymbol = (TextView) findViewById(R.id.firstUnitSymbol);
        secondUnitSymbol = (TextView) findViewById(R.id.secondUnitSymbol);

        // update output when text changes
        EditText amountEditText1 = (EditText) findViewById(R.id.firstMass);
        amountEditText1.addTextChangedListener(amountEditTextWatcher);

        // update output when dropdowns changed
        spinner1.setOnItemSelectedListener(MyOnItemSelectedListener);
        spinner2.setOnItemSelectedListener(MyOnItemSelectedListener);

    }

    private final AdapterView.OnItemSelectedListener MyOnItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            doConversion();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            // stackoverflow told me to do this, possibly to prevent "method not found"?
        }
    };

    // for user input box
    private final TextWatcher amountEditTextWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            doConversion();
        }

        @Override
        public void afterTextChanged(Editable s) { }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }
    };

    // calculate answer and display
    private void doConversion() {
        try {
            outputNum = calculate();
            outputText.setText(String.valueOf(df.format(outputNum)));
        }
        catch (NumberFormatException e) {
            outputText.setText("");
        }
    }

    //----------------------------------------------
    //Calculation for conversion
    //----------------------------------------------
    private double calculate() {
        double outputNum=0;

        // read input from user entry
        EditText input = (EditText) findViewById(R.id.firstMass);
        String s = input.getText().toString();
        inputNum = Double.parseDouble(s);

        // 'from' unit
        firstUnit = spinner1.getSelectedItem().toString();
        unitIndex1 = getIndex(firstUnit);
        firstUnitSymbol.setText(unitSymbol[unitIndex1]);

        // 'to' unit
        secondUnit = spinner2.getSelectedItem().toString();
        unitIndex2 = getIndex(secondUnit);
        secondUnitSymbol.setText(unitSymbol[unitIndex2]);

        double factor1=ConverterFactor[unitIndex1];
        double factor2=ConverterFactor[unitIndex2];
        outputNum = inputNum/factor1*factor2;

        return outputNum;
    }

    //string to index
    private int getIndex(String text) {

        switch (text) {
            case "Grain":
                unitIndex = 0;
                break;
            case "Ounce":
                unitIndex = 1;
                break;
            case "Pound":
                unitIndex = 2;
                break;
            case "Ton":
                unitIndex = 3;
                break;
            case "Grams":
                unitIndex = 4;
                break;
            case "Kilograms":
                unitIndex = 5;
                break;
            case "Milligrams":
                unitIndex = 6;
                break;
            //default:

        }
        return unitIndex;

    }
}
