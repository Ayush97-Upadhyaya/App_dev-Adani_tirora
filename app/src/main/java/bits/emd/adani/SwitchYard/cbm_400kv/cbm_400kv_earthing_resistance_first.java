package bits.emd.adani.SwitchYard.cbm_400kv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_earthing_resistance_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_earthing_resistance_first);


        ((Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_BUS_GT)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_earthing_resistance_line_bus_generator_transformer.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_EARTH_ST)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_earthing_resistance_station_transformer.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_earthing_resistance_tower.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_OTHERS)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_earthing_resistance_others.class);
                startActivity(i);
            }
        });

    }
}
