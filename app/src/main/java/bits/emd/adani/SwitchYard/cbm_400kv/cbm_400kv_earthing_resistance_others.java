package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_earthing_resistance_others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_earthing_resistance_others);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_1_1);//HM-1-1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_1_2);//HM-1-2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_2_1);//HM-2-1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_2_2);//HM-2-2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_3_1);//HM-3-1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_3_2);//HM-3-2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LM_1);//LM 1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LM_2);//LM-2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_CREP_1);//CREP 1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_CREP_2);//CREP 2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PDB_EP_1);//PDB EP 1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_DCDB_EP_1);//DCDB EP-1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_DCDB_EP_2);//DCDB EP 2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PLCC_KIOSK_2_EP1);//PLCC KIOSK 2 EP1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PLCC_KIOSK_3_EP2);//PLCC KIOSK-3 EP 2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_1_1);//HM-1-1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_1_2);//HM-1-2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_2_1);//HM-2-1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_2_2);//HM-2-2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_3_1);//HM-3-1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_HM_3_2);//HM-3-2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LM_1);//LM 1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LM_2);//LM-2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_CREP_1);//CREP 1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_CREP_2);//CREP 2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PDB_EP_1);//PDB EP 1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_DCDB_EP_1);//DCDB EP-1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_DCDB_EP_2);//DCDB EP 2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PLCC_KIOSK_2_EP1);//PLCC KIOSK 2 EP1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_PLCC_KIOSK_3_EP2);//PLCC KIOSK-3 EP 2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS_VERIFIED_BY);//VERIFIED BY
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
