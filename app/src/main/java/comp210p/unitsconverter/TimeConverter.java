package comp210p.unitsconverter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnTouchListener;

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


        Button buttonConvertfromHMS = (Button) findViewById(R.id.buttonConvertfromHMS);

        Button buttonConvertSeconds = (Button) findViewById(R.id.buttonConvertSeconds);

        public void setFocusableInTouchMode (boolean focusableInTouchMode) {
        if (focusableInTouchMode == true);
        HMSToSec(onTouchEvent(View v, MotionEvent event));

        }




            public void HMSToSec(View v, MotionEvent event) {

                final TextView editHours = (TextView) findViewById(R.id.editHours);

                final TextView editMinutes = (TextView) findViewById(R.id.editMinutes);

                final TextView editSeconds = (TextView) findViewById(R.id.editSeconds);

                final TextView editSecondsBackwards = (TextView) findViewById(R.id.editSecondsBackwards);


                int hours = Integer.valueOf(editHours.getText().toString());
                int minutes = Integer.valueOf(editMinutes.getText().toString());
                int Seconds = Integer.valueOf(editSeconds.getText().toString());

                int secondsEquivalent = (hours * 60 * 60) + (minutes * 60) + Seconds;

                return editSecondsBackwards.setText(String.valueOf(secondsEquivalent));
            }
        });

        buttonConvertSeconds.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int Seconds = Integer.valueOf(editSecondsBackwards.getText().toString());
                int modMinutes, modSeconds;

                int hours = Seconds / 3600;
                modMinutes = Seconds % 3600;
                int minutes = modMinutes / 60;
                modSeconds = modMinutes % 60;

                editHours.setText(String.valueOf(hours));
                editMinutes.setText(String.valueOf(minutes));
                editSeconds.setText(String.valueOf(modSeconds));

            }
        });

    }
}
