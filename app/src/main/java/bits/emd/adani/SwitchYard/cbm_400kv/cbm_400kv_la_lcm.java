package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_la_lcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_la_lcm);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_APML_400KV_LEAKAGE_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_APML_400KV_LEAKAGE_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_APML_400KV_LEAKAGE_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_R);//BUS REACTOR-2 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_Y);//BUS REACTOR-2 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_B);//BUS REACTOR-2 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_R);//BUS REACTOR-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_Y);//BUS REACTOR-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_B);//BUS REACTOR-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_R);//BUS REACTOR-2 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_Y);//BUS REACTOR-2 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_B);//BUS REACTOR-2 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_R);//BUS REACTOR-1 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_Y);//BUS REACTOR-1 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_B);//BUS REACTOR-1 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_R);//BUS REACTOR-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_Y);//BUS REACTOR-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_B);//BUS REACTOR-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_R);//BUS REACTOR-1 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_Y);//BUS REACTOR-1 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_B);//BUS REACTOR-1 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_R);//LINE-2 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_Y);//LINE-2 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_B);//LINE-2 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_R);//LINE-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_Y);//LINE-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_B);//LINE-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_R);//LINE-2 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_Y);//LINE-2 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_B);//LINE-2 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_R);//LINE-1 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_Y);//LINE-1 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_B);//LINE-1 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_R);//LINE-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_Y);//LINE-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_B);//LINE-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_R);//LINE-1 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_Y);//LINE-1 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_B);//LINE-1 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_R);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_Y);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_B);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_R);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_Y);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_B);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_R);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_Y);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_B);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_R);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_Y);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_B);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_R);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_Y);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_B);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_R);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_Y);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_B);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_R);//STATION TRANSFORMER-1 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_Y);//STATION TRANSFORMER-1 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_B);//STATION TRANSFORMER-1 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_R);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_Y);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_B);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_R);//STATION TRANSFORMER-1 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_Y);//STATION TRANSFORMER-1 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_B);//STATION TRANSFORMER-1 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_R);//STATION TRANSFORMER-2 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_Y);//STATION TRANSFORMER-2 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_B);//STATION TRANSFORMER-2 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_R);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_Y);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_B);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_R);//STATION TRANSFORMER-2 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_Y);//STATION TRANSFORMER-2 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_B);//STATION TRANSFORMER-2 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_R);//STATION TRANSFORMER-3 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_Y);//STATION TRANSFORMER-3 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_B);//STATION TRANSFORMER-3 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_R);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_Y);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_B);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_R);//STATION TRANSFORMER-3 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_Y);//STATION TRANSFORMER-3 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_B);//STATION TRANSFORMER-3 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_R);//STATION TRANSFORMER-4 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_Y);//STATION TRANSFORMER-4 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_B);//STATION TRANSFORMER-4 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_R);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_Y);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_B);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_R);//STATION TRANSFORMER-4 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_Y);//STATION TRANSFORMER-4 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_B);//STATION TRANSFORMER-4 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_R);//STATION TRANSFORMER-5 LA Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_Y);//STATION TRANSFORMER-5 LA Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_B);//STATION TRANSFORMER-5 LA Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_R);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_Y);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_B);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_R);//STATION TRANSFORMER-5 LA I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_Y);//STATION TRANSFORMER-5 LA I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_B);//STATION TRANSFORMER-5 LA I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_R);//ICT LV Ir (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_Y);//ICT LV Ir (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_B);//ICT LV Ir (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_R);//ICT LV Ir Correct (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_Y);//ICT LV Ir Correct (micro Amp) Y.
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_B);//ICT LV Ir Correct (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_R);//ICT LV I total (micro Amp) R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_Y);//ICT LV I total (micro Amp) Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_B);//ICT LV I total (micro Amp) B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_REMARKS);//Remarks
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_VERIFIED);//Verified By
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_R);//BUS REACTOR-2 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_Y);//BUS REACTOR-2 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_B);//BUS REACTOR-2 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_R);//BUS REACTOR-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_Y);//BUS REACTOR-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_CORRECT_B);//BUS REACTOR-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_R);//BUS REACTOR-2 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_Y);//BUS REACTOR-2 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_2_LA_IR_TOTAL_B);//BUS REACTOR-2 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_R);//BUS REACTOR-1 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_Y);//BUS REACTOR-1 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_B);//BUS REACTOR-1 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_R);//BUS REACTOR-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_Y);//BUS REACTOR-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_CORRECT_B);//BUS REACTOR-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_R);//BUS REACTOR-1 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_Y);//BUS REACTOR-1 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_BUS_REACT_1_LA_IR_TOTAL_B);//BUS REACTOR-1 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_R);//LINE-2 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_Y);//LINE-2 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_B);//LINE-2 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_R);//LINE-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_Y);//LINE-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_CORRECT_B);//LINE-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_R);//LINE-2 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_Y);//LINE-2 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_2_LA_IR_TOTAL_B);//LINE-2 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_R);//LINE-1 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_Y);//LINE-1 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_B);//LINE-1 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_R);//LINE-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_Y);//LINE-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_CORRECT_B);//LINE-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_R);//LINE-1 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_Y);//LINE-1 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_LINE_1_LA_IR_TOTAL_B);//LINE-1 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_R);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_Y);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_CURRENT_GENERATOR_TRANSFORMER_1_LA_IR_B);//GENERATOR TRANSFORMER-1 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_R);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_Y);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_CORRECT_B);//GENERATOR TRANSFORMER-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_R);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_Y);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_1_LA_IR_TOTAL_B);//GENERATOR TRANSFORMER-1 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_R);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_Y);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_B);//GENERATOR TRANSFORMER-2 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_R);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_Y);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_CORRECT_B);//GENERATOR TRANSFORMER-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_R);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_Y);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_GENERATOR_TRANSFORMER_2_LA_IR_TOTAL_B);//GENERATOR TRANSFORMER-2 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_R);//STATION TRANSFORMER-1 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_Y);//STATION TRANSFORMER-1 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_B);//STATION TRANSFORMER-1 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_R);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_Y);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_CORRECT_B);//STATION TRANSFORMER-1 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_R);//STATION TRANSFORMER-1 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_Y);//STATION TRANSFORMER-1 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_1_LA_IR_TOTAL_B);//STATION TRANSFORMER-1 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_R);//STATION TRANSFORMER-2 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_Y);//STATION TRANSFORMER-2 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_B);//STATION TRANSFORMER-2 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_R);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_Y);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_CORRECT_B);//STATION TRANSFORMER-2 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_R);//STATION TRANSFORMER-2 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_Y);//STATION TRANSFORMER-2 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_2_LA_IR_TOTAL_B);//STATION TRANSFORMER-2 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_R);//STATION TRANSFORMER-3 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_Y);//STATION TRANSFORMER-3 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_B);//STATION TRANSFORMER-3 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_R);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_Y);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_CORRECT_B);//STATION TRANSFORMER-3 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_R);//STATION TRANSFORMER-3 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_Y);//STATION TRANSFORMER-3 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_3_LA_IR_TOTAL_B);//STATION TRANSFORMER-3 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_R);//STATION TRANSFORMER-4 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_Y);//STATION TRANSFORMER-4 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_B);//STATION TRANSFORMER-4 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_R);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_Y);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_CORRECT_B);//STATION TRANSFORMER-4 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_R);//STATION TRANSFORMER-4 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_Y);//STATION TRANSFORMER-4 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_4_LA_IR_TOTAL_B);//STATION TRANSFORMER-4 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_R);//STATION TRANSFORMER-5 LA Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_Y);//STATION TRANSFORMER-5 LA Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_B);//STATION TRANSFORMER-5 LA Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_R);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_Y);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_CORRECT_B);//STATION TRANSFORMER-5 LA Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_R);//STATION TRANSFORMER-5 LA I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_Y);//STATION TRANSFORMER-5 LA I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_STATION_TRANSFORMER_5_LA_IR_TOTAL_B);//STATION TRANSFORMER-5 LA I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_R);//ICT LV Ir (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_Y);//ICT LV Ir (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_B);//ICT LV Ir (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_R);//ICT LV Ir Correct (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_Y);//ICT LV Ir Correct (micro Amp) Y.
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_CORRECT_B);//ICT LV Ir Correct (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_R);//ICT LV I total (micro Amp) R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_Y);//ICT LV I total (micro Amp) Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_ICT_LV_LA_IR_TOTAL_B);//ICT LV I total (micro Amp) B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_REMARKS);//Remarks
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_APML_400KV_LEAKAGE_VERIFIED);//Verified By
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
