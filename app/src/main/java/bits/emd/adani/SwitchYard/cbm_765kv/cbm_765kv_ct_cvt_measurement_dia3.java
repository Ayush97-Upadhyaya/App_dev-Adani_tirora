package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_ct_cvt_measurement_dia3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_measurement_dia3);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_R);//BB-1 701 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_Y);//BB-1 701 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_B);//BB-1 701 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_R);//BB-1 701 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_Y);//BB-1 701 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_B);//BB-1 701 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_R);//BB-1 703 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_Y);//BB-1 703 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_B);//BB-1 703 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_R);//BB-1 703 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_Y);//BB-1 703 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_B);//BB-1 703 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_R);//BB-1 704 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_Y);//BB-1 704 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_B);//BB-1 704 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_R);//BB-1 704 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_Y);//BB-1 704 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_B);//BB-1 704 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_R);//BB-1 706 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_Y);//BB-1 706 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_B);//BB-1 706 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_R);//BB-1 706 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_Y);//BB-1 706 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_B);//BB-1 706 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_R);//BB-1 707 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_Y);//BB-1 707 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_B);//BB-1 707 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_R);//BB-1 707 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_Y);//BB-1 707 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_B);//BB-1 707 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_R);//BB-1 709 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_Y);//BB-1 709 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_B);//BB-1 709 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_R);//BB-1 709 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_Y);//BB-1 709 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_B);//BB-1 709 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_R);//BB-2 701 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_Y);//BB-2 701 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_B);//BB-2 701 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_R);//BB-2 701 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_Y);//BB-2 701 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_B);//BB-2 701 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_R);//BB-2 703 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_Y);//BB-2 703 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_B);//BB-2 703 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_R);//BB-2 703 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_Y);//BB-2 703 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_B);//BB-2 703 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_R);//BB-2 704 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_Y);//BB-2 704 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_B);//BB-2 704 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_R);//BB-2 704 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_Y);//BB-2 704 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_B);//BB-2 704 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_R);//BB-2 706 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_Y);//BB-2 706 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_B);//BB-2 706 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_R);//BB-2 706 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_Y);//BB-2 706 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_B);//BB-2 706 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_R);//BB-2 707 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_Y);//BB-2 707 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_B);//BB-2 707 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_R);//BB-2 707 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_Y);//BB-2 707 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_B);//BB-2 707 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_R);//BB-2 709 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_Y);//BB-2 709 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_B);//BB-2 709 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_R);//BB-2 709 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_Y);//BB-2 709 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_B);//BB-2 709 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_R);//GT 5 OC/EF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_Y);//GT 5 OC/EF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_B);//GT 5 OC/EF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_R);//GT 5 OC/EF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_Y);//GT 5 OC/EF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_B);//GT 5 OC/EF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_R);//GT 5 BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_Y);//GT 5 BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_B);//GT 5 BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_R);//GT 5 BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_Y);//GT 5 BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_B);//GT 5 BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_R);//BUS 1 VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_Y);//BUS 1 VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_B);//BUS 1 VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_R);//BUS 1 VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_Y);//BUS 1 VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_B);//BUS 1 VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_R);//BUS 2 VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_Y);//BUS 2 VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_B);//BUS 2 VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_R);//BUS 2 VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_Y);//BUS 2 VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_B);//BUS 2 VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_R);//LINE VT CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_Y);//LINE VT CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_B);//LINE VT CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_R);//LINE VT VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_Y);//LINE VT VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_B);//LINE VT VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_R);//LINE 1 M1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_Y);//LINE 1 M1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_B);//LINE 1 M1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_R);//LINE 1 M1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_Y);//LINE 1 M1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_B);//LINE 1 M1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_R);//LINE 1 M2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_Y);//LINE 1 M2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_B);//LINE 1 M2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_R);//LINE 1 M2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_Y);//LINE 1 M2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_B);//LINE 1 M2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_R);//LINE 1 BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_Y);//LINE 1 BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_B);//LINE 1 BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_R);//LINE 1 BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_Y);//LINE 1 BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_B);//LINE 1 BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_R);//LINE 2 BUS 1 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_Y);//LINE 2 BUS 1 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_B);//LINE 2 BUS 1 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_R);//LINE 2 BUS 1 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_Y);//LINE 2 BUS 1 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_B);//LINE 2 BUS 1 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_R);//LINE 2 BUS 2 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_Y);//LINE 2 BUS 2 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_B);//LINE 2 BUS 2 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_R);//LINE 2 BUS 2 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_Y);//LINE 2 BUS 2 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_B);//LINE 2 BUS 2 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_DIA_3_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_DIA_3_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_R);//BB-1 701 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_Y);//BB-1 701 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_CURR_B);//BB-1 701 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_R);//BB-1 701 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_Y);//BB-1 701 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_701_VOLT_B);//BB-1 701 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_R);//BB-1 703 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_Y);//BB-1 703 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_CURR_B);//BB-1 703 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_R);//BB-1 703 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_Y);//BB-1 703 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_703_VOLT_B);//BB-1 703 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_R);//BB-1 704 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_Y);//BB-1 704 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_CURR_B);//BB-1 704 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_R);//BB-1 704 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_Y);//BB-1 704 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_704_VOLT_B);//BB-1 704 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_R);//BB-1 706 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_Y);//BB-1 706 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_CURR_B);//BB-1 706 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_R);//BB-1 706 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_Y);//BB-1 706 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_706_VOLT_B);//BB-1 706 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_R);//BB-1 707 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_Y);//BB-1 707 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_CURR_B);//BB-1 707 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_R);//BB-1 707 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_Y);//BB-1 707 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_707_VOLT_B);//BB-1 707 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_R);//BB-1 709 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_Y);//BB-1 709 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_CURR_B);//BB-1 709 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_R);//BB-1 709 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_Y);//BB-1 709 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_1_709_VOLT_B);//BB-1 709 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_R);//BB-2 701 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_Y);//BB-2 701 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_CURR_B);//BB-2 701 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_R);//BB-2 701 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_Y);//BB-2 701 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_701_VOLT_B);//BB-2 701 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_R);//BB-2 703 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_Y);//BB-2 703 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_CURR_B);//BB-2 703 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_R);//BB-2 703 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_Y);//BB-2 703 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_703_VOLT_B);//BB-2 703 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_R);//BB-2 704 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_Y);//BB-2 704 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_CURR_B);//BB-2 704 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_R);//BB-2 704 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_Y);//BB-2 704 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_704_VOLT_B);//BB-2 704 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_R);//BB-2 706 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_Y);//BB-2 706 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_CURR_B);//BB-2 706 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_R);//BB-2 706 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_Y);//BB-2 706 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_706_VOLT_B);//BB-2 706 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_R);//BB-2 707 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_Y);//BB-2 707 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_CURR_B);//BB-2 707 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_R);//BB-2 707 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_Y);//BB-2 707 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_707_VOLT_B);//BB-2 707 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_R);//BB-2 709 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_Y);//BB-2 709 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_CURR_B);//BB-2 709 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_R);//BB-2 709 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_Y);//BB-2 709 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_BB_2_709_VOLT_B);//BB-2 709 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_R);//GT 5 OC/EF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_Y);//GT 5 OC/EF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_CURR_B);//GT 5 OC/EF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_R);//GT 5 OC/EF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_Y);//GT 5 OC/EF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT5_OC_EF_VOLT_B);//GT 5 OC/EF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_R);//GT 5 BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_Y);//GT 5 BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_CURR_B);//GT 5 BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_R);//GT 5 BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_Y);//GT 5 BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_GT_5_BCU_VOLT_B);//GT 5 BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_R);//BUS 1 VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_Y);//BUS 1 VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_CURR_B);//BUS 1 VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_R);//BUS 1 VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_Y);//BUS 1 VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS1_VOLT_B);//BUS 1 VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_R);//BUS 2 VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_Y);//BUS 2 VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_CURR_B);//BUS 2 VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_R);//BUS 2 VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_Y);//BUS 2 VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_VT_BUS2_VOLT_B);//BUS 2 VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_R);//LINE VT CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_Y);//LINE VT CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_CURR_B);//LINE VT CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_R);//LINE VT VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_Y);//LINE VT VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE_VT_VOLT_B);//LINE VT VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_R);//LINE 1 M1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_Y);//LINE 1 M1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_CURR_B);//LINE 1 M1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_R);//LINE 1 M1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_Y);//LINE 1 M1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M1_VOLT_B);//LINE 1 M1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_R);//LINE 1 M2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_Y);//LINE 1 M2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_CURR_B);//LINE 1 M2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_R);//LINE 1 M2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_Y);//LINE 1 M2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_M2_VOLT_B);//LINE 1 M2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_R);//LINE 1 BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_Y);//LINE 1 BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_CURR_B);//LINE 1 BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_R);//LINE 1 BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_Y);//LINE 1 BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE1_BCU_VOLT_B);//LINE 1 BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_R);//LINE 2 BUS 1 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_Y);//LINE 2 BUS 1 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_CURR_B);//LINE 2 BUS 1 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_R);//LINE 2 BUS 1 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_Y);//LINE 2 BUS 1 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS1_VOLT_B);//LINE 2 BUS 1 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_R);//LINE 2 BUS 2 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_Y);//LINE 2 BUS 2 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_CURR_B);//LINE 2 BUS 2 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_R);//LINE 2 BUS 2 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_Y);//LINE 2 BUS 2 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_LINE2_BUS2_VOLT_B);//LINE 2 BUS 2 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_DIA_3_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_DIA3_DIA_3_VERIFIED_BY);//VERIFIED BY
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
