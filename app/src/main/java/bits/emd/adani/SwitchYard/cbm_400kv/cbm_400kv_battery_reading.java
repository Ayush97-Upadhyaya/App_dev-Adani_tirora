package bits.emd.adani.SwitchYard.cbm_400kv;

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

public class cbm_400kv_battery_reading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_battery_reading);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_APML_BATTERY_READING_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_APML_BATTERY_READING_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_APML_BATTERY_READING_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_BATTERY_READING_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_TOTAL_VOLTAGE);//Total Voltage
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_VOLT);// Minimum Voltage VOLTS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_CELL_NO);// Minimum Voltage CELL NO
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_CELL_NO);// Maximum Voltage CELL NO.
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_VOLT);// Maximum Voltage VOLT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CAPACITY);// Capacity
                ed.setEnabled(false);

                ToggleButton tb = (ToggleButton)findViewById(R.id.CBM_APML_BATTERY_READING_EARTH_FAULT);//EarthFault
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_VOLTAGE);//Charging Voltage
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_CURRENT); //Charging Current
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_REMARKS); //Remarks
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_VERIFIED); //Verified By
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_BATTERY_READING_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_TOTAL_VOLTAGE);//Total Voltage
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_VOLT);// Minimum Voltage VOLTS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_CELL_NO);// Minimum Voltage CELL NO
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_CELL_NO);// Maximum Voltage CELL NO.
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_VOLT);// Maximum Voltage VOLT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CAPACITY);// Capacity
                ed.setEnabled(true);

                ToggleButton tb = (ToggleButton)findViewById(R.id.CBM_APML_BATTERY_READING_EARTH_FAULT);//EarthFault
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_VOLTAGE);//Charging Voltage
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_CURRENT); //Charging Current
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_REMARKS); //Remarks
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_BATTERY_READING_VERIFIED); //Verified By
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_battery_reading"); // tablename


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
                RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_BATTERY_READING_RADIOGROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_TOTAL_VOLTAGE)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_VOLT)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MINIMUM_VOLTAGE_CELL_NO)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_CELL_NO)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_MAXIMUM_VOLTAGE_VOLT)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CAPACITY)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.CBM_APML_BATTERY_READING_EARTH_FAULT)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_VOLTAGE)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_CHARGING_CURRENT)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_APML_BATTERY_READING_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);
            }
        });
    }
}
