package comp210p.unitsconverter;

/**
 * Created by xulian on 24/03/2016.
 */
import android.net.Uri;
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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TemperatureConverter extends AppCompatActivity {
    //--------------------------
    private static final DecimalFormat df = new DecimalFormat("#.00");
    static Spinner spinner01;
    static Spinner spinner02;
    ArrayAdapter<CharSequence> adapter;
    public String UnitSymble, firstunit, secondunit;
    public int UnitIndex, UnitIndex01, UnitIndex02;
    public double inputnum, outputnum;
    public TextView outputText = null, firstunitsymbol, secondunitsymbol;
    private final String[] Unitsymbol = {"Celcius", "Fahrenheit", "Kelvin"};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    //-------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_converter);
//set spinner list and layout
        spinner01 = (Spinner) findViewById(R.id.spinner);
        spinner02 = (Spinner) findViewById(R.id.spinner2);
        adapter = ArrayAdapter.createFromResource(this, R.array.unitMass, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner01.setAdapter(adapter);
        spinner02.setAdapter(adapter);
//refer
        outputText = (TextView) findViewById(R.id.textDisplay);
        firstunitsymbol = (TextView) findViewById(R.id.firstUnitSymbol);
        secondunitsymbol = (TextView) findViewById(R.id.secondUnitSymbol);
// update output when text changes
        EditText amountEditText1 = (EditText) findViewById(R.id.firstMass);
        amountEditText1.addTextChangedListener(amountEditTextWatcher);
// update output when dropdowns changed
        spinner01.setOnItemSelectedListener(MyOnItemSelectedListener);
        spinner02.setOnItemSelectedListener(MyOnItemSelectedListener);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
        public void afterTextChanged(Editable s) {
        }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) {
        }
    };

    // calculate answer and display
    private void doConversion() {
        try {
            outputnum = calculate();
            outputText.setText(String.valueOf(df.format(outputnum)));
        } catch (NumberFormatException e) {
            outputText.setText("\uD83D\uDCA9");
        }
    }

    //----------------------------------------------
//Calculation for conversion
//----------------------------------------------
    private double calculate() {
        double outputNum = 0;
// read input from user entry
        EditText input = (EditText) findViewById(R.id.firstMass);
        String s = input.getText().toString();
        inputnum = Double.parseDouble(s);
// 'from' unit
        firstunit = spinner01.getSelectedItem().toString();
        UnitIndex01 = getIndex(firstunit);
        firstunitsymbol.setText(Unitsymbol[UnitIndex01]);
// 'to' unit
        secondunit = spinner02.getSelectedItem().toString();
        UnitIndex02 = getIndex(secondunit);
        secondunitsymbol.setText(Unitsymbol[UnitIndex02]);

        if (UnitIndex01 == 0 && UnitIndex02 == 1)
             outputNum = inputnum * 9 / 5 + 32;
        else if (UnitIndex01 == 0 && UnitIndex02 == 2)
             outputNum = inputnum + 273.15;
        else if (UnitIndex01 == 0 && UnitIndex02 == 0)
             outputNum = inputnum;
        else if (UnitIndex01 == 1 && UnitIndex02 == 0)
             outputNum = (inputnum - 32) * 5 / 9;
        else if (UnitIndex01 == 1 && UnitIndex02 == 2)
             outputNum = ((inputnum - 32) * 5 / 9) + 273.15;
        else if (UnitIndex01 == 1 && UnitIndex02 == 1)
            outputNum = inputnum;
        else if (UnitIndex01 == 2 && UnitIndex02 == 0)
            outputNum = inputnum - 273.15;
        else if (UnitIndex01 == 2 && UnitIndex02 == 1)
            outputNum = (inputnum - 273.15) * 9 / 5 + 32;
        else if (UnitIndex01 == 2 && UnitIndex02 == 2)
            outputNum = inputnum;
        return outputNum;
    }

    private int getIndex(String text) {
        switch (text) {
            case "Celsius":
                UnitIndex = 0;
                break;
            case "Fahrenheit":
                UnitIndex = 1;
                break;
            case "Kelvin":
                UnitIndex = 2;
                break;
        }
        return UnitIndex;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "TemperatureConverter Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://comp210p.unitsconverter/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "TemperatureConverter Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://comp210p.unitsconverter/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
