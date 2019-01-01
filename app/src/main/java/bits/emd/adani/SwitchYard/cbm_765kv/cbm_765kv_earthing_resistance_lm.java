package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v4.content.res.ConfigurationHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_earthing_resistance_lm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_earthing_resistance_lm);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM1);//LM1 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM2);//LM2 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM3);//LM3 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM4);//LM4 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM5);//LM5 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM6);//LM6 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM7);//LM7 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM8);//LM8 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM9);//LM9 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM10);//LM10 RESISTANCE
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM1);//LM1 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM2);//LM2 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM3);//LM3 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM4);//LM4 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM5);//LM5 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM6);//LM6 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM7);//LM7 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM8);//LM8 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM9);//LM9 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM10);//LM10 RESISTANCE
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_REMARKS_IF_ANY_R);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM_VERIFIED_BY);//VERIFIED BY
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
