package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_sf6_gas_pressure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_sf6_gas_pressure);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_APML_400KV_SF6_GAS_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_APML_400KV_SF6_GAS_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_APML_400KV_SF6_GAS_confirm_btn);

        final RadioButton dia1 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_1);
        final RadioButton dia2 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_2);
        final RadioButton dia3 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_3);
        final RadioButton dia4 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_4);
        final RadioButton dia5 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_5);
        final RadioButton dia6 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_6);
        final RadioButton dia7 =(RadioButton)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIO_7);

        final LinearLayout linearLayout_dia_1 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA1);
        final LinearLayout linearLayout_dia_2 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA2);
        final LinearLayout linearLayout_dia_3 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA3);
        final LinearLayout linearLayout_dia_4 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA4);
        final LinearLayout linearLayout_dia_5 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA5);
        final LinearLayout linearLayout_dia_6 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA6);
        final LinearLayout linearLayout_dia_7 = (LinearLayout) findViewById(R.id.CBM_APML_SF6_GAS_DIA7);

        dia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia2.setChecked(false);
                dia3.setChecked(false);
                dia4.setChecked(false);
                dia5.setChecked(false);
                dia6.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.VISIBLE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia3.setChecked(false);
                dia4.setChecked(false);
                dia5.setChecked(false);
                dia6.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.VISIBLE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                dia4.setChecked(false);
                dia5.setChecked(false);
                dia6.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.VISIBLE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                dia3.setChecked(false);
                dia5.setChecked(false);
                dia6.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.VISIBLE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                dia3.setChecked(false);
                dia4.setChecked(false);
                dia6.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.VISIBLE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                dia3.setChecked(false);
                dia4.setChecked(false);
                dia5.setChecked(false);
                dia7.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.VISIBLE);
                linearLayout_dia_7.setVisibility(View.GONE);
            }
        });

        dia7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia1.setChecked(false);
                dia2.setChecked(false);
                dia3.setChecked(false);
                dia4.setChecked(false);
                dia5.setChecked(false);
                dia6.setChecked(false);
                linearLayout_dia_1.setVisibility(View.GONE);
                linearLayout_dia_2.setVisibility(View.GONE);
                linearLayout_dia_3.setVisibility(View.GONE);
                linearLayout_dia_4.setVisibility(View.GONE);
                linearLayout_dia_5.setVisibility(View.GONE);
                linearLayout_dia_6.setVisibility(View.GONE);
                linearLayout_dia_7.setVisibility(View.VISIBLE);
            }
        });



        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_R);//BAY 1 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_Y);//BAY 1 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_B);//BAY 1 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_R);//BAY 2 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_Y);//BAY 2 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_B);//BAY 2 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_R);//BAY 3 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_Y);//BAY 3 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_B);//BAY 3 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_R);//BAY 4 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_Y);//BAY 4 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_B);//BAY 4 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_R);//BAY 5 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_Y);//BAY 5 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_B);//BAY 5 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_R);//BAY 6 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_Y);//BAY 6 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_B);//BAY 6 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_R);//BAY 7 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_Y);//BAY 7 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_B);//BAY 7 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_R);//BAY 8 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_Y);//BAY 8 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_B);//BAY 8 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_R);//BAY 9 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_Y);//BAY 9 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_B);//BAY 9 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_R);//BAY 10 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_Y);//BAY 10 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_B);//BAY 10 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_R);//BAY 11 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_Y);//BAY 11 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_B);//BAY 11 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_R);//BAY 12 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_Y);//BAY 12 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_B);//BAY 12 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_R);//BAY 13 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_Y);//BAY 13 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_B);//BAY 13 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_R);//BAY 14 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_Y);//BAY 14 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_B);//BAY 14 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_R);//BAY 15 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_Y);//BAY 15 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_B);//BAY 15 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_R);//BAY 16 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_Y);//BAY 16 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_B);//BAY 16 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_R);//BAY 17 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_Y);//BAY 17 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_B);//BAY 17 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_R);//BAY 18 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_Y);//BAY 18 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_B);//BAY 18 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_R);//BAY 19 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_Y);//BAY 19 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_B);//BAY 19 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_R);//BAY 20 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_Y);//BAY 20 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_B);//BAY 20 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_400KV_SF6_GAS_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_R);//BAY 1 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_Y);//BAY 1 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY1_B);//BAY 1 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_R);//BAY 2 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_Y);//BAY 2 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY2_B);//BAY 2 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_R);//BAY 3 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_Y);//BAY 3 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA1_BAY3_B);//BAY 3 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_R);//BAY 4 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_Y);//BAY 4 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY4_B);//BAY 4 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_R);//BAY 5 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_Y);//BAY 5 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY5_B);//BAY 5 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_R);//BAY 6 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_Y);//BAY 6 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA2_BAY6_B);//BAY 6 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_R);//BAY 7 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_Y);//BAY 7 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY7_B);//BAY 7 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_R);//BAY 8 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_Y);//BAY 8 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY8_B);//BAY 8 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_R);//BAY 9 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_Y);//BAY 9 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA3_BAY9_B);//BAY 9 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_R);//BAY 10 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_Y);//BAY 10 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY10_B);//BAY 10 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_R);//BAY 11 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_Y);//BAY 11 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY11_B);//BAY 11 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_R);//BAY 12 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_Y);//BAY 12 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA4_BAY12_B);//BAY 12 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_R);//BAY 13 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_Y);//BAY 13 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY13_B);//BAY 13 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_R);//BAY 14 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_Y);//BAY 14 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY14_B);//BAY 14 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_R);//BAY 15 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_Y);//BAY 15 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA5_BAY15_B);//BAY 15 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_R);//BAY 16 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_Y);//BAY 16 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY16_B);//BAY 16 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_R);//BAY 17 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_Y);//BAY 17 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY17_B);//BAY 17 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_R);//BAY 18 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_Y);//BAY 18 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA6_BAY18_B);//BAY 18 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_R);//BAY 19 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_Y);//BAY 19 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY19_B);//BAY 19 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_R);//BAY 20 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_Y);//BAY 20 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_DIA7_BAY20_B);//BAY 20 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_SF6_GAS_VERIFIED_BY);//VERIFIED BY
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
