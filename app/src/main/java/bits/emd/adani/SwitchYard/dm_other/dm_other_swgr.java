package bits.emd.adani.SwitchYard.dm_other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_other_swgr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_swgr);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.SWITCHGEAR_PANEL_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.SWITCHGEAR_PANEL_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.SWITCHGEAR_SYSTEM_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_PANEL);//Check Whether all panel of 11 kV switchgear are closed
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_HOLES);//Check Whether all holes in panel of 11 kV switchgear are sealed
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_LED);//Check Whether all LED in panel of 11 kV switchgear are healthy
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_RELAY);//Check Whether all Relay  in panel of 11 kV switchgear are healthy, reset and no alarm are glowing
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_PANEL);//Check Whether all panel of 33 kV switchgear are closed
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_HOLES);//Check Whether all holes in panel of 33 kV switchgear are sealed
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_LED);//Check Whether all LED in panel of 33 kV switchgear are healthy
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_RELAY);//Check Whether all Relay  in panel of 33 kV switchgear are healthy, reset and no alarm are glowing
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.SWITCHGEAR_PANEL_REMARKS); //REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.SWITCHGEAR_PANEL_VERIFIED);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_PANEL);//Check Whether all panel of 11 kV switchgear are closed
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_HOLES);//Check Whether all holes in panel of 11 kV switchgear are sealed
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_LED);//Check Whether all LED in panel of 11 kV switchgear are healthy
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_RELAY);//Check Whether all Relay  in panel of 11 kV switchgear are healthy, reset and no alarm are glowing
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_PANEL);//Check Whether all panel of 33 kV switchgear are closed
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_HOLES);//Check Whether all holes in panel of 33 kV switchgear are sealed
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_LED);//Check Whether all LED in panel of 33 kV switchgear are healthy
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_RELAY);//Check Whether all Relay  in panel of 33 kV switchgear are healthy, reset and no alarm are glowing
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.SWITCHGEAR_PANEL_REMARKS); //REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.SWITCHGEAR_PANEL_VERIFIED);//VERIFIED BY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_swgr"); // tablename

                sb.append(" values(");

                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                String formattedDate = sd.format(new java.util.Date().getTime());
                sb.append("'");
                sb.append(formattedDate); // date
                sb.append("'");
                sb.append(","); // segregating values

                sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // timestamp
                formattedDate = sd.format(new java.util.Date());
                sb.append("'");
                sb.append(formattedDate); // add timestamp
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_PANEL)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_HOLES)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_LED)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_11_RELAY)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_PANEL)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_HOLES)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_LED)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SWITCHGEAR_PANEL_33_RELAY)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.SWITCHGEAR_PANEL_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.SWITCHGEAR_PANEL_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();
            }
        });
    }
}
