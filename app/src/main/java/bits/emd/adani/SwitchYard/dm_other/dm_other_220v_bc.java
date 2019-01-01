package bits.emd.adani.SwitchYard.dm_other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_other_220v_bc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_220v_bc);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CHARGER_AND_BATTERY_220v_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CHARGER_AND_BATTERY_220v_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CHARGER_AND_BATTERY_220v_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CHARGER_BATTERY_220V_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                ToggleButton tb =(ToggleButton) findViewById(R.id.CHARGER_AND_BATTERY_220V_HEALTHINESS); //HEATHINESS OF 220 V BATTERY BANK 1
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TERMINAL_VOLTAGE_BAT1);//TERMINAL VOLTAGE OF 220V BATTERY BANK 1
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_CHECK);//CHECK FOR HOUSEKEEPIG OF BATTERY ROOM
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_BATTERY); //TEMPERATURE OF BATTERY ROOM
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_OF_CHARGER_ROOM);//TEMPERATURE OF CHARGER ROOM
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LEAKAGE_FROM_220V_BATTERY_BANK_1);//ELECTROLTE LEVEL AND LEAKAGE FROM 220V BATTRY BANK 1
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_R); //220V DC BATTERY CHARGER 1 AC VOLT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_Y);//220V DC BATTERY CHARGER 1 AC VOLT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_B); //220V DC BATTERY CHARGER 1 AC VOLT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_R);//220V DC BATTERY CHARGER 1 AC CURRENT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_Y); //220V DC BATTERY CHARGER 1 AC CURRENT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_B);//220V DC BATTERY CHARGER 1 AC CURRENT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_VOLT); //220V DC BATTERY CHARGER 1 DC VOLT.
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_CURRENT);//220V DC BATTERY CHARGER 1 DC CURRENT
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_EARTHFAULT_IN_220V_CHARGER);//CHECK FOR ANY EARTHFAULT IN 220V CHARGER 1
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LED);//LED OF 220V BATTERY CHARGER 1
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_REMARKS); //REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220v_VERIFIED_BY_ANY);//VERIFIED BY ANY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);


                final RadioGroup rg = (RadioGroup)findViewById(R.id.CHARGER_BATTERY_220V_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                ToggleButton tb =(ToggleButton) findViewById(R.id.CHARGER_AND_BATTERY_220V_HEALTHINESS); //HEATHINESS OF 220 V BATTERY BANK 1
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TERMINAL_VOLTAGE_BAT1);//TERMINAL VOLTAGE OF 220V BATTERY BANK 1
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_CHECK);//CHECK FOR HOUSEKEEPIG OF BATTERY ROOM
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_BATTERY); //TEMPERATURE OF BATTERY ROOM
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_OF_CHARGER_ROOM);//TEMPERATURE OF CHARGER ROOM
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LEAKAGE_FROM_220V_BATTERY_BANK_1);//ELECTROLTE LEVEL AND LEAKAGE FROM 220V BATTRY BANK 1
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_R); //220V DC BATTERY CHARGER 1 AC VOLT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_Y);//220V DC BATTERY CHARGER 1 AC VOLT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_B); //220V DC BATTERY CHARGER 1 AC VOLT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_R);//220V DC BATTERY CHARGER 1 AC CURRENT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_Y); //220V DC BATTERY CHARGER 1 AC CURRENT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_B);//220V DC BATTERY CHARGER 1 AC CURRENT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_VOLT); //220V DC BATTERY CHARGER 1 DC VOLT.
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_CURRENT);//220V DC BATTERY CHARGER 1 DC CURRENT
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_EARTHFAULT_IN_220V_CHARGER);//CHECK FOR ANY EARTHFAULT IN 220V CHARGER 1
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LED);//LED OF 220V BATTERY CHARGER 1
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_REMARKS); //REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CHARGER_AND_BATTERY_220v_VERIFIED_BY_ANY);//VERIFIED BY ANY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_220v_bc_bank_"); // tablename


                RadioGroup rg = (RadioGroup)findViewById(R.id.CHARGER_BATTERY_220V_RADIOGROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number


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
                sb.append(((ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_HEALTHINESS)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TERMINAL_VOLTAGE_BAT1)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_CHECK)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_BATTERY)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_TEMPERATURE_OF_CHARGER_ROOM)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LEAKAGE_FROM_220V_BATTERY_BANK_1)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_R)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_Y)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_B)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_R)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_Y)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_DC_BATTERY_CHARGER_1_AC_CURRENT_B)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_VOLT)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_BATTERY_CHARGER_DC_CURRENT)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_EARTHFAULT_IN_220V_CHARGER)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values
                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.CHARGER_AND_BATTERY_220V_LED)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220V_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CHARGER_AND_BATTERY_220v_VERIFIED_BY_ANY)).getText().toString() );  //LA LEAKAGE B
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
