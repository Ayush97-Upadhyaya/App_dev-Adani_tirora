package bits.emd.adani.SwitchYard.dm_other;

import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_other_ups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_ups);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.UPS_SYSTEM_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.UPS_SYSTEM_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.UPS_SYSTEM_CONFIRM);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS);//HEALTHINESS OF UPS BATTERY BANK
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_R); //TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_Y);//TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_B);//TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_CHECK);//CHECK FOR HOUSEKEEPING OF UPS BATTERY ROOM
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE_BATTERY);//TEMPERATURE OF UPS BATTERY ROOM
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE);//TEMPERATURE OF UPS ROOM
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_LEAKAGE);//ELECTROLYTE LEAKAGE FROM UPS BATTERY BANK
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_R); //UPS -1 AC VOLT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_Y);//UPS -1 AC VOLT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_B);//UPS -1 AC VOLT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_R); //UPS -2 AC VOLT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_Y);//UPS -2 AC VOLT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_B);//UPS -2 AC VOLT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_R); //UPS -1 AC CURRENT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_Y);//UPS -1 AC CURRENT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_B);//UPS -1 AC CURRENT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_R); //UPS -2 AC CURRENT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_Y);//UPS -2 AC CURRENT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_B);//UPS -2 AC CURRENT PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_R);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_Y);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_B);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_COOLING);//UPS COOLING SYSTEM
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_R);//UPS 1 LED STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_Y);//UPS 1 LED STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_B);//UPS 1 LED STATUS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_R);//UPS 2  LED STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_Y);//UPS 2  LED STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_B);//UPS 2  LED STATUS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_1);//HEALTHINESS OF UPS 1
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_2);//HEALTHINSS OF UPS 2
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_CLEANLINES);//CLEANLINESS OF UPS PANEL
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_REMARKS);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_VERIFIED);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS);//HEALTHINESS OF UPS BATTERY BANK
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_R); //TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_Y);//TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_B);//TERMINAL VOLTAGE OF UPS BATTERY BANK PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_CHECK);//CHECK FOR HOUSEKEEPING OF UPS BATTERY ROOM
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE_BATTERY);//TEMPERATURE OF UPS BATTERY ROOM
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE);//TEMPERATURE OF UPS ROOM
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_LEAKAGE);//ELECTROLYTE LEAKAGE FROM UPS BATTERY BANK
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_R); //UPS -1 AC VOLT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_Y);//UPS -1 AC VOLT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_B);//UPS -1 AC VOLT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_R); //UPS -2 AC VOLT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_Y);//UPS -2 AC VOLT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_B);//UPS -2 AC VOLT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_R); //UPS -1 AC CURRENT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_Y);//UPS -1 AC CURRENT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_B);//UPS -1 AC CURRENT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_R); //UPS -2 AC CURRENT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_Y);//UPS -2 AC CURRENT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_B);//UPS -2 AC CURRENT PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_R);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_Y);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_B);//HEALTHINESS OF UPS BATTERY BANK FUSE PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_COOLING);//UPS COOLING SYSTEM
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_R);//UPS 1 LED STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_Y);//UPS 1 LED STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_B);//UPS 1 LED STATUS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_R);//UPS 2  LED STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_Y);//UPS 2  LED STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_B);//UPS 2  LED STATUS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_1);//HEALTHINESS OF UPS 1
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_2);//HEALTHINSS OF UPS 2
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.UPS_SYSTEM_CLEANLINES);//CLEANLINESS OF UPS PANEL
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_REMARKS);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UPS_SYSTEM_VERIFIED);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/////////////////////-------R Values-----------////////////////////////////////////////////
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_ups"); // tablename

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

                sb.append("'R'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CHECK)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE_BATTERY)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE)).getText().toString() );  //FAN STATUS

                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_LEAKAGE)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_COOLING)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_1)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_2)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CLEANLINES)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);
                //Add ProgressBar to check if Query executed or not
                //finish();

/////////////////////-------Y Values-----------////////////////////////////////////////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_ups"); // tablename

                sb.append(" values(");

                sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                formattedDate = sd.format(new java.util.Date().getTime());
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

                sb.append("'Y'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CHECK)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE_BATTERY)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE)).getText().toString() );  //FAN STATUS

                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_LEAKAGE)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_COOLING)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_1)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_2)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CLEANLINES)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                 query = sb.toString();

                 object = new ConnectionClass();
                 object.execute(query);
                //Add ProgressBar to check if Query executed or not
                //finish();



/////////////////////-------B Values-----------////////////////////////////////////////////


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_ups"); // tablename

                sb.append(" values(");

                sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                formattedDate = sd.format(new java.util.Date().getTime());
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

                sb.append("'B'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TERMINAL_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CHECK)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE_BATTERY)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_TEMPERATURE)).getText().toString() );  //FAN STATUS

                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_LEAKAGE)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_VOLTS_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_VOLTS_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_1_CURRENT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_UPS_2_CURRENT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_COOLING)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_1_LED_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_UPS_2_LED_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_1)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_HEALTHINESS_2)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UPS_SYSTEM_CLEANLINES)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UPS_SYSTEM_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();
            }
        });
    }
}
