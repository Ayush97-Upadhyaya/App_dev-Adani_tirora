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

public class dm_transformer_yard_sat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_transformer_yard_sat);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_400_KV_SAT_PHASE_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_400KV_SAT_PHASE__EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_400KV_SAT_PHASE_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.SAT_PHASE_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.SAT_PHASE_1_HV);// HV WTI
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_LV);// LV WTI
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_OTI);// OTI
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_OIL);// OIL LEVEL/MAIN TANK
                ed.setEnabled(false);

                ToggleButton tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA)
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_OIL_LEAKAGE);//OIL LEAKAGE
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_FAN);//FAN STATUS
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_SILICA);//SILICA GEL CONDITION
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_REMARKS);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.SAT_PHASE_VERIFIED);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);


                final RadioGroup rg = (RadioGroup)findViewById(R.id.SAT_PHASE_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.SAT_PHASE_1_HV);// HV WTI
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_LV);// LV WTI
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_OTI);// OTI
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_OIL);// OIL LEVEL/MAIN TANK
                ed.setEnabled(true);

                ToggleButton tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_PERSISTING);//PERSISTING TRAFO ALARMS (IN SCADA)
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_OIL_LEAKAGE);//OIL LEAKAGE
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_FAN);//FAN STATUS
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.SAT_PHASE_1_SILICA);//SILICA GEL CONDITION
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.SAT_PHASE_1_REMARKS);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.SAT_PHASE_VERIFIED);//VERIFIED BY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb =  new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_sat_"); // tablename

                RadioGroup rg = (RadioGroup)findViewById(R.id.SAT_PHASE_RADIOGROUP);  // value from radiogroup
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


                sb.append(((EditText)findViewById(R.id.SAT_PHASE_1_HV)).getText().toString() );  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.SAT_PHASE_1_LV)).getText().toString() );  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.SAT_PHASE_1_OTI)).getText().toString() );  //LA Counter Y
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.SAT_PHASE_1_OTI)).getText().toString() );  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SAT_PHASE_1_PERSISTING)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SAT_PHASE_1_OIL_LEAKAGE)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SAT_PHASE_1_FAN)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.SAT_PHASE_1_SILICA)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.SAT_PHASE_1_REMARKS)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.SAT_PHASE_VERIFIED)).getText().toString() );  //Verified By
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