package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_ct_cvt_oil_level_inspection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_oil_level_inspection);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_confirm_btn);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_701CT);//765KV 701 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_702CT);//765KV 702 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_703CT);//765KV 703 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CT);//765KV 704 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CTMETERING);//765KV 704 METERING CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_705CT);//765KV 705 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_706CT);//765KV 706 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CT);//765KV 707 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CTMETERING);//765KV 707 METERING CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_708CT);//765KV 708 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709CT);//765KV 709 CT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_701CVT);//765KV 701 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_703CVT);//765KV 703 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CVT);//765KV 704 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CVTMETERING);//765KV 704 METERING CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CVT);//765KV 707 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CVTMETERING);//765KV 707 METERING CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709CVT);//765KV 709 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707_BUS1_CVT);//765KV 707 BUS1 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709_BUS2_CVT);//765KV 709 BUS2 CVT
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_R);//765KV ICT – R - PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_Y);//765KV ICT – Y - PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_B);//765KV ICT – B- PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_SPARE);//765KV ICT - SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_R);//765KV LINE REACTOR-1-R-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_Y);//765KV LINE REACTOR-1-Y-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_B);//765KV LINE REACTOR-1-B-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_R);//765KV LINE REACTOR-2- R-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_Y);//765KV LINE REACTOR-2-Y-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_B);//765KV LINE REACTOR-2-B-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_SPARE);//765KV LINE REACTOR SPARE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_R);//765KV BUS REACTOR R-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_Y);//765KV BUS REACTOR Y-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_B);//765KV BUS REACTOR B-PHASE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);


                EditText ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_701CT);//765KV 701 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_702CT);//765KV 702 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_703CT);//765KV 703 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CT);//765KV 704 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CTMETERING);//765KV 704 METERING CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_705CT);//765KV 705 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_706CT);//765KV 706 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CT);//765KV 707 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CTMETERING);//765KV 707 METERING CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_708CT);//765KV 708 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709CT);//765KV 709 CT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_701CVT);//765KV 701 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_703CVT);//765KV 703 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CVT);//765KV 704 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_704CVTMETERING);//765KV 704 METERING CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CVT);//765KV 707 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707CVTMETERING);//765KV 707 METERING CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709CVT);//765KV 709 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_707_BUS1_CVT);//765KV 707 BUS1 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_709_BUS2_CVT);//765KV 709 BUS2 CVT
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_R);//765KV ICT – R - PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_Y);//765KV ICT – Y - PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_B);//765KV ICT – B- PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_ICT_SPARE);//765KV ICT - SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_R);//765KV LINE REACTOR-1-R-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_Y);//765KV LINE REACTOR-1-Y-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_1_B);//765KV LINE REACTOR-1-B-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_R);//765KV LINE REACTOR-2- R-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_Y);//765KV LINE REACTOR-2-Y-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_2_B);//765KV LINE REACTOR-2-B-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_LINE_REACTOR_SPARE);//765KV LINE REACTOR SPARE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_R);//765KV BUS REACTOR R-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_Y);//765KV BUS REACTOR Y-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_BUS_REACTOR_B);//765KV BUS REACTOR B-PHASE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_OIL_LEAKAGE_VERIFIED_BY);//VERIFIED BY
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
