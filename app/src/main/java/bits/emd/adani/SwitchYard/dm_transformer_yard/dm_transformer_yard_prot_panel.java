package bits.emd.adani.SwitchYard.dm_transformer_yard;

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

public class dm_transformer_yard_prot_panel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_transformer_yard_prot_panel);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_400_KV_PROTECTION_PANEL_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_400KV_PROTECTION_PANEL_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_400KV_PROTECTION_PANEL_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.PROTECTION_PANEL_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                ToggleButton tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_GT);//Whether ALL flag relay reset in GT Panel
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_GT);//NO ALARM PESISTING IN GT PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_GT);//TCS RELAY HEALTHY IN GT PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_GT);//PANEL DC ON  OF GT PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_A);//Whether ALL flag relay reset in UT A Panl
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_A);//NO ALARM PESISTING IN UT A PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_A);//TCS RELAY HEALTHY IN UT A PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_A);//PANEL DC ON  OF UT A PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_A);//WHETHER RTCC PANEL OF UT A IS HEALTHY AND NO ALARM
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.PROTECTION_PANEL_TAP_A);//  TAP POSITION IN RTCC PANEL OF UT A
                ed.setEnabled(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_B);//Whether ALL flag relay reset in UT B PanL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_B);//NO ALARM PESISTING IN UT B PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_B);//TCS RELAY HEALTHY IN UT B PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_B);//PANEL DC ON  OF UT B PANEL
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_B);//WHETHER RTCC PANEL OF UT B IS HEALTHY AND NO ALARM
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_TAP_B);// TAP POSITION IN RTCC PANEL OF UT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_VERIFIED);// VERIFIED BY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_REMARKS);// REMARKS
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.PROTECTION_PANEL_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                ToggleButton tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_GT);//Whether ALL flag relay reset in GT Panel
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_GT);//NO ALARM PESISTING IN GT PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_GT);//TCS RELAY HEALTHY IN GT PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_GT);//PANEL DC ON  OF GT PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_A);//Whether ALL flag relay reset in UT A Panl
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_A);//NO ALARM PESISTING IN UT A PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_A);//TCS RELAY HEALTHY IN UT A PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_A);//PANEL DC ON  OF UT A PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_A);//WHETHER RTCC PANEL OF UT A IS HEALTHY AND NO ALARM
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.PROTECTION_PANEL_TAP_A);//  TAP POSITION IN RTCC PANEL OF UT A
                ed.setEnabled(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_B);//Whether ALL flag relay reset in UT B PanL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_B);//NO ALARM PESISTING IN UT B PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_B);//TCS RELAY HEALTHY IN UT B PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_B);//PANEL DC ON  OF UT B PANEL
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_B);//WHETHER RTCC PANEL OF UT B IS HEALTHY AND NO ALARM
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_TAP_B);// TAP POSITION IN RTCC PANEL OF UT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_VERIFIED);// VERIFIED BY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PROTECTION_PANEL_REMARKS);// REMARKS
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb =  new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_prot_panel_"); // tablename

                RadioGroup rg = (RadioGroup)findViewById(R.id.PROTECTION_PANEL_RADIOGROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add SAT number

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
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_GT)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_GT)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_GT)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_GT)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_A)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_A)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_A)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_A)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_A)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.PROTECTION_PANEL_TAP_A)).getText().toString() );  //Verified By
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_UT_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_NO_UT_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_TCS_UT_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_PANEL_UT_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.PROTECTION_PANEL_WHETHER_RTCC_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append(((EditText)findViewById(R.id.PROTECTION_PANEL_TAP_B)).getText().toString() );  //Verified By
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.PROTECTION_PANEL_REMARKS)).getText().toString() );  //Verified By
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.PROTECTION_PANEL_VERIFIED)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                String query = sb.toString();
                ConnectionClass object = new ConnectionClass();
                object.execute(query);


            }
        });
    }
}

