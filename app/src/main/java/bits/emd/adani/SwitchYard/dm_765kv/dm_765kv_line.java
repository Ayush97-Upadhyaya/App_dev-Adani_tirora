package bits.emd.adani.SwitchYard.dm_765kv;

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

public class dm_765kv_line extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_765kv_line);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.dm_765kv_line_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.dm_765kv_line_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.dm_765kv_line_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_765KV_LINE_1_radiogroup);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_R);// LA COUNTER PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_Y);// LA COUNTER PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_B);// LA COUNTER PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_R);// LA LEAKAGE PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_Y);// LA LEAKAGE PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_B);// LA LEAKAGE PHASE R
                ed.setEnabled(false);

                ToggleButton tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(false);


                tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(false);


                tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(false);


                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_R); //REMARKS IF ANY FOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_765KV_LINE_1_radiogroup);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_R);// LA COUNTER PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_Y);// LA COUNTER PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_B);// LA COUNTER PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_R);// LA LEAKAGE PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_Y);// LA LEAKAGE PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_B);// LA LEAKAGE PHASE R
                ed.setEnabled(true);

                ToggleButton tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(true);


                tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(true);


                tb =(ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(true);


                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_R); //REMARKS IF ANY FOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_LINE1_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_line"); // tablename

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

                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_765KV_LINE_1_radiogroup);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'R'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_R)).getText().toString() );  //LA Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_R)).getText().toString() );  //LA Leakage R
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_R)).getText().toString() );  //Persisting R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_R)).getText().toString() );  //Remarks R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
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
                sb.append("dm_765kv_line"); // tablename

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

                rg = (RadioGroup)findViewById(R.id.DM_765KV_LINE_1_radiogroup);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'Y'"); //Phase Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_Y)).getText().toString() );  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_Y)).getText().toString() );  //lA Leakage Y
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_Y)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Y values

                query = sb.toString();
                object = new ConnectionClass();
                object.execute(query);

                //////////////////////////////////////////
                //ADD VALUES TO B CURRENT

                sb =  new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_line"); // tablename
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

                rg = (RadioGroup)findViewById(R.id.DM_765KV_LINE_1_radiogroup);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LINE number
                sb.append(","); // segregating values

                sb.append("'B'"); //Phase B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LACOUNTER_B)).getText().toString() );  //LA Counter B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_LALEAKAGE_B)).getText().toString() );  //LA Leakage B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_LINE1_PERSISTING_B)).getText().toString() );  //Persisting Alarm B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_REMARKS_B)).getText().toString() );  //Remarks If Any B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_LINE1_VERIFIED_BY)).getText().toString() );  //Verified By
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
