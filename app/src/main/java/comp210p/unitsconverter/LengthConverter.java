package comp210p.unitsconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LengthConverter extends AppCompatActivity {
    Spinner spinner01, spinner02, spinner03, spinner04, spinner05, spinner06, spinner07;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);

        spinner01 = (Spinner)findViewById(R.id.spinner);
        spinner02 = (Spinner)findViewById(R.id.spinner2);
        spinner03 = (Spinner)findViewById(R.id.spinner3);
        spinner04 = (Spinner)findViewById(R.id.spinner4);
        spinner05 = (Spinner)findViewById(R.id.spinner5);
        spinner06 = (Spinner)findViewById(R.id.spinner6);
        spinner07 = (Spinner)findViewById(R.id.spinner7);

        adapter = ArrayAdapter.createFromResource(this, R.array.UnitLength, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner01.setAdapter(adapter);
        spinner02.setAdapter(adapter);
        spinner03.setAdapter(adapter);
        spinner04.setAdapter(adapter);
        spinner05.setAdapter(adapter);
        spinner06.setAdapter(adapter);
        spinner07.setAdapter(adapter);


    }
}
