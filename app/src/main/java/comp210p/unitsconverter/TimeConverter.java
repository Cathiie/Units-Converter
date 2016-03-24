package comp210p.unitsconverter;
//Created by Catherine

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class TimeConverter extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);

        //Buttons for user to start conversion
        Button buttonConvertFromHMS = (Button) findViewById(R.id.buttonConvertfromHMS);

        Button buttonConvertSeconds = (Button) findViewById(R.id.buttonConvertSeconds);

        buttonConvertFromHMS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText editHours = (EditText) findViewById(R.id.editHours);
                EditText editMinutes = (EditText) findViewById(R.id.editMinutes);
                EditText editSeconds = (EditText) findViewById(R.id.editSeconds);

                int hours = Integer.parseInt(editHours.getText().toString());
                int minutes = Integer.parseInt(editMinutes.getText().toString());
                int seconds = Integer.parseInt(editHours.getText().toString());
                int secondsOut = (hours * 60 * 60) + (minutes * 60) + seconds;

                EditText display = (EditText) findViewById(R.id.editSecondsBackwards);
                display.setText("" + (secondsOut));


            }
        });

        buttonConvertSeconds.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText editSecondsBackwards = (EditText) findViewById(R.id.editSecondsBackwards);

                int seconds = Integer.parseInt(editSecondsBackwards.getText().toString());
                int modMinutes, secondsOut;

                int hours = seconds / 3600;
                modMinutes = seconds % 3600;
                int minutes = modMinutes / 60;
                secondsOut = modMinutes % 60;

                EditText display = (EditText) findViewById(R.id.editHours);
                display.setText("" + (hours));

                display = (EditText) findViewById(R.id.editMinutes);
                display.setText("" + (minutes));

                display = (EditText) findViewById(R.id.editSeconds);
                display.setText("" + (secondsOut));


            }
        });


    }
}
