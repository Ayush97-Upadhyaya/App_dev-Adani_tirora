package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_measurement_dia6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_measurement_dia6);


        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_R);//ST-3 DIFF HV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_Y);//ST-3 DIFF HV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_B);//ST-3 DIFF HV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_R);//ST-3 DIFF HV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST4_DIFF_HV_VOLT_Y);//ST-3 DIFF HV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_B);//ST-3 DIFF HV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_R);//ST-3 DIFF LV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_Y);//ST-3 DIFF LV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_B);//ST-3 DIFF LV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_R);//ST-3 DIFF LV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_Y);//ST-3 DIFF LV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_B);//ST-3 DIFF LV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_R);//ST-3 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_Y);//ST-3 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_B);//ST-3 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_R);//ST-3 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_Y);//ST-3 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_B);//ST-3 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_R);//ST-3 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_Y);//ST-3 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_B);//ST-3 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_R);//ST-3 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_Y);//ST-3 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_B);//ST-3 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_R);//ST-3 50/51 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_Y);//ST-3 50/51 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_B);//ST-3 50/51 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_R);//ST-3 50/51 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_Y);//ST-3 50/51 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_B);//ST-3 50/51 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_R);//ST-3 64 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_Y);//ST-3 64 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_B);//ST-3 64 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_R);//ST-3 64 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_Y);//ST-3 64 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_B);//ST-3 64 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_R);//ST-5 DIFF HV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_Y);//ST-5 DIFF HV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_B);//ST-5 DIFF HV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_R);//ST-5 DIFF HV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_Y);//ST-5 DIFF HV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_B);//ST-5 DIFF HV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_R);//ST-5 DIFF LV CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_Y);//ST-5 DIFF LV CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_B);//ST-5 DIFF LV CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_R);//ST-5 DIFF LV VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_Y);//ST-5 DIFF LV VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_B);//ST-5 DIFF LV VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_R);//ST-5 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_Y);//ST-5 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_B);//ST-5 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_R);//ST-5 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_Y);//ST-5 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_B);//ST-5 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_R);//ST-5 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_Y);//ST-5 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_B);//ST-5 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_R);//ST-5 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_Y);//ST-5 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_B);//ST-5 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_R);//ST-5 50/51 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_Y);//ST-5 50/51 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_B);//ST-5 50/51 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_R);//ST-5 50/51 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_Y);//ST-5 50/51 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_B);//ST-5 50/51 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_R);//ST-5 64 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_Y);//ST-5 64 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_B);//ST-5 64 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_R);//ST-5 64 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_Y);//ST-5 64 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_B);//ST-5 64 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_R);//ST-3 DIFF HV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_Y);//ST-3 DIFF HV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_B);//ST-3 DIFF HV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_R);//ST-3 DIFF HV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST4_DIFF_HV_VOLT_Y);//ST-3 DIFF HV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_B);//ST-3 DIFF HV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_R);//ST-3 DIFF LV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_Y);//ST-3 DIFF LV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_B);//ST-3 DIFF LV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_R);//ST-3 DIFF LV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_Y);//ST-3 DIFF LV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_B);//ST-3 DIFF LV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_R);//ST-3 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_Y);//ST-3 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_B);//ST-3 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_R);//ST-3 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_Y);//ST-3 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_B);//ST-3 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_R);//ST-3 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_Y);//ST-3 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_B);//ST-3 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_R);//ST-3 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_Y);//ST-3 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_B);//ST-3 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_R);//ST-3 50/51 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_Y);//ST-3 50/51 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_B);//ST-3 50/51 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_R);//ST-3 50/51 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_Y);//ST-3 50/51 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_B);//ST-3 50/51 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_R);//ST-3 64 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_Y);//ST-3 64 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_B);//ST-3 64 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_R);//ST-3 64 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_Y);//ST-3 64 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_B);//ST-3 64 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_R);//ST-5 DIFF HV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_Y);//ST-5 DIFF HV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_B);//ST-5 DIFF HV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_R);//ST-5 DIFF HV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_Y);//ST-5 DIFF HV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_B);//ST-5 DIFF HV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_R);//ST-5 DIFF LV CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_Y);//ST-5 DIFF LV CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_B);//ST-5 DIFF LV CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_R);//ST-5 DIFF LV VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_Y);//ST-5 DIFF LV VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_B);//ST-5 DIFF LV VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_R);//ST-5 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_Y);//ST-5 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_B);//ST-5 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_R);//ST-5 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_Y);//ST-5 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_B);//ST-5 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_R);//ST-5 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_Y);//ST-5 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_B);//ST-5 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_R);//ST-5 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_Y);//ST-5 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_B);//ST-5 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_R);//ST-5 50/51 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_Y);//ST-5 50/51 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_B);//ST-5 50/51 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_R);//ST-5 50/51 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_Y);//ST-5 50/51 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_B);//ST-5 50/51 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_R);//ST-5 64 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_Y);//ST-5 64 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_B);//ST-5 64 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_R);//ST-5 64 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_Y);//ST-5 64 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_B);//ST-5 64 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);


            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia6"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);



/////////////////------------------------ADD Y VALUES-------------------////////////////////






                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia6"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST4_DIFF_HV_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

/////////////////------------------------ADD B VALUES-------------------////////////////////


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia6"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_HV_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_DIFF_LV_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_50_51_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST3_64_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_TIE_BCU_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_HV_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_DIFF_LV_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_50_51_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_ST5_64_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values




                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA6_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
