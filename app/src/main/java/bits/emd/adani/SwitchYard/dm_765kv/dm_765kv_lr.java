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

public class dm_765kv_lr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_765kv_lr);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_765_KV_LR_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_765KV_LR_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_765KV_LR_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_LR_RADIO_GROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.DM_LR_WTI_R); //WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_WTI_Y);//WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_WTI_B); //WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_R); //OTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_Y); //OTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_B);//OTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_R);//OIL LEVEL PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_Y);//OIL LEVEL PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_B);//OIL LEVEL PHASE B
                ed.setEnabled(false);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_R);//ODU STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_Y);//ODU STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_B);//ODU STATUS PHASE B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_R); //LA COUNTER HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_Y);//LA COUNTER HV PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_B);//LA COUNTER HV PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_NEU_R);//LA COUNTER NEU PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_R);//LA LEAKAGE HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_Y);//LA LEAKAGE HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_B);//LA LEAKAGE HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_NEU_R);//LA LEAKAGE NEU PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_R);// PPM OF OIL IN PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_Y);// PPM OF OIL IN PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_B);// PPM OF OIL IN PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_R);// PPM OF OIL OUT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_Y);// PPM OF OIL OUT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_B);// PPM OF OIL OUT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_R);//PPM OF PAPER PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_Y);//PPM OF PAPER PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_B);//PPM OF PAPER PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_R);//SIICA GEL CONDITION PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_Y);//SIICA GEL CONDITION PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_B);//SIICA GEL CONDITION PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_LR_OLGDA_STATUS_R);//OLDGA STATUS PHASE R
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_LR_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_LR_RADIO_GROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup  clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.DM_LR_WTI_R); //WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_WTI_Y);//WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_WTI_B); //WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_R); //OTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_Y); //OTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OTI_B);//OTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_R);//OIL LEVEL PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_Y);//OIL LEVEL PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_OIL_LEVEL_B);//OIL LEVEL PHASE B
                ed.setEnabled(true);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_R);//ODU STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_Y);//ODU STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_B);//ODU STATUS PHASE B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_R); //LA COUNTER HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_Y);//LA COUNTER HV PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_B);//LA COUNTER HV PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LA_COUNTER_NEU_R);//LA COUNTER NEU PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_R);//LA LEAKAGE HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_Y);//LA LEAKAGE HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_B);//LA LEAKAGE HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_NEU_R);//LA LEAKAGE NEU PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_R);// PPM OF OIL IN PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_Y);// PPM OF OIL IN PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_B);// PPM OF OIL IN PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_R);// PPM OF OIL OUT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_Y);// PPM OF OIL OUT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_B);// PPM OF OIL OUT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_R);//PPM OF PAPER PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_Y);//PPM OF PAPER PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_B);//PPM OF PAPER PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_R);//SIICA GEL CONDITION PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_Y);//SIICA GEL CONDITION PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_B);//SIICA GEL CONDITION PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_LR_OLGDA_STATUS_R);//OLDGA STATUS PHASE R
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_LR_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//----------------------------ADD R VALUES-------------------------------------------------///


                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_lr_"); // tablename


                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_LR_RADIO_GROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add LR number

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




                sb.append("'R'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_WTI_R)).getText().toString() );  // WTI R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_OTI_R)).getText().toString() );  // OTI R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_OIL_LEVEL_R)).getText().toString() );  // OIL LEVEL in R
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_R)).getText().toString() );  // Trafo Alarm R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_R)).getText().toString() );  // Oil Leakage R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_R)).getText().toString() );  // ODU Status R
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_R)).getText().toString() );  // LA Counter in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_NEU_R)).getText().toString() );  // LA Counter(NEU) in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_R)).getText().toString() );  // Leakage Currrent HV in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_NEU_R)).getText().toString() );  // Leakage current(NEU) in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_R)).getText().toString() );  // PPM in Oil in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_R)).getText().toString() );  // PPM of Oil Out in R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_R)).getText().toString() );  // PPM of Paper in R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_R)).getText().toString() );  // Silica Gel Condition R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_OLGDA_STATUS_R)).getText().toString() );  // OLDGA Status R
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_R)).getText().toString() );  // PPM of Paper in R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_VERIFIED_BY)).getText().toString() );  // PPM of Paper in R
                sb.append("'");
                sb.append(");"); // CLOSE


                // Send R values

                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

                ///-------------ADD Y VALUES----------------------------------------------------------------------///


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_lr_"); // tablename


                rg = (RadioGroup)findViewById(R.id.DM_LR_RADIO_GROUP);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LR number

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





                sb.append("'Y'"); //  Phase Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_WTI_Y)).getText().toString() );  // WTI Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_OTI_Y)).getText().toString() );  // OTI Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_OIL_LEVEL_Y)).getText().toString() );  // OIL LEVEL in Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_Y)).getText().toString() );  // Trafo Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_Y)).getText().toString() );  // Oil Leakage Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_Y)).getText().toString() );  // ODU Status Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_Y)).getText().toString() );  // LA Counter in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_NEU_R)).getText().toString() );  // LA Counter(NEU) in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_Y)).getText().toString() );  // Leakage Currrent HV in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_NEU_R)).getText().toString() );  // Leakage current(NEU) in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_Y)).getText().toString() );  // PPM in Oil in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_Y)).getText().toString() );  // PPM of Oil Out in Y
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_Y)).getText().toString() );  // PPM of Paper in Y
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_Y)).getText().toString() );  // Silica Gel Condition Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_OLGDA_STATUS_R)).getText().toString() );  // OLDGA Status Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_Y)).getText().toString() );  // PPM of Paper in y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_VERIFIED_BY)).getText().toString() );  // PPM of Paper in Y
                sb.append("'");


                sb.append(");"); // CLOSE
                // Send Y values

                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);


                ///--------------ADD B VALUES--------------------------------------------------------------------------------///


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_lr_"); // tablename


                rg = (RadioGroup)findViewById(R.id.DM_LR_RADIO_GROUP);  // value from radiogroup
                rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                radioText = (String) rb.getText();
                sb.append(radioText); // add LR number

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





                sb.append("'B'"); //  Phase B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_WTI_B)).getText().toString() );  // WTI B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_OTI_B)).getText().toString() );  // OTI B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_OIL_LEVEL_B)).getText().toString() );  // OIL LEVEL in B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_TRAFO_ALRM_B)).getText().toString() );  // Trafo Alarm B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_LR_OIL_LEAKAGE_B)).getText().toString() );  // Oil Leakage B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_ODU_STATUS_B)).getText().toString() );  // ODU Status B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_B)).getText().toString() );  // LA Counter in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LA_COUNTER_NEU_R)).getText().toString() );  // LA Counter(NEU) in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_HV_B)).getText().toString() );  // Leakage Currrent HV in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_LEAKAGE_CURRENT_NEU_R)).getText().toString() );  // Leakage current(NEU) in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_IN_B)).getText().toString() );  // PPM in Oil in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OIL_OUT_B)).getText().toString() );  // PPM of Oil Out in B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_LR_PPM_OF_PAPER_B)).getText().toString() );  // PPM of Paper in B
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_SILICA_GEL_CONDITION_B)).getText().toString() );  // Silica Gel Condition B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_LR_OLGDA_STATUS_R)).getText().toString() );  // OLDGA Status B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_REMARKS_IF_ANY_B)).getText().toString() );  // PPM of Paper in B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_LR_VERIFIED_BY)).getText().toString() );  // PPM of Paper in B
                sb.append("'");
                sb.append(");"); // CLOSE


                // Send B values

                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
