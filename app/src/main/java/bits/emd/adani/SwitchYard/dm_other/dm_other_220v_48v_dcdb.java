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

public class dm_other_220v_48v_dcdb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_220v_48v_dcdb);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_DCDB_220_48_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_DCDB_220_48_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_DCDB_220_48_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_220);//Check Whether door ar propely closed for 220 V DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_48);//Check Whether door are propely closed for 48 V DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_220);//Check whether all holes in panel are sealed of 220 V DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_48);//Check whether all holes in panel are sealed of 48 V DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_220);//Check whether all meters in 220 v DCDB are in working condition
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_48);//Check whether all meters in 48 v DCDB are in working condition
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_STARTUP);//Check Whether door ar propely closed for Start Up DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_START);//Check whether all holes in panel are sealed of Start Up DCDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_STARTUP);//Check whether all meters in  Start Up DCDB are in working condition
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DC_LIGHTNING);//Check for DC lighting healthiness of Control room
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.DM_DCDB_220_48_REMARKS); //REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_DCDB_220_48_VERIFIED_BY);//VERIFIED BY ANY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_220);//Check Whether door ar propely closed for 220 V DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_48);//Check Whether door are propely closed for 48 V DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_220);//Check whether all holes in panel are sealed of 220 V DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_48);//Check whether all holes in panel are sealed of 48 V DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_220);//Check whether all meters in 220 v DCDB are in working condition
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_48);//Check whether all meters in 48 v DCDB are in working condition
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_STARTUP);//Check Whether door ar propely closed for Start Up DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_START);//Check whether all holes in panel are sealed of Start Up DCDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_STARTUP);//Check whether all meters in  Start Up DCDB are in working condition
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_DCDB_220_48_DC_LIGHTNING);//Check for DC lighting healthiness of Control room
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.DM_DCDB_220_48_REMARKS); //REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_DCDB_220_48_VERIFIED_BY);//VERIFIED BY ANY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_220v_48v_dcdb"); // tablename

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
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_220)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_48)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_220)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_48)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_220)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_48)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_DOOR_CLOSED_STARTUP)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_HOLES_SEALED_START)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_METERS_WORKING_STARTUP)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_DCDB_220_48_DC_LIGHTNING)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_DCDB_220_48_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_DCDB_220_48_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
