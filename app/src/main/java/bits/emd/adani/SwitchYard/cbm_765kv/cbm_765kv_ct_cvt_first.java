package bits.emd.adani.SwitchYard.cbm_765kv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;
import bits.emd.adani.SwitchYard.cbm_400kv.cbm_400kv_ct_cvt_measurement_dia4;

public class cbm_765kv_ct_cvt_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_ct_cvt_first);

        ((Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_ct_cvt_measurement_dia1.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_ct_cvt_measurement_dia2.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_ct_cvt_measurement_dia3.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.CBM_765KV_CT_CVT_SCADA)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_ct_cvt_measurement_scada.class);
                startActivity(i);
            }
        });
    }
}
