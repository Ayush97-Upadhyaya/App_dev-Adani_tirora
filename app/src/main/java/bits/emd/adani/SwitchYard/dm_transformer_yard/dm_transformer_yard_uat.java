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

public class dm_transformer_yard_uat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_transformer_yard_uat);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_400_KV_UAT_A_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_400KV_UAT_A__EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_400KV_UAT_A_CONFIRM);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.UAT_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.UAT_A_HV);// HV WTI A
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_B_HV);// HV WTI B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_A_LV);// LV WTI A
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_B_LV);// LV WTI B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_A_OTI);// OTI A
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_B_OTI);// OTI B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_A_OIL);//OIL LEVEL/MAIN TANK A
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_B_OIL);//OIL LEVEL/MAIN TANK B
                ed.setEnabled(false);

                ToggleButton tb =(ToggleButton)findViewById(R.id.UAT_A_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA) A
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_B_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA) B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_A_OIL_LEAKAGE);//OIL LEAKAGE A
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_B_OIL_LEAKAGE);//OIL LEAKAGE B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_A_FAN);//FAN STATUS A
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_B_FAN);//FAN STATUS B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_A_SILICA);//SILICA GEL CONDITION A
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.UAT_B_SILICA);//SILICA GEL CONDITION B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.UAT_A_REMARKS);//REMARKS IF ANY A
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_B_REMARKS);//REMARKS IF ANY B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.UAT_VERIFIED);//VERIFIED BY
                ed.setEnabled(false);

            }
        });
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.UAT_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.UAT_A_HV);// HV WTI A
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_B_HV);// HV WTI B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_A_LV);// LV WTI A
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_B_LV);// LV WTI B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_A_OTI);// OTI A
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_B_OTI);// OTI B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_A_OIL);//OIL LEVEL/MAIN TANK A
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_B_OIL);//OIL LEVEL/MAIN TANK B
                ed.setEnabled(true);

                ToggleButton tb =(ToggleButton)findViewById(R.id.UAT_A_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA) A
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_B_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA) B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_A_OIL_LEAKAGE);//OIL LEAKAGE A
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_B_OIL_LEAKAGE);//OIL LEAKAGE B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_A_FAN);//FAN STATUS A
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_B_FAN);//FAN STATUS B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_A_SILICA);//SILICA GEL CONDITION A
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.UAT_B_SILICA);//SILICA GEL CONDITION B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.UAT_A_REMARKS);//REMARKS IF ANY A
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_B_REMARKS);//REMARKS IF ANY B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.UAT_VERIFIED);//VERIFIED BY
                ed.setEnabled(true);
            }
        });
        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /////----------------------------ADD A VALUES -----------------------------------//////////
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_uat_"); // tablename

                RadioGroup rg = (RadioGroup) findViewById(R.id.UAT_RADIOGROUP);  // value from radiogroup
                RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
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


                sb.append(((EditText) findViewById(R.id.UAT_A_HV)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.UAT_A_LV)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.UAT_A_OTI)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText) findViewById(R.id.UAT_A_OIL)).getText().toString());  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_A_PERSISTING)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_A_OIL_LEAKAGE)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_A_FAN)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_A_SILICA)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UAT_A_REMARKS)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'A'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UAT_VERIFIED)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                String query = sb.toString();
                ConnectionClass object = new ConnectionClass();
                object.execute(query);





                /////----------------------------ADD B VALUES -----------------------------------//////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_uat_"); // tablename

                rg = (RadioGroup) findViewById(R.id.UAT_RADIOGROUP);  // value from radiogroup
                rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add SAT number

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


                sb.append(((EditText) findViewById(R.id.UAT_B_HV)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.UAT_B_LV)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.UAT_B_OTI)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText) findViewById(R.id.UAT_B_OIL)).getText().toString());  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_B_PERSISTING)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_B_OIL_LEAKAGE)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_B_FAN)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.UAT_B_SILICA)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UAT_B_REMARKS)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'B'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.UAT_VERIFIED)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                query = sb.toString();
                object = new ConnectionClass();
                object.execute(query);


            }
        });
    }
}
