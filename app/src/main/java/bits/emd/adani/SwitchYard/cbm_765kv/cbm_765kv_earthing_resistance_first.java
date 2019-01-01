package bits.emd.adani.SwitchYard.cbm_765kv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_earthing_resistance_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_earthing_resistance_first);

        ((Button)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_ICT_LR_GT_BR_BUS_AKOLA)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_earthing_resistance_others.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.CBM_7658KV_EARTH_RESISTANCE_TOWER)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_earthing_resistance_tower.class);
                startActivity(i);
            }
        });

        ((Button)findViewById(R.id.CBM_765KV_EARTH_RESISTANCE_LM)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_765kv_earthing_resistance_lm.class);
                startActivity(i);
            }
        });
    }
}
