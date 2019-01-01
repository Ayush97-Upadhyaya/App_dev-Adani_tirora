package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_measurement_dia4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_measurement_dia4);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_R);//GT2 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_Y);//GT2 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_B);//GT2 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_R);//GT2 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_Y);//GT2 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_B);//GT2 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_R);//GT2 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_Y);//GT2 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_B);//GT2 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_R);//GT2 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_Y);//GT2 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_B);//GT2 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_R);//GT-2 O/C, E/F CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_Y);//GT-2 O/C, E/F CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_B);//GT-2 O/C, E/F CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_R);//GT-2 O/C, E/F VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_Y);//GT-2 O/C, E/F VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_B);//GT-2 O/C, E/F VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_R);//ST-4 DIFF HV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_Y);//ST-4 DIFF HV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_B);//ST-4 DIFF HV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_R);//ST-4 DIFF HV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_Y);//ST-4 DIFF HV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_B);//ST-4 DIFF HV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_R);//ST-4 DIFF LV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_Y);//ST-4 DIFF LV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_B);//ST-4 DIFF LV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_R);//ST-4 DIFF LV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_Y);//ST-4 DIFF LV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_B);//ST-4 DIFF LV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_R);//ST-4 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_Y);//ST-4 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_B);//ST-4 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_R);//ST-4 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_Y);//ST-4 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_B);//ST-4 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_R);//ST-4 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_Y);//ST-4 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_B);//ST-4 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_R);//ST-4 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_Y);//ST-4 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_B);//ST-4 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_R);//ST-4 50/51 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_Y);//ST-4 50/51 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_B);//ST-4 50/51 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_R);//ST-4 50/51 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_Y);//ST-4 50/51 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_B);//ST-4 50/51 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_R);//ST-4 64 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_Y);//ST-4 64 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_B);//ST-4 64 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_R);//ST-4 64 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_Y);//ST-4 64 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_B);//ST-4 64 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_R);//GT2 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_Y);//GT2 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_B);//GT2 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_R);//GT2 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_Y);//GT2 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_B);//GT2 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_R);//GT2 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_Y);//GT2 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_B);//GT2 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_R);//GT2 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_Y);//GT2 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_B);//GT2 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_R);//GT-2 O/C, E/F CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_Y);//GT-2 O/C, E/F CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_B);//GT-2 O/C, E/F CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_R);//GT-2 O/C, E/F VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_Y);//GT-2 O/C, E/F VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_B);//GT-2 O/C, E/F VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_R);//ST-4 DIFF HV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_Y);//ST-4 DIFF HV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_B);//ST-4 DIFF HV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_R);//ST-4 DIFF HV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_Y);//ST-4 DIFF HV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_B);//ST-4 DIFF HV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_R);//ST-4 DIFF LV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_Y);//ST-4 DIFF LV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_B);//ST-4 DIFF LV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_R);//ST-4 DIFF LV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_Y);//ST-4 DIFF LV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_B);//ST-4 DIFF LV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_R);//ST-4 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_Y);//ST-4 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_B);//ST-4 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_R);//ST-4 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_Y);//ST-4 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_B);//ST-4 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_R);//ST-4 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_Y);//ST-4 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_B);//ST-4 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_R);//ST-4 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_Y);//ST-4 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_B);//ST-4 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_R);//ST-4 50/51 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_Y);//ST-4 50/51 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_B);//ST-4 50/51 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_R);//ST-4 50/51 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_Y);//ST-4 50/51 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_B);//ST-4 50/51 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_R);//ST-4 64 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_Y);//ST-4 64 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_B);//ST-4 64 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_R);//ST-4 64 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_Y);//ST-4 64 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_B);//ST-4 64 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia4"); // tablename


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
///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);


///////////////////////////-----------------------------ADD Y VALUES----------------------------////////////////

                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia4"); // tablename


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
///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

///////////////////////////-----------------------------ADD Y VALUES----------------------------////////////////

                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia4"); // tablename


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
///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating valuesB
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_GT2_OC_EF_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_TIE_BCU_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_DIFF_LV_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_50_51_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_ST4_64_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA4_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
