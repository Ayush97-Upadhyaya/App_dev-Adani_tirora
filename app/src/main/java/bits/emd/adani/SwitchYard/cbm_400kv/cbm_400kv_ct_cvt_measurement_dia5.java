package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_measurement_dia5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_measurement_dia5);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_confirm_btn);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_R);//BR 1 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_Y);//BR 1 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_B);//BR 1 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_R);//BR 1 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_Y);//BR 1 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_B);//BR 1 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_R);//BR 1 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_Y);//BR 1 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_B);//BR 1 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_R);//BR 1 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_Y);//BR 1 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_B);//BR 1 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_R);//BR 1 DIFF PRI CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_Y);//BR 1 DIFF PRI CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_B);//BR 1 DIFF PRI CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_R);//BR 1 DIFF PRI VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_Y);//BR 1 DIFF PRI VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_B);//BR 1 DIFF PRI VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_R);//BR 1 DIFF SEC CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_Y);//BR 1 DIFF SEC CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_B);//BR 1 DIFF SEC CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_R);//BR 1 DIFF SEC VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_Y);//BR 1 DIFF SEC VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_B);//BR 1 DIFF SEC VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_R);//BR 1 OC EF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_Y);//BR 1 OC EF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_B);//BR 1 OC EF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_R);//BR 1 OC EF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_Y);//BR 1 OC EF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_B);//BR 1 OC EF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_R);//BR 2 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_Y);//BR 2 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_B);//BR 2 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_R);//BR 2 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_Y);//BR 2 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_B);//BR 2 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_R);//BR 2 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_Y);//BR 2 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_B);//BR 2 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_R);//BR 2 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_Y);//BR 2 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_B);//BR 2 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_R);//BR 2 DIFF PRI CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_Y);//BR 2 DIFF PRI CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_B);//BR 2 DIFF PRI CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_R);//BR 2 DIFF PRI VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_Y);//BR 2 DIFF PRI VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_B);//BR 2 DIFF PRI VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_R);//BR 2 DIFF SEC CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_Y);//BR 2 DIFF SEC CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_B);//BR 2 DIFF SEC CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_R);//BR 2 DIFF SEC VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_Y);//BR 2 DIFF SEC VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_B);//BR 2 DIFF SEC VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_R);//BR 2 OC EF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_Y);//BR 2 OC EF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_B);//BR 2 OC EF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_R);//BR 2 OC EF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_Y);//BR 2 OC EF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_B);//BR 2 OC EF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_VERIFIED_BY);//REMARKS IF ANY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_R);//BR 1 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_Y);//BR 1 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_B);//BR 1 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_R);//BR 1 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_Y);//BR 1 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_B);//BR 1 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_R);//BR 1 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_Y);//BR 1 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_B);//BR 1 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_R);//BR 1 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_Y);//BR 1 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_B);//BR 1 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_R);//BR 1 DIFF PRI CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_Y);//BR 1 DIFF PRI CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_B);//BR 1 DIFF PRI CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_R);//BR 1 DIFF PRI VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_Y);//BR 1 DIFF PRI VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_B);//BR 1 DIFF PRI VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_R);//BR 1 DIFF SEC CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_Y);//BR 1 DIFF SEC CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_B);//BR 1 DIFF SEC CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_R);//BR 1 DIFF SEC VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_Y);//BR 1 DIFF SEC VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_B);//BR 1 DIFF SEC VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_R);//BR 1 OC EF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_Y);//BR 1 OC EF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_B);//BR 1 OC EF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_R);//BR 1 OC EF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_Y);//BR 1 OC EF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_B);//BR 1 OC EF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_R);//BR 2 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_Y);//BR 2 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_B);//BR 2 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_R);//BR 2 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_Y);//BR 2 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_B);//BR 2 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_R);//BR 2 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_Y);//BR 2 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_B);//BR 2 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_R);//BR 2 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_Y);//BR 2 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_B);//BR 2 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_R);//BR 2 DIFF PRI CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_Y);//BR 2 DIFF PRI CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_B);//BR 2 DIFF PRI CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_R);//BR 2 DIFF PRI VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_Y);//BR 2 DIFF PRI VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_B);//BR 2 DIFF PRI VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_R);//BR 2 DIFF SEC CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_Y);//BR 2 DIFF SEC CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_B);//BR 2 DIFF SEC CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_R);//BR 2 DIFF SEC VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_Y);//BR 2 DIFF SEC VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_B);//BR 2 DIFF SEC VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_R);//BR 2 OC EF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_Y);//BR 2 OC EF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_B);//BR 2 OC EF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_R);//BR 2 OC EF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_Y);//BR 2 OC EF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_B);//BR 2 OC EF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_VERIFIED_BY);//REMARKS IF ANY
                ed.setEnabled(true);


            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia5"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
                sb.append("cbm.cbm_400kv_ct_cvt_dia5"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
                sb.append("cbm.cbm_400kv_ct_cvt_dia5"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

////////////////Voltage///////

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_PRI_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR_DIFF_SEC_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR1_OC_EF_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_TIE_BCU_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_PRI_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_DIFF_SEC_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_BR2_OC_EF_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA5_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
