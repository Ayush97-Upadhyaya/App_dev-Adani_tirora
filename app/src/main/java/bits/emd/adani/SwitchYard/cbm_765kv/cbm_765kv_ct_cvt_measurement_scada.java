package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_ct_cvt_measurement_scada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_measurement_scada);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_R);//BAY 701 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_Y);//BAY 701 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_B);//BAY 701 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_R);//BAY 701 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_Y);//BAY 701 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_B);//BAY 701 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_R);//BAY 702 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_Y);//BAY 702 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_B);//BAY 702 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_R);//BAY 702 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_Y);//BAY 702 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_B);//BAY 702 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_R);//BAY 703 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_Y);//BAY 703 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_B);//BAY 703 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_R);//BAY 703 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_Y);//BAY 703 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_B);//BAY 703 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_R);//BAY 704 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_Y);//BAY 704 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_B);//BAY 704 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_R);//BAY 704 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_Y);//BAY 704 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_B);//BAY 704 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_R);//BAY 705 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_Y);//BAY 705 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_B);//BAY 705 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_R);//BAY 705 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_Y);//BAY 705 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_B);//BAY 705 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_R);//BAY 706 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_Y);//BAY 706 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_B);//BAY 706 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_R);//BAY 706 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_Y);//BAY 706 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_B);//BAY 706 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_R);//BAY 707 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_Y);//BAY 707 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_B);//BAY 707 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_R);//BAY 707 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_Y);//BAY 707 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_B);//BAY 707 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_R);//BAY 708 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_Y);//BAY 708 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_B);//BAY 708 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_R);//BAY 708 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_Y);//BAY 708 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_B);//BAY 708 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_R);//BAY 709 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_Y);//BAY 709 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_B);//BAY 709 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_R);//BAY 709 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_Y);//BAY 709 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_B);//BAY 709 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_R);//BAY 704 LR CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_Y);//BAY 704 LR CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_B);//BAY 704 LR CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_R);//BAY 704 LR VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_Y);//BAY 704 LR VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_B);//BAY 704 LR VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_R);//BAY 707 LR CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_Y);//BAY 707 LR CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_B);//BAY 707 LR CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_R);//BAY 707 LR VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_Y);//BAY 707 LR VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_B);//BAY 707 LR VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_REMARKS_IF_ANY_R);//REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_R);//BAY 701 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_Y);//BAY 701 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_CURR_B);//BAY 701 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_R);//BAY 701 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_Y);//BAY 701 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_701_VOLT_B);//BAY 701 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_R);//BAY 702 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_Y);//BAY 702 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_CURR_B);//BAY 702 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_R);//BAY 702 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_Y);//BAY 702 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_702_VOLT_B);//BAY 702 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_R);//BAY 703 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_Y);//BAY 703 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_CURR_B);//BAY 703 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_R);//BAY 703 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_Y);//BAY 703 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_703_VOLT_B);//BAY 703 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_R);//BAY 704 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_Y);//BAY 704 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_CURR_B);//BAY 704 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_R);//BAY 704 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_Y);//BAY 704 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_VOLT_B);//BAY 704 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_R);//BAY 705 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_Y);//BAY 705 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_CURR_B);//BAY 705 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_R);//BAY 705 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_Y);//BAY 705 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_705_VOLT_B);//BAY 705 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_R);//BAY 706 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_Y);//BAY 706 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_CURR_B);//BAY 706 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_R);//BAY 706 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_Y);//BAY 706 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_706_VOLT_B);//BAY 706 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_R);//BAY 707 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_Y);//BAY 707 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_CURR_B);//BAY 707 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_R);//BAY 707 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_Y);//BAY 707 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_VOLT_B);//BAY 707 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_R);//BAY 708 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_Y);//BAY 708 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_CURR_B);//BAY 708 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_R);//BAY 708 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_Y);//BAY 708 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_708_VOLT_B);//BAY 708 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_R);//BAY 709 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_Y);//BAY 709 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_CURR_B);//BAY 709 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_R);//BAY 709 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_Y);//BAY 709 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_709_VOLT_B);//BAY 709 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_R);//BAY 704 LR CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_Y);//BAY 704 LR CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_CURR_B);//BAY 704 LR CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_R);//BAY 704 LR VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_Y);//BAY 704 LR VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_704_LR_VOLT_B);//BAY 704 LR VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_R);//BAY 707 LR CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_Y);//BAY 707 LR CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_CURR_B);//BAY 707 LR CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_R);//BAY 707 LR VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_Y);//BAY 707 LR VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_BAY_707_LR_VOLT_B);//BAY 707 LR VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_REMARKS_IF_ANY_R);//REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_CT_CVT_SCADA_VERIFIED_BY);//VERIFIED BY
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
