package bits.emd.adani.SwitchYard.dm_transformer_yard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_transformer_yard_gt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_transformer_yard_gt);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_400_KV_GT_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_400KV_GT_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_400KV_GT_CONFIRM);


        final LinearLayout linearLayout_gt_123 = (LinearLayout)findViewById(R.id.DM_400_KV_GT_OLDGA_STATUS_LAYOUT_1_2_3);
        final LinearLayout linearLayout_gt_45 = (LinearLayout)findViewById(R.id.DM_400_KV_GT_OLDGA_STATUS_LAYOUT_4_5);

        final RadioButton radioButton_1 = (RadioButton)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOBUTTON1) ;
        final RadioButton radioButton_2 = (RadioButton)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOBUTTON2) ;
        final RadioButton radioButton_3 = (RadioButton)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOBUTTON3) ;
        final RadioButton radioButton_4 = (RadioButton)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOBUTTON4) ;
        final RadioButton radioButton_5 = (RadioButton)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOBUTTON5) ;

        radioButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_gt_123.setVisibility(v.VISIBLE);
                linearLayout_gt_45.setVisibility(v.GONE);
            }
        });

        radioButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_gt_123.setVisibility(v.VISIBLE);
                linearLayout_gt_45.setVisibility(v.GONE);
            }
        });

        radioButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_gt_123.setVisibility(v.VISIBLE);
                linearLayout_gt_45.setVisibility(v.GONE);
            }
        });

        radioButton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_gt_123.setVisibility(v.GONE);
                linearLayout_gt_45.setVisibility(v.VISIBLE);
            }
        });

        radioButton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_gt_123.setVisibility(v.GONE);
                linearLayout_gt_45.setVisibility(v.VISIBLE);
            }
        });
        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_R);// HV WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_Y);// HV WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_B);// HV WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_R);// LV WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_Y);// LV WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_B);// LV WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_R);//OTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_Y);//OTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_B);//OTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_R);//OIL LEVEL IN MAIN TANK PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_Y);//OIL LEVEL IN MAIN TANK PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_B);//OIL LEVEL IN MAIN TANK PHASE B
                ed.setEnabled(false);

                ToggleButton tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_R);//FAN STATUS PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_Y);//FAN STATUS PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_B);//FAN STATUS PHASE B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_R);//PUMP STATUS PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_Y);//PUMP STATUS PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_B);//PUMP STATUS PHASE B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER1);// HV LA COUNTER PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER2);// HV LA COUNTER PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER3);// HV LA COUNTER PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER1);// LV LA COUNTER PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER2);// LV LA COUNTER PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER3);// LV LA COUNTER PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_R);// HV LA LEAKAGE CURRENT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_Y);// HV LA LEAKAGE CURRENT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_B);// HV LA LEAKAGE CURRENT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_R);// LV LA LEAKAGE CURRENT PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_Y);// LV LA LEAKAGE CURRENT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_B);// LV LA LEAKAGE CURRENT PHASE B
                ed.setEnabled(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_R);//SILICA GEL CONDITION PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_Y);//SILICA GEL CONDITION PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_B);//SILICA GEL CONDITION PHASE B
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OLGDA);//OLGDA STATUS
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_R);//OLGDA STATUS PHASE R
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_Y);//OLGDA STATUS PHASE Y
                tb.setClickable(false);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_B);//OLGDA STATUS PHASE B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_R);// REMARKS IF ANY FOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_Y);// REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_B);// REMARKS IF ANY FOR PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_VERIFIED_BY);// VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.TRANSFORMER_YARD_GT_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_R);// HV WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_Y);// HV WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_B);// HV WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_R);// LV WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_Y);// LV WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_B);// LV WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_R);//OTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_Y);//OTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OTI_B);//OTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_R);//OIL LEVEL IN MAIN TANK PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_Y);//OIL LEVEL IN MAIN TANK PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_B);//OIL LEVEL IN MAIN TANK PHASE B
                ed.setEnabled(true);

                ToggleButton tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_R);//FAN STATUS PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_Y);//FAN STATUS PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_B);//FAN STATUS PHASE B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_R);//PUMP STATUS PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_Y);//PUMP STATUS PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_B);//PUMP STATUS PHASE B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER1);// HV LA COUNTER PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER2);// HV LA COUNTER PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER3);// HV LA COUNTER PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER1);// LV LA COUNTER PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER2);// LV LA COUNTER PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER3);// LV LA COUNTER PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_R);// HV LA LEAKAGE CURRENT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_Y);// HV LA LEAKAGE CURRENT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_B);// HV LA LEAKAGE CURRENT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_R);// LV LA LEAKAGE CURRENT PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_Y);// LV LA LEAKAGE CURRENT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_B);// LV LA LEAKAGE CURRENT PHASE B
                ed.setEnabled(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_R);//SILICA GEL CONDITION PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_Y);//SILICA GEL CONDITION PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_B);//SILICA GEL CONDITION PHASE B
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OLGDA);//OLGDA STATUS
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_R);//OLGDA STATUS PHASE R
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_Y);//OLGDA STATUS PHASE Y
                tb.setClickable(true);

                tb =(ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_B);//OLGDA STATUS PHASE B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_R);// REMARKS IF ANY FOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_Y);// REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_B);// REMARKS IF ANY FOR PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.TRANSFORMER_YARD_GT_VERIFIED_BY);// VERIFIED BY
                ed.setEnabled(true);
            }
        });
        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /////----------------------------ADD R VALUES -----------------------------------//////////
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_gt_"); // tablename

                RadioGroup rg = (RadioGroup) findViewById(R.id.TRANSFORMER_YARD_GT_RADIOGROUP);  // value from radiogroup
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

                sb.append("'R'");
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_R)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_R)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OTI_R)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_R)).getText().toString());  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_R)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_R)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_R)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_R)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_R)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_R)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_R)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");

                if(radioText == "1" || radioText == "2" || radioText == "3") {
                    sb.append(((ToggleButton) findViewById(R.id.TRANSFORMER_YARD_GT_OLGDA)).getText().toString());  //Persisting Alarm Y
                }
                else{
                    sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_R)).getText().toString() );  //Persisting Alarm Y

                }

                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_R)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                String query = sb.toString();
                ConnectionClass object = new ConnectionClass();
                object.execute(query);




