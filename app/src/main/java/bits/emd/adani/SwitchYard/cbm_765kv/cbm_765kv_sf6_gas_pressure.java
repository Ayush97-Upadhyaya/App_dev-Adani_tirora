package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_sf6_gas_pressure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_sf6_gas_pressure);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_APML_765KV_SF6_GAS_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_APML_765KV_SF6_GAS_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_APML_765KV_SF6_GAS_confirm_btn);

        final RadioButton dia1 =(RadioButton)findViewById(R.id.CBM_APML_765KV_SF6_GAS_RADIO_1);
        final RadioButton dia2 =(RadioButton)findViewById(R.id.CBM_APML_765KV_SF6_GAS_RADIO_2);
        final RadioButton dia3 =(RadioButton)findViewById(R.id.CBM_APML_765KV_SF6_GAS_RADIO_3);

        final TextView bay1_701_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA1_BAY1);
        final TextView bay2_702_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA1_BAY2);
        final TextView bay3_703_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA1_BAY3);
        final TextView bay4_704_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA2_BAY1);
        final TextView bay4_704_lr_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA2_BAY2);
        final TextView bay5_705_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA2_BAY3);
        final TextView bay6_706_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA2_BAY4);
        final TextView bay7_707_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA3_BAY1);
        final TextView bay7_707_lr_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA3_BAY2);
        final TextView bay8_708_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA3_BAY3);
        final TextView bay9_709_cb = (TextView)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA3_BAY4);

        final TableRow tableRow = (TableRow)findViewById(R.id.CBM_APML_765KV_SF6_GAS_TABLEROW);

        dia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia2.setChecked(false);
                dia3.setChecked(false);
                bay1_701_cb.setVisibility(View.VISIBLE);
                bay2_702_cb.setVisibility(View.VISIBLE);
                bay3_703_cb.setVisibility(View.VISIBLE);
                bay4_704_cb.setVisibility(View.GONE);
                bay4_704_lr_cb.setVisibility(View.GONE);
                bay5_705_cb.setVisibility(View.GONE);
                bay6_706_cb.setVisibility(View.GONE);
                bay7_707_cb.setVisibility(View.GONE);
                bay7_707_lr_cb.setVisibility(View.GONE);
                bay8_708_cb.setVisibility(View.GONE);
                bay9_709_cb.setVisibility(View.GONE);
                tableRow.setVisibility(View.GONE);

            }
        });

        dia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia3.setChecked(false);
                bay1_701_cb.setVisibility(View.GONE);
                bay2_702_cb.setVisibility(View.GONE);
                bay3_703_cb.setVisibility(View.GONE);
                bay4_704_cb.setVisibility(View.VISIBLE);
                bay4_704_lr_cb.setVisibility(View.VISIBLE);
                bay5_705_cb.setVisibility(View.VISIBLE);
                bay6_706_cb.setVisibility(View.VISIBLE);
                bay7_707_cb.setVisibility(View.GONE);
                bay7_707_lr_cb.setVisibility(View.GONE);
                bay8_708_cb.setVisibility(View.GONE);
                bay9_709_cb.setVisibility(View.GONE);
                tableRow.setVisibility(View.VISIBLE);

            }
        });

        dia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                bay1_701_cb.setVisibility(View.GONE);
                bay2_702_cb.setVisibility(View.GONE);
                bay3_703_cb.setVisibility(View.GONE);
                bay4_704_cb.setVisibility(View.GONE);
                bay4_704_lr_cb.setVisibility(View.GONE);
                bay5_705_cb.setVisibility(View.GONE);
                bay6_706_cb.setVisibility(View.GONE);
                bay7_707_cb.setVisibility(View.VISIBLE);
                bay7_707_lr_cb.setVisibility(View.VISIBLE);
                bay8_708_cb.setVisibility(View.VISIBLE);
                bay9_709_cb.setVisibility(View.VISIBLE);
                tableRow.setVisibility(View.VISIBLE);

            }
        });


        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_765KV_SF6_GAS_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_R1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB R1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_R2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB R2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_Y1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB Y1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_Y2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB Y2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_B1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB B1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_B2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB B2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_R1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB R1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_R2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB R2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_Y1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB Y1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_Y2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB Y2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_B1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB B1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_B2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB B2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_R1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB R1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_R2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB R2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_Y1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB Y1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_Y2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB Y2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_B1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB B1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_B2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB B2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_R1);//BAY-6, 706 CB AND BAY-9, 709 CB R1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_R2);//BAY-6, 706 CB AND BAY-9, 709 CB R2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_Y1);//BAY-6, 706 CB AND BAY-9, 709 CB Y1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_Y2);//BAY-6, 706 CB AND BAY-9, 709 CB Y2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_B1);//BAY-6, 706 CB AND BAY-9, 709 CB B1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_B2);//BAY-6, 706 CB AND BAY-9, 709 CB B2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_765KV_SF6_GAS_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_R1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB R1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_R2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB R2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_Y1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB Y1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_Y2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB Y2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_B1);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB B1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY1_B2);//BAY-1, 701 CB AND BAY-4, 704 CB AND BAY-7, 707 CB B2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_R1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB R1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_R2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB R2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_Y1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB Y1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_Y2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB Y2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_B1);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB B1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY2_B2);//BAY-2, 702 CB AND BAY-4, 704 LR CB AND BAY-7 707 LR CB B2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_R1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB R1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_R2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB R2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_Y1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB Y1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_Y2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB Y2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_B1);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB B1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_BAY3_B2);//BAY-3, 703 CB AND BAY-5, 705 CB AND BAY-8, 708 CB B2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_R1);//BAY-6, 706 CB AND BAY-9, 709 CB R1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_R2);//BAY-6, 706 CB AND BAY-9, 709 CB R2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_Y1);//BAY-6, 706 CB AND BAY-9, 709 CB Y1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_Y2);//BAY-6, 706 CB AND BAY-9, 709 CB Y2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_B1);//BAY-6, 706 CB AND BAY-9, 709 CB B1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_DIA_2_3_BAY4_B2);//BAY-6, 706 CB AND BAY-9, 709 CB B2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_SF6_GAS_VERIFIED_BY);//VERIFIED BY
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
