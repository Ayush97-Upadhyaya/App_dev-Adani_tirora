package bits.emd.adani.SwitchYard.dm_400kv;

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

public class dm_400kv_br extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_400kv_br);

        final Button submit_btn = (Button)findViewById(R.id.DM_400_KV_BR_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_400KV_BR_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_400KV_BR_CONFIRM);


        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);


                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_BR_RADIO_GROUP); //To ensure Radiobuttons are unclickable
                for(int i=0 ; i<rg.getChildCount(); i++)
                {
                    rg.getChildAt(i).setClickable(false);
                }


                EditText ed =(EditText)findViewById(R.id.DM_400KV_BR_WTI); // WTI editText
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_OTI); // OTI
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_OIL_LEVEL); // Oil Level in Main Tank
                ed.setEnabled(false);


                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_PERSISTING); // BR Peristing
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_OIL_LEAKAGE); // Oil Leakage
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_ODU_STATUS); // ODU Status
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_FAN_STATUS); // Fan Status
                tb.setClickable(false);




                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_R); // LA_Counter 1
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_Y); // LA_Counter 2
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_B); // LA_Counter 3
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_R); // LA Leakage Current R
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_Y); // LA Leakage Current Y
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_B); // LA Leakage Current B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_IN); // PPM of OIL In
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_OUT); // PPM of OIL Out
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_PAPER); // PPM of Paper
                ed.setEnabled(false);


                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_SILICA_GEL); // Silica Gel Condition
                tb.setClickable(false);



                ed =(EditText)findViewById(R.id.DM_400KV_BR_REMARKS_IF_ANY); // Remarks If Any
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_VERIFIED_BY); // Verified By
                ed.setEnabled(false);
            }
        });


        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_BR_RADIO_GROUP); //To ensure Radiobuttons are clickable
                for(int i=0 ; i<rg.getChildCount(); i++)
                {
                    rg.getChildAt(i).setClickable(true);
                }

                EditText ed =(EditText)findViewById(R.id.DM_400KV_BR_WTI); // WTI editText
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_OTI); // OTI
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_OIL_LEVEL); // Oil Level in Main Tank
                ed.setEnabled(true);


                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_PERSISTING); // BR Peristing
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_OIL_LEAKAGE); // Oil Leakage
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_ODU_STATUS); // ODU Status
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_FAN_STATUS); // Fan Status
                tb.setClickable(true);




                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_R); // LA_Counter 1
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_Y); // LA_Counter 2
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_B); // LA_Counter 3
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_R); // LA Leakage Current R
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_Y); // LA Leakage Current Y
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_B); // LA Leakage Current B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_IN); // PPM of OIL In
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_OUT); // PPM of OIL Out
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_PPM_PAPER); // PPM of Paper
                ed.setEnabled(true);


                tb = (ToggleButton)findViewById(R.id.DM_400KV_BR_SILICA_GEL); // Silica Gel Condition
                tb.setClickable(true);



                ed =(EditText)findViewById(R.id.DM_400KV_BR_REMARKS_IF_ANY); // Remarks If Any
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_400KV_BR_VERIFIED_BY); // Verified By
                ed.setEnabled(true);
            }
        });


        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_400kv_br_"); // tablename

                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_BR_RADIO_GROUP);  // value from radiogroup
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


                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_WTI)).getText().toString() );  //WTI
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_OTI)).getText().toString() );  //OTI
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_OIL_LEVEL)).getText().toString() );  //OIL LEVEL
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_BR_PERSISTING)).getText().toString() );  //PERSISTING ALARMS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_BR_OIL_LEAKAGE)).getText().toString() );  //OIL LEAKAGE
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_BR_ODU_STATUS)).getText().toString() );  //ODU STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_BR_FAN_STATUS)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_R)).getText().toString() );  //LA COUNTER R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_Y)).getText().toString() );  //LA COUNTER Y
                sb.append(",");

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LACOUNTER_B)).getText().toString() );  //LA COUNTER B
                sb.append(",");

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_R)).getText().toString() );  //LA LEAKAGE R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_Y)).getText().toString() );  //LA LEAKAGE Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_LA_LEAKAGE_B)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_IN)).getText().toString() );  //PPM OIL IN
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_PPM_OIL_OUT)).getText().toString() );  //PPM OIL OUT
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_PPM_PAPER)).getText().toString() );  //PPM PAPER
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_BR_SILICA_GEL)).getText().toString() );  //SILICA GEL
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_REMARKS_IF_ANY)).getText().toString() );  //Remarks If Any
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_BR_VERIFIED_BY)).getText().toString() );  //Verified By
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