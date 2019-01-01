package bits.emd.adani.SwitchYard.cbm_400kv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_first);


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia1.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia2.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia3.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia4.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia5.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia6.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_dia7.class);
                startActivity(i);
            }
        });


        ((Button)findViewById(R.id.CBM_400KV_CT_CVT_SCADA)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),cbm_400kv_ct_cvt_measurement_scada.class);
                startActivity(i);
            }
        });


    }
}