/////----------------------------ADD Y VALUES -----------------------------------//////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_gt_"); // tablename

                rg = (RadioGroup) findViewById(R.id.TRANSFORMER_YARD_GT_RADIOGROUP);  // value from radiogroup
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

                sb.append("'Y'");
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_Y)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_Y)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OTI_Y)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_Y)).getText().toString());  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_Y)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_Y)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_Y)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                if(radioText == "1" || radioText == "2" || radioText == "3") {
                    sb.append(((ToggleButton) findViewById(R.id.TRANSFORMER_YARD_GT_OLGDA)).getText().toString());  //Persisting Alarm Y
                }
                else{
                    sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_Y)).getText().toString() );  //Persisting Alarm Y

                }
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_Y)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                query = sb.toString();
                object = new ConnectionClass();
                object.execute(query);




/////----------------------------ADD B VALUES -----------------------------------//////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_gt_"); // tablename

                rg = (RadioGroup) findViewById(R.id.TRANSFORMER_YARD_GT_RADIOGROUP);  // value from radiogroup
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

                sb.append("'B'");
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_WTI_B)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_WTI_B)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values


                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OTI_B)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEVEL_B)).getText().toString());  //LA Counter Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_ALARM_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_OIL_LEAKAGE_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_FANSTATUS_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_PUMPSTATUS_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values




                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LACOUNTER1)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_HV_LEAKAGECURRENT_B)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values

                sb.append(((EditText) findViewById(R.id.TRANSFORMER_YARD_GT_LV_LEAKAGECURRENT_B)).getText().toString());  //LA Counter Y
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_SILICAGEL_B)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                if(radioText == "1" || radioText == "2" || radioText == "3") {
                    sb.append(((ToggleButton) findViewById(R.id.TRANSFORMER_YARD_GT_OLGDA)).getText().toString());  //Persisting Alarm Y
                }
                else{
                    sb.append(((ToggleButton)findViewById(R.id.TRANSFORMER_YARD_GT_4_5_OLGDA_B)).getText().toString() );  //Persisting Alarm Y

                }
                sb.append("'");
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_REMARKS_IF_ANY_B)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.TRANSFORMER_YARD_GT_VERIFIED_BY)).getText().toString() );  //Verified By
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

