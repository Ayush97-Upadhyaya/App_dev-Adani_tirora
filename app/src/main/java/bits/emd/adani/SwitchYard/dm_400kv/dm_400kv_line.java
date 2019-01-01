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

import bits.emd.adani.SwitchYard.*;

public class dm_400kv_line extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_400kv_line);

        final Button submit_btn = (Button)findViewById(R.id.dm_400kv_line_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.dm_400kv_line_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.dm_400kv_line_confirm_btn);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_line_radiogroup); //To ensure Radiobuttons are unclickable
                for(int i=0;i<rg.getChildCount();i++)
                {
                    rg.getChildAt(i).setClickable(false);
                }

                EditText ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_R); // LA Counter Phase R
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_Y); // LA Counter Phase Y
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_B); // LA Counter Phase B
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_R); // LA Leakage Phase R
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_Y); // LA Leakage Phase Y
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LA_LEAKAGE_B); // LA Leakage Phase B
                ed.setEnabled(false);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_400KV_LINE1_PERSISTING_R); // Persisting alarm in line Phase R
                tb.setEnabled(false);

                tb = (ToggleButton) findViewById(R.id.DM_400KV_LINE1_PERSISTING_Y); // Persisting alarm in line Phase Y
                tb.setEnabled(false);

                tb = (ToggleButton) findViewById(R.id.DM_400KV_LINE1_PERSISTING_B); // Persisting alarm in line Phase B
                tb.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_R); // Remarks if any Phase R
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_Y); // Remarks if any Phase Y
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_B); // Remarks if any Phase B
                ed.setEnabled(false);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_VERIFIED_BY); // Verified by off
                ed.setEnabled(false);



            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_line_radiogroup); //To ensure Radiobuttons are clickable
                for(int i=0;i<rg.getChildCount();i++)
                {
                    rg.getChildAt(i).setClickable(true);
                }

                EditText ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_R); // LA Counter Phase R
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_Y); // LA Counter Phase Y
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_B); // LA Counter Phase B
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_R); // LA Leakage Phase R
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_Y); // LA Leakage Phase Y
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_LA_LEAKAGE_B); // LA Leakage Phase B
                ed.setEnabled(true);

                ToggleButton tb = (ToggleButton) findViewById(R.id.DM_400KV_LINE1_PERSISTING_R); // Persisting alarm in line Phase R
                tb.setEnabled(true);

                tb = (ToggleButton) findViewById(R.id.DM_400KV_LINE1_PERSISTING_Y); // Persisting alarm in line Phase Y
                tb.setEnabled(true);

                tb = (ToggleButton) findViewById(R.id.DM_400KV_LINE1_PERSISTING_B); // Persisting alarm in line Phase B
                tb.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_R); // Remarks if any Phase R
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_Y); // Remarks if any Phase Y
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_B); // Remarks if any Phase B
                ed.setEnabled(true);

                ed = (EditText)findViewById(R.id.DM_400KV_LINE1_VERIFIED_BY); // Verified by on
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_400kv_line"); // tablename

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

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_400kv_line_radiogroup);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'R'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_R)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_R)).getText().toString() );  //LA Leakage R
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_LINE1_PERSISTING_R)).getText().toString() );  //Persisting R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_R)).getText().toString() );  //Remarks R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send R values

                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

//////////////////////////////////////////////////////////////////
                // ADD Y current values

                sb =  new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_400kv_line"); // tablename

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

                rg = (RadioGroup)findViewById(R.id.dm_400kv_line_radiogroup);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'Y'"); //Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_Y)).getText().toString() );  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LALEAKAGE_Y)).getText().toString() );  //lA Leakage Y
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_LINE1_PERSISTING_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_Y)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send R values

                query = sb.toString();
                object = new ConnectionClass();
                object.execute(query);

                //////////////////////////////////////////
                //ADD VALUES TO B CURRENT

                sb =  new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_400kv_line"); // tablename
                sb.append(" values(");



                sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
               /* String*/ formattedDate = sd.format(new java.util.Date().getTime());
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

                rg = (RadioGroup)findViewById(R.id.dm_400kv_line_radiogroup);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'B'"); //Phase B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LACOUNTER_B)).getText().toString() );  //LA Counter B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_LA_LEAKAGE_B)).getText().toString() );  //LA Leakage B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_400KV_LINE1_PERSISTING_B)).getText().toString() );  //Persisting Alarm B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_REMARKS_B)).getText().toString() );  //Remarks If Any B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_400KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close



                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase query = sb.toString();
                query = sb.toString();
                object = new ConnectionClass();
                object.execute(query);
                //Add ProgressBar to check if Query executed or not
                //finish();
            }
        });
    }
}