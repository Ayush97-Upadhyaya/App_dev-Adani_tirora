package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_ct_cvt_measurement_dia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_measurement_dia1);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_CONFIRM);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_R);//ICT 67_67N CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_Y);//ICT 67_67N CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_B);//ICT 67_67N CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_R);//ICT 67_67N VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_Y);//ICT 67_67N VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_B);//ICT 67_67N VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_R);//ICT BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_Y);//ICT BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_B);//ICT BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_R);//ICT BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_Y);//ICT BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_B);//ICT BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_R);//ICT BUS 1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_Y);//ICT BUS 1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_B);//ICT BUS 1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_R);//ICT BUS 1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_Y);//ICT BUS 1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_B);//ICT BUS 1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_R);//ICT BUS 2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_Y);//ICT BUS 2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_B);//ICT BUS 2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_R);//ICT BUS 2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_Y);//ICT BUS 2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_B);//ICT BUS 2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_R);//ST-1 DIFF HV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_Y);//ST-1 DIFF HV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_B);//ST-1 DIFF HV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_R);//ST-1 DIFF HV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_Y);//ST-1 DIFF HV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_B);//ST-1 DIFF HV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_R);//ST-1 DIFF LV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_Y);//ST-1 DIFF LV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_B);//ST-1 DIFF LV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_R);//ST-1 DIFF LV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_Y);//ST-1 DIFF LV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_B);//ST-1 DIFF LV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_R);//ICT REF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_Y);//ICT REF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_B);//ICT REF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_R);//ICT REF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_Y);//ICT REF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_B);//ICT REF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_R);//GT4 67_67N CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_Y);//GT4 67_67N CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_B);//GT4 67_67N CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_R);//GT4 67_67N VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_Y);//GT4 67_67N VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_B);//GT4 67_67N VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_R);//GT-4 BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_Y);//GT-4 BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_B);//GT-4 BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_R);//GT-4 BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_Y);//GT-4 BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_B);//GT-4 BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_R);//GT-4 BUS 1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_Y);//GT-4 BUS 1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_B);//GT-4 BUS 1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_R);//GT-4 BUS 1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_Y);//GT-4 BUS 1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_B);//GT-4 BUS 1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_R);//GT-4 BUS 2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_Y);//GT-4 BUS 2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_B);//GT-4 BUS 2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_R);//GT-4 BUS 2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_Y);//GT-4 BUS 2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_B);//GT-4 BUS 2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_REMARKS_IF_ANY_R);//REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_R);//ICT 67_67N CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_Y);//ICT 67_67N CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_CURR_B);//ICT 67_67N CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_R);//ICT 67_67N VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_Y);//ICT 67_67N VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_67_67N_VOLT_B);//ICT 67_67N VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_R);//ICT BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_Y);//ICT BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_CURR_B);//ICT BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_R);//ICT BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_Y);//ICT BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BCU_VOLT_B);//ICT BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_R);//ICT BUS 1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_Y);//ICT BUS 1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_CURR_B);//ICT BUS 1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_R);//ICT BUS 1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_Y);//ICT BUS 1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_1_VOLT_B);//ICT BUS 1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_R);//ICT BUS 2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_Y);//ICT BUS 2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_CURR_B);//ICT BUS 2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_R);//ICT BUS 2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_Y);//ICT BUS 2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_BUS_2_VOLT_B);//ICT BUS 2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_R);//ST-1 DIFF HV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_Y);//ST-1 DIFF HV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_CURR_B);//ST-1 DIFF HV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_R);//ST-1 DIFF HV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_Y);//ST-1 DIFF HV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_HV_VOLT_B);//ST-1 DIFF HV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_R);//ST-1 DIFF LV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_Y);//ST-1 DIFF LV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_CURR_B);//ST-1 DIFF LV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_R);//ST-1 DIFF LV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_Y);//ST-1 DIFF LV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ST1_DIFF_LV_VOLT_B);//ST-1 DIFF LV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_R);//ICT REF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_Y);//ICT REF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_CURR_B);//ICT REF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_R);//ICT REF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_Y);//ICT REF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_ICT_REF_VOLT_B);//ICT REF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_R);//GT4 67_67N CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_Y);//GT4 67_67N CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_CURR_B);//GT4 67_67N CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_R);//GT4 67_67N VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_Y);//GT4 67_67N VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_67_67N_VOLT_B);//GT4 67_67N VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_R);//GT-4 BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_Y);//GT-4 BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_CURR_B);//GT-4 BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_R);//GT-4 BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_Y);//GT-4 BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BCU_VOLT_B);//GT-4 BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_R);//GT-4 BUS 1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_Y);//GT-4 BUS 1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_CURR_B);//GT-4 BUS 1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_R);//GT-4 BUS 1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_Y);//GT-4 BUS 1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS1_VOLT_B);//GT-4 BUS 1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_R);//GT-4 BUS 2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_Y);//GT-4 BUS 2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_CURR_B);//GT-4 BUS 2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_R);//GT-4 BUS 2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_Y);//GT-4 BUS 2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_GT4_BUS2_VOLT_B);//GT-4 BUS 2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_REMARKS_IF_ANY_R);//REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
