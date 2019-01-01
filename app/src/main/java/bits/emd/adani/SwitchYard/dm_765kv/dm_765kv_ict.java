package bits.emd.adani.SwitchYard.dm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_765kv_ict extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_765kv_ict);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_765_KV_ICT_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_765KV_ICT_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_765KV_ICT_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_R);//HV WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_Y);//HV WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_B);//HV WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_S);//HV WTI SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_R);//IV WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_Y);//IV WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_B);//IV WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_S);//IV WTI SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_R);//LV WTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_Y);//LV WTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_B);//LV WTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_S);//LV WTI SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_R);//OTI PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_Y);//OTI PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_B);//OTI PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_S);//OTI SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_R);//OIL LEVEL IN MAIN TANK PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_Y);//OIL LEVEL IN MAIN TANK PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_B);//OIL LEVEL IN MAIN TANK PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_S);//OIL LEVEL IN MAIN TANK SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_R);//OIL LEVEL/OLTC PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_Y);//OIL LEVEL/OLTC PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_B);//OIL LEVEL/OLTC PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_S);//OIL LEVEL/OLTC SPARE
                ed.setEnabled(false);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_S);//PERSISTING TRAFO ALARMS SPARE
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_R);//FAN STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_Y);//FAN STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_B);//FAN STATUS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_S);//FAN STATUS SPARE
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_S);//OIL LEAKAGE SPARE
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_R);//ODU STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_Y);//ODU STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_B);//ODU STATUS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_S);//ODU STATUS SPARE
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_R);//PUMP STATUS PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_Y);//PUMP STATUS PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_B);//PUMP STATUS PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_S);//PUMP STATUS SPARE
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_R);//RTCC PANEL PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_Y);//RTCC PANEL PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_B);//RTCC PANEL PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_S);//RTCC PANEL SPARE
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_R);//LA COUNTER HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_Y);//LA COUNTER HV PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_B);//LA COUNTER HV PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_S);//LA COUNTER HV SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_R);//LA COUNTER LV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_Y);//LA COUNTER LV PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_B);//LA COUNTER LV PHASE B
                ed.setEnabled(false);


                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_S);//LA COUNTER LV SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_R);//LA LEAKAGE CURRENT HV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_Y);//LA LEAKAGE CURRENT HV PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_B);//LA LEAKAGE CURRENT HV PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_S);//LA LEAKAGE CURRENT HV SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_R);//LA LEAKAGE CURRENT LV PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_Y);//LA LEAKAGE CURRENT LV PHASE Y
                ed.setEnabled(false);


                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_B);//LA LEAKAGE CURRENT LV PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_S);//LA LEAKAGE CURRENT LV SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_R);//PPM OF OIL IN PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_Y);//PPM OF OIL IN PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_B);//PPM OF OIL IN PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_S);//PPM OF OIL IN SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_R);//PPM OF OIL OUT PHASE R
                ed.setEnabled(false);


                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_Y);//PPM OF OIL OUT PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_B);//PPM OF OIL OUT PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_S);//PPM OF OIL OUT SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_R);//PPM OF PAPER PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_Y);//PPM OF PAPER PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_B);//PPM OF PAPER PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_S);//PPM OF PAPER SPARE
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_R);//SILICA GEL CONDITION PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_Y);//SILICA GEL CONDITION PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_B);//SILICA GEL CONDITION PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_S);//SILICA GEL CONDITION SPARE
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_S);//REMARKS IF ANY FOR SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_ICT_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);


                EditText ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_R);//HV WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_Y);//HV WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_B);//HV WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_HV_WTI_S);//HV WTI SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_R);//IV WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_Y);//IV WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_B);//IV WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_IV_WTI_S);//IV WTI SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_R);//LV WTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_Y);//LV WTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_B);//LV WTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LV_WTI_S);//LV WTI SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_R);//OTI PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_Y);//OTI PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_B);//OTI PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OTI_S);//OTI SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_R);//OIL LEVEL IN MAIN TANK PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_Y);//OIL LEVEL IN MAIN TANK PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_B);//OIL LEVEL IN MAIN TANK PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_S);//OIL LEVEL IN MAIN TANK SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_R);//OIL LEVEL/OLTC PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_Y);//OIL LEVEL/OLTC PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_B);//OIL LEVEL/OLTC PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_S);//OIL LEVEL/OLTC SPARE
                ed.setEnabled(true);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_R);//PERSISTING TRAFO ALARMS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_Y);//PERSISTING TRAFO ALARMS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_B);//PERSISTING TRAFO ALARMS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_S);//PERSISTING TRAFO ALARMS SPARE
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_R);//FAN STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_Y);//FAN STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_B);//FAN STATUS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_S);//FAN STATUS SPARE
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_R);//OIL LEAKAGE PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_Y);//OIL LEAKAGE PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_B);//OIL LEAKAGE PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_S);//OIL LEAKAGE SPARE
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_R);//ODU STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_Y);//ODU STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_B);//ODU STATUS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_S);//ODU STATUS SPARE
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_R);//PUMP STATUS PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_Y);//PUMP STATUS PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_B);//PUMP STATUS PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_S);//PUMP STATUS SPARE
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_R);//RTCC PANEL PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_Y);//RTCC PANEL PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_B);//RTCC PANEL PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_RTCC_S);//RTCC PANEL SPARE
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_R);//LA COUNTER HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_Y);//LA COUNTER HV PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_B);//LA COUNTER HV PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_S);//LA COUNTER HV SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_R);//LA COUNTER LV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_Y);//LA COUNTER LV PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_B);//LA COUNTER LV PHASE B
                ed.setEnabled(true);


                ed =(EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_S);//LA COUNTER LV SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_R);//LA LEAKAGE CURRENT HV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_Y);//LA LEAKAGE CURRENT HV PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_B);//LA LEAKAGE CURRENT HV PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_S);//LA LEAKAGE CURRENT HV SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_R);//LA LEAKAGE CURRENT LV PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_Y);//LA LEAKAGE CURRENT LV PHASE Y
                ed.setEnabled(true);


                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_B);//LA LEAKAGE CURRENT LV PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_S);//LA LEAKAGE CURRENT LV SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_R);//PPM OF OIL IN PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_Y);//PPM OF OIL IN PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_B);//PPM OF OIL IN PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_S);//PPM OF OIL IN SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_R);//PPM OF OIL OUT PHASE R
                ed.setEnabled(true);


                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_Y);//PPM OF OIL OUT PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_B);//PPM OF OIL OUT PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_S);//PPM OF OIL OUT SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_R);//PPM OF PAPER PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_Y);//PPM OF PAPER PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_B);//PPM OF PAPER PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_PPM_PAPER_S);//PPM OF PAPER SPARE
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_R);//SILICA GEL CONDITION PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_Y);//SILICA GEL CONDITION PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_B);//SILICA GEL CONDITION PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_S);//SILICA GEL CONDITION SPARE
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_S);//REMARKS IF ANY FOR SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_ICT_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //-----------ADD R Values-------------------------------///
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_ict"); // tablename

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

                sb.append(((EditText)findViewById(R.id.DM_ICT_HV_WTI_R)).getText().toString() );  //HV WTI Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_IV_WTI_R)).getText().toString() );  //IV WTI Leakage R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_LV_WTI_R)).getText().toString() );  //LV WTI R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_OTI_R)).getText().toString() );  //OTI R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_R)).getText().toString() );  //Oil Level Main Tank in R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_R)).getText().toString() );  //Oil Level OLTC in R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_R)).getText().toString() );  //Misc Trafo Alarm R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_R)).getText().toString() );  //Fan Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_R)).getText().toString() );  //Oil Leakage R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_R)).getText().toString() );  //ODU Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_R)).getText().toString() );  //Pump Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_RTCC_R)).getText().toString() );  //RTCC Panel R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_R)).getText().toString() );  //LA Counter HV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_R)).getText().toString() );  //LA Counter LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_R)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_R)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_R)).getText().toString() );  //PPM Oil In R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_R)).getText().toString() );  //PPM Oil Out R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_PAPER_R)).getText().toString() );  // PPM Paper  R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_R)).getText().toString() );  //Silica Gel
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_R)).getText().toString() );  //Remarks
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");



                sb.append(");"); // Close

                // Send R values

                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);



                //------------------------------ADD Y Values--------------------------------------------///

                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_ict"); // tablename

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

                sb.append("'Y'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_HV_WTI_Y)).getText().toString() );  //HV WTI Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_IV_WTI_Y)).getText().toString() );  //IV WTI Leakage R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_LV_WTI_Y)).getText().toString() );  //LV WTI R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_OTI_Y)).getText().toString() );  //OTI R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_Y)).getText().toString() );  //Oil Level Main Tank in R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_Y)).getText().toString() );  //Oil Level OLTC in R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_Y)).getText().toString() );  //Misc Trafo Alarm R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_Y)).getText().toString() );  //Fan Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_Y)).getText().toString() );  //Oil Leakage R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_Y)).getText().toString() );  //ODU Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_Y)).getText().toString() );  //Pump Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_RTCC_Y)).getText().toString() );  //RTCC Panel R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_Y)).getText().toString() );  //LA Counter HV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_Y)).getText().toString() );  //LA Counter LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_Y)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_Y)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_Y)).getText().toString() );  //PPM Oil In R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_Y)).getText().toString() );  //PPM Oil Out R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_PAPER_Y)).getText().toString() );  // PPM Paper  R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_Y)).getText().toString() );  //Silica Gel
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_Y)).getText().toString() );  //Remarks
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");



                sb.append(");"); // Close

                // Send R values

                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);


                //-------------------------------ADD B Values------------------------------------------------///

                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_ict"); // tablename

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

                sb.append("'B'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_HV_WTI_B)).getText().toString() );  //HV WTI Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_IV_WTI_B)).getText().toString() );  //IV WTI Leakage R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_LV_WTI_B)).getText().toString() );  //LV WTI R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_OTI_B)).getText().toString() );  //OTI R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_B)).getText().toString() );  //Oil Level Main Tank in R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_B)).getText().toString() );  //Oil Level OLTC in R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_B)).getText().toString() );  //Misc Trafo Alarm R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_B)).getText().toString() );  //Fan Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_B)).getText().toString() );  //Oil Leakage R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_B)).getText().toString() );  //ODU Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_B)).getText().toString() );  //Pump Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_RTCC_B)).getText().toString() );  //RTCC Panel R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_B)).getText().toString() );  //LA Counter HV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_B)).getText().toString() );  //LA Counter LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_B)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_B)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_B)).getText().toString() );  //PPM Oil In R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_B)).getText().toString() );  //PPM Oil Out R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_PAPER_B)).getText().toString() );  // PPM Paper  R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_B)).getText().toString() );  //Silica Gel
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_B)).getText().toString() );  //Remarks
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");




                sb.append(");"); // Close

                // Send R values

                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);


                //-------------------------------------ADD SPARE Values-------------------------------///

                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_765kv_ict"); // tablename

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

                sb.append("'SPARE'"); //  Phase R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_HV_WTI_S)).getText().toString() );  //HV WTI Counter R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_IV_WTI_S)).getText().toString() );  //IV WTI Leakage R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_LV_WTI_S)).getText().toString() );  //LV WTI R
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_ICT_OTI_S)).getText().toString() );  //OTI R
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_MT_S)).getText().toString() );  //Oil Level Main Tank in R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_OIL_LEVEL_OLTC_S)).getText().toString() );  //Oil Level OLTC in R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_TRAFO_ALARM_S)).getText().toString() );  //Misc Trafo Alarm R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_FANSTATUS_S)).getText().toString() );  //Fan Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_OIL_LEAKAGE_S)).getText().toString() );  //Oil Leakage R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_ODU_STATUS_S)).getText().toString() );  //ODU Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_PUMP_STATUS_S)).getText().toString() );  //Pump Status R
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_RTCC_S)).getText().toString() );  //RTCC Panel R
                sb.append("'");
                sb.append(","); // segregating values





                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_HV_S)).getText().toString() );  //LA Counter HV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LACOUNTER_LV_S)).getText().toString() );  //LA Counter LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_HV_S)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_LA_LEAKAGE_CURRENT_LV_S)).getText().toString() );  //LA Leakge Current LV R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_IN_S )).getText().toString() );  //PPM Oil In R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_OIL_OUT_S )).getText().toString() );  //PPM Oil Out R
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_ICT_PPM_PAPER_S )).getText().toString() );  // PPM Paper  R
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_ICT_SILICA_GEL_S )).getText().toString() );  //Silica Gel
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_REMARKS_IF_ANY_S)).getText().toString() );  //Remarks
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_ICT_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");




                sb.append(");"); // Close

                // Send R values

                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
