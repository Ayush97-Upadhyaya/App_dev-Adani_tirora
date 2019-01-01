package bits.emd.adani.SwitchYard.dm_400kv;

import android.content.Intent;
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

public class dm_400kv_misc_trafo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_400kv_misc_trafo);

        final Button submit_btn = (Button) findViewById(R.id.dm_400kv_misc_trafo_submit_btn);
        final Button edit_btn = (Button) findViewById(R.id.dm_400kv_misc_trafo_edit_btn);
        final Button confirm_btn = (Button) findViewById(R.id.dm_400kv_misc_trafo_confirm_btn);





        submit_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(v.GONE);
                edit_btn.setVisibility(v.VISIBLE);
                confirm_btn.setVisibility(v.VISIBLE);


                final RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_misc_trafo_radiogroup);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed = (EditText) findViewById(R.id.MISC_TRAFO_HV_WTI); // HV WTI editText
                ed.setEnabled(false);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_LV_WTI); // LV WTI
                ed.setEnabled(false);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_OIL_LEVEL_MAIN); // Oil Level in Main Tank
                ed.setEnabled(false);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_OTI); // OTI
                ed.setEnabled(false);

                ToggleButton tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_PERSISTING_ALARM); // Peristing
                tb.setClickable(false);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_OIL_LEAKAGE); // Oil Leakage
                tb.setClickable(false);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_SILICA_GEL); // Silica Gel
                tb.setClickable(false);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_FAN_STATUS); // Fan Status
                tb.setClickable(false);



                ed = (EditText) findViewById(R.id.MISC_TRAFO_REMARKS_IF_ANY); // Remarks If Any
                ed.setEnabled(false);
                ed = (EditText) findViewById(R.id.MISC_TRAFO_VERIFIED); // Verified By
                ed.setEnabled(false);
            }
        });


        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit_btn.setVisibility(view.VISIBLE);
                edit_btn.setVisibility(view.GONE);
                confirm_btn.setVisibility(view.GONE);


                final RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_misc_trafo_radiogroup);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed = (EditText) findViewById(R.id.MISC_TRAFO_HV_WTI); // HV WTI editText
                ed.setEnabled(true);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_LV_WTI); // LV WTI
                ed.setEnabled(true);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_OIL_LEVEL_MAIN); // Oil Level in Main Tank
                ed.setEnabled(true);

                ed = (EditText) findViewById(R.id.MISC_TRAFO_OTI); // OTI
                ed.setEnabled(true);

                ToggleButton tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_PERSISTING_ALARM); // Peristing
                tb.setClickable(true);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_OIL_LEAKAGE); // Oil Leakage
                tb.setClickable(true);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_SILICA_GEL); // Silica Gel
                tb.setClickable(true);

                tb = (ToggleButton) findViewById(R.id.MISC_TRAFO_FAN_STATUS); // Fan Status
                tb.setClickable(true);



                ed = (EditText) findViewById(R.id.MISC_TRAFO_REMARKS_IF_ANY); // Remarks If Any
                ed.setEnabled(true);
                ed = (EditText) findViewById(R.id.MISC_TRAFO_VERIFIED); // Verified By
                ed.setEnabled(true);


            }
        });


        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_400kv_misc_trafo_"); // tablename

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_misc_trafo_radiogroup);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();

                sb.append(radioText); // add transformer number

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


                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_HV_WTI)).getText().toString() );  //HV
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_LV_WTI)).getText().toString() );  //LV
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_OTI)).getText().toString() );  //OTI
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_OIL_LEVEL_MAIN)).getText().toString() );  //Oil Level in main tank
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.MISC_TRAFO_PERSISTING_ALARM)).getText().toString() );  //Persisting Alarm
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.MISC_TRAFO_OIL_LEAKAGE)).getText().toString() );  //Persisting Alarm
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.MISC_TRAFO_FAN_STATUS)).getText().toString() );  //Persisting Alarm
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.MISC_TRAFO_SILICA_GEL)).getText().toString() );  //Persisting Alarm
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_REMARKS_IF_ANY)).getText().toString() );  //Remarks If Any
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.MISC_TRAFO_VERIFIED)).getText().toString() );  //Verified By
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