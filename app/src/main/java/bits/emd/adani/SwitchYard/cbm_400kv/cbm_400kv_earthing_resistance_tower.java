package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_earthing_resistance_tower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_earthing_resistance_tower);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_confirm_btn);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER1);//TOWER 1
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER2);//TOWER 2
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER3);//TOWER 3
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER4);//TOWER 4
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER5);//TOWER 5
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER6);//TOWER 6
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER7);//TOWER 7
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER8);//TOWER 8
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER9);//TOWER 9
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER10);//TOWER 10
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER11);//TOWER 11
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER12);//TOWER 12
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER13);//TOWER 13
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER14);//TOWER 14
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER15);//TOWER 15
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER16);//TOWER 16
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER17);//TOWER 17
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER18);//TOWER 18
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER19);//TOWER 19
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER20);//TOWER 20
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER21);//TOWER 21
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER22);//TOWER 22
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER23);//TOWER 23
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER24);//TOWER 24
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER1);//TOWER 1
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER2);//TOWER 2
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER3);//TOWER 3
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER4);//TOWER 4
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER5);//TOWER 5
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER6);//TOWER 6
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER7);//TOWER 7
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER8);//TOWER 8
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER9);//TOWER 9
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER10);//TOWER 10
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER11);//TOWER 11
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER12);//TOWER 12
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER13);//TOWER 13
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER14);//TOWER 14
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER15);//TOWER 15
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER16);//TOWER 16
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER17);//TOWER 17
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER18);//TOWER 18
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER19);//TOWER 19
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER20);//TOWER 20
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER21);//TOWER 21
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER22);//TOWER 22
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER23);//TOWER 23
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER24);//TOWER 24
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_TOWER_VERIFIED_BY);//VERIFIED BY
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
