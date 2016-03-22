package comp210p.unitsconverter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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


        final EditText editHours = (EditText) findViewById(R.id.editHours);

        final EditText editMinutes = (EditText) findViewById(R.id.editMinutes);

        final EditText editSeconds = (EditText) findViewById(R.id.editSeconds);

        final EditText editSecondsBackwards = (EditText) findViewById(R.id.editSecondsBackwards);

        Button buttonConvertfromHMS = (Button) findViewById(R.id.buttonConvertfromHMS);

        buttonConvertfromHMS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int hours = Integer.valueOf(editHours.getText().toString());
                int minutes = Integer.valueOf(editMinutes.getText().toString());
                int Seconds = Integer.valueOf(editSeconds.getText().toString());

                int secondsEquivalent = (hours * 60 * 60) + (minutes * 60) + Seconds;

                editSecondsBackwards.setText(String.valueOf(secondsEquivalent));

            }
        });

    }
}
