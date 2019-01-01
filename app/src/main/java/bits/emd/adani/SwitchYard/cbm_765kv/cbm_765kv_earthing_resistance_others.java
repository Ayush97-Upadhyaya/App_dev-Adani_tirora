package bits.emd.adani.SwitchYard.cbm_765kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;

public class cbm_765kv_earthing_resistance_others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_765kv_earthing_resistance_others);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_765KV_CT_CVT_DIA_1_CONFIRM);

        // SubmitButton OnClick
    }
}
