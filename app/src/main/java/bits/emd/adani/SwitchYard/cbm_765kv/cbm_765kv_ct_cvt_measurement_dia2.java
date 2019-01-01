package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_ct_cvt_measurement_dia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_measurement_dia2);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_CONFIRM);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_R);//LINE 2 M1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_Y);//LINE 2 M1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_B);//LINE 2 M1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_R);//LINE 2 M1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_Y);//LINE 2 M1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_B);//LINE 2 M1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_R);//LINE 2 M2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_Y);//LINE 2 M2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_B);//LINE 2 M2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_R);//LINE 2 M2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_Y);//LINE 2 M2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_B);//LINE 2 M2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_R);//LINE 2 BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_Y);//LINE 2 BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_B);//LINE 2 BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_R);//LINE 2 BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_Y);//LINE 2 BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_B);//LINE 2 BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_R);//LINE 2 BUS 1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_Y);//LINE 2 BUS 1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_B);//LINE 2 BUS 1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_R);//LINE 2 BUS 1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_Y);//LINE 2 BUS 1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_B);//LINE 2 BUS 1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_R);//LINE 2 BUS 2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_Y);//LINE 2 BUS 2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_B);//LINE 2 BUS 2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_R);//LINE 2 BUS 2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_Y);//LINE 2 BUS 2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_B);//LINE 2 BUS 2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_R);//LR 2 21 LR CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_Y);//LR 2 21 LR CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_B);//LR 2 21 LR CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_R);//LR 2 21 LR VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_Y);//LR 2 21 LR VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_B);//LR 2 21 LR VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_R);//LR 2 DIFF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_Y);//LR 2 DIFF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_B);//LR 2 DIFF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_R);//LR 2 DIFF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_Y);//LR 2 DIFF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_B);//LR 2 DIFF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_R);//LR 2 64 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_Y);//LR 2 64 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_B);//LR 2 64 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_R);//LR 2 64 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_Y);//LR 2 64 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_B);//LR 2 64 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_R);//LR 2 BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_Y);//LR 2 BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_B);//LR 2 BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_R);//LR 2 BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_Y);//LR 2 BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_B);//LR 2 BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_R);//LR 2 BUS 1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_Y);//LR 2 BUS 1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_B);//LR 2 BUS 1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_R);//LR 2 BUS 1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_Y);//LR 2 BUS 1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_B);//LR 2 BUS 1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_R);//LR 2 BUS 2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_Y);//LR 2 BUS 2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_B);//LR 2 BUS 2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_R);//LR 2 BUS 2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_Y);//LR 2 BUS 2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_B);//LR 2 BUS 2 VOLTAGE B
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

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_R);//BR 64 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_Y);//BR 64 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_B);//BR 64 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_R);//BR 64 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_Y);//BR 64 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_B);//BR 64 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_R);//BR BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_Y);//BR BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_B);//BR BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_R);//BR BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_Y);//BR BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_B);//BR BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_R);//BUS 1 VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_Y);//BUS 1 VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_B);//BUS 1 VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_R);//BUS 1 VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_Y);//BUS 1 VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_B);//BUS 1 VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_R);//BUS 2 VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_Y);//BUS 2 VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_B);//BUS 2 VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_R);//BUS 2 VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_Y);//BUS 2 VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_B);//BUS 2 VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_R);//LINE VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_Y);//LINE VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_B);//LINE VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_R);//LINE VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_Y);//LINE VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_B);//LINE VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_R);//BR TEED CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_Y);//BR TEED CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_B);//BR TEED CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_R);//BR TEED VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_Y);//BR TEED VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_B);//BR TEED VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_R);//BR 21 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_Y);//BR 21 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_B);//BR 21 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_R);//BR 21 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_Y);//BR 21 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_B);//BR 21 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_R);//BR DIFF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_Y);//BR DIFF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_B);//BR DIFF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_R);//BR DIFF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_Y);//BR DIFF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_B);//BR DIFF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_R);//LINE 2 M1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_Y);//LINE 2 M1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_CURR_B);//LINE 2 M1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_R);//LINE 2 M1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_Y);//LINE 2 M1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M1_VOLT_B);//LINE 2 M1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_R);//LINE 2 M2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_Y);//LINE 2 M2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_CURR_B);//LINE 2 M2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_R);//LINE 2 M2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_Y);//LINE 2 M2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_M2_VOLT_B);//LINE 2 M2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_R);//LINE 2 BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_Y);//LINE 2 BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_CURR_B);//LINE 2 BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_R);//LINE 2 BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_Y);//LINE 2 BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BCU_VOLT_B);//LINE 2 BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_R);//LINE 2 BUS 1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_Y);//LINE 2 BUS 1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_CURR_B);//LINE 2 BUS 1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_R);//LINE 2 BUS 1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_Y);//LINE 2 BUS 1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS1_VOLT_B);//LINE 2 BUS 1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_R);//LINE 2 BUS 2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_Y);//LINE 2 BUS 2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_CURR_B);//LINE 2 BUS 2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_R);//LINE 2 BUS 2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_Y);//LINE 2 BUS 2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE2_BUS2_VOLT_B);//LINE 2 BUS 2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_R);//LR 2 21 LR CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_Y);//LR 2 21 LR CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_CURR_B);//LR 2 21 LR CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_R);//LR 2 21 LR VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_Y);//LR 2 21 LR VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_21LR_VOLT_B);//LR 2 21 LR VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_R);//LR 2 DIFF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_Y);//LR 2 DIFF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_CURR_B);//LR 2 DIFF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_R);//LR 2 DIFF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_Y);//LR 2 DIFF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_DIFF_VOLT_B);//LR 2 DIFF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_R);//LR 2 64 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_Y);//LR 2 64 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_CURR_B);//LR 2 64 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_R);//LR 2 64 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_Y);//LR 2 64 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_64_VOLT_B);//LR 2 64 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_R);//LR 2 BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_Y);//LR 2 BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_CURR_B);//LR 2 BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_R);//LR 2 BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_Y);//LR 2 BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BCU_VOLT_B);//LR 2 BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_R);//LR 2 BUS 1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_Y);//LR 2 BUS 1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_CURR_B);//LR 2 BUS 1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_R);//LR 2 BUS 1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_Y);//LR 2 BUS 1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS1_VOLT_B);//LR 2 BUS 1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_R);//LR 2 BUS 2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_Y);//LR 2 BUS 2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_CURR_B);//LR 2 BUS 2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_R);//LR 2 BUS 2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_Y);//LR 2 BUS 2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LR2_BUS2_VOLT_B);//LR 2 BUS 2 VOLTAGE B
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

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_R);//BR 64 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_Y);//BR 64 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_CURR_B);//BR 64 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_R);//BR 64 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_Y);//BR 64 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_64_VOLT_B);//BR 64 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_R);//BR BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_Y);//BR BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_CURR_B);//BR BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_R);//BR BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_Y);//BR BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_BCU_VOLT_B);//BR BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_R);//BUS 1 VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_Y);//BUS 1 VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_CURR_B);//BUS 1 VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_R);//BUS 1 VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_Y);//BUS 1 VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS1_VOLT_B);//BUS 1 VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_R);//BUS 2 VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_Y);//BUS 2 VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_CURR_B);//BUS 2 VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_R);//BUS 2 VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_Y);//BUS 2 VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_VT_BUS2_VOLT_B);//BUS 2 VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_R);//LINE VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_Y);//LINE VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_CURR_B);//LINE VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_R);//LINE VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_Y);//LINE VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_LINE_VT_VOLT_B);//LINE VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_R);//BR TEED CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_Y);//BR TEED CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_CURR_B);//BR TEED CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_R);//BR TEED VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_Y);//BR TEED VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_TEED_VOLT_B);//BR TEED VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_R);//BR 21 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_Y);//BR 21 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_CURR_B);//BR 21 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_R);//BR 21 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_Y);//BR 21 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_21_VOLT_B);//BR 21 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_R);//BR DIFF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_Y);//BR DIFF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_CURR_B);//BR DIFF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_R);//BR DIFF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_Y);//BR DIFF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BR_DIFF_VOLT_B);//BR DIFF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA_2_VERIFIED_BY);//VERIFIED BY
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
