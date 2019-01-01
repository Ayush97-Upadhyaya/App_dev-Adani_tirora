package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_la_lcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_la_lcm);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_APML_765KV_LEAKAGE_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_APML_765KV_LEAKAGE_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_APML_765KV_LEAKAGE_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_R);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_Y);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_B);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_R);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_Y);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_B);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_R);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_Y);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_B);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_R);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_Y);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_B);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_R);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_Y);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_B);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_R);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_Y);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_B);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_2_IR_R);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_Y);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_B);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_R);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_Y);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_B);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_2_IR_TOTAL_R);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_TOTAL_Y);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_TOTAL_B);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_R);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_Y);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_B);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_R);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_Y);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_B);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_R);//BUS REACTOR I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_Y);//BUS REACTOR I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_B);//BUS REACTOR I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_R);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_Y);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_B);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_R);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_Y);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_B);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_R);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_Y);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_B);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_R);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_Y);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_B);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_R);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_Y);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_B);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_R);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_Y);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_B);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_R);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_Y);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_B);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_R);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_Y);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_B);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_R);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_Y);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_B);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_R);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_Y);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_B);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_R);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_Y);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_B);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_R);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_Y);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_B);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);


                EditText ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_R);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_Y);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_B);//ICT HV SIDE Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_R);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_Y);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_CORRECT_B);//ICT HV SIDE Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_R);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_Y);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_ICT_HV_SIDE_IR_TOTAL_B);//ICT HV SIDE I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_R);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_Y);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_IR_B);//LINE REACTOR-1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_R);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_Y);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_CORRECT_B);//LINE REACTOR-1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_R);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_Y);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_1_IR_TOTAL_B);//LINE REACTOR-1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_REACTOR_2_IR_R);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_Y);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_B);//LINE REACTOR-2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_R);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_Y);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_CORRECT_B);//LINE REACTOR-2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_LINE_2_IR_TOTAL_R);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_TOTAL_Y);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_LINE_REACTOR_2_IR_TOTAL_B);//LINE REACTOR-2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_R);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_Y);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_B);//BUS REACTOR Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_R);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_Y);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_CORRECT_B);//BUS REACTOR Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_R);//BUS REACTOR I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_Y);//BUS REACTOR I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_BUS_REACTOR_IR_TOTAL_B);//BUS REACTOR I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_R);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_Y);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_4_IR_B);//GENERATOR TRANSFORMER 4 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_R);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_Y);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_CORRECT_B);//GENERATOR TRANSFORMER 4 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_R);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_Y);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_4_IR_TOTAL_B);//GENERATOR TRANSFORMER 4 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_R);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_Y);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_B);//GENERATOR TRANSFORMER 5 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_R);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_Y);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_CORRECT_B);//GENERATOR TRANSFORMER 5 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_R);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_Y);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_GENERATOR_TRANSFORMER_5_IR_TOTAL_B);//GENERATOR TRANSFORMER 5 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_R);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_Y);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_B);//KORADI LINE 1 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_R);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_Y);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_CORRECT_B);//KORADI LINE 1 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_R);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_Y);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_1_IR_TOTAL_B);//KORADI LINE 1 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_R);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_Y);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_B);//KORADI LINE 2 Ir (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_R);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_Y);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_CORRECT_B);//KORADI LINE 2 Ir Correct (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_R);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_Y);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_KORADI_LINE_2_IR_TOTAL_B);//KORADI LINE 2 I total (micro amp)
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_765KV_LEAKAGE_VERIFIED_BY);//VERIFIED BY
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
