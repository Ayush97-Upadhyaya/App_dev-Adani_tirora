package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_measurement_scada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_measurement_scada);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_R);//BAY 401 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_Y);//BAY 401 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_B);//BAY 401 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_R);//BAY 401 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_Y);//BAY 401 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_B);//BAY 401 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_R);//BAY 402 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_Y);//BAY 402 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_B);//BAY 402 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_R);//BAY 402 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_Y);//BAY 402 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_B);//BAY 402 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_R);//BAY 403 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_Y);//BAY 403 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_B);//BAY 403 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_R);//BAY 403 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_Y);//BAY 403 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_B);//BAY 403 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_R);//BAY 404 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_Y);//BAY 404 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_B);//BAY 404 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_R);//BAY 404 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_Y);//BAY 404 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_B);//BAY 404 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_R);//BAY 405 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_Y);//BAY 405 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_B);//BAY 405 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_R);//BAY 405 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_Y);//BAY 405 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_B);//BAY 405 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_R);//BAY 406 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_Y);//BAY 406 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_B);//BAY 406 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_R);//BAY 406 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_Y);//BAY 406 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_B);//BAY 406 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_R);//BAY 407 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_Y);//BAY 407 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_B);//BAY 407 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_R);//BAY 407 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_Y);//BAY 407 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_B);//BAY 407 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_R);//BAY 408 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_Y);//BAY 408 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_B);//BAY 408 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_R);//BAY 408 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_Y);//BAY 408 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_B);//BAY 408 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_R);//BAY 409 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_Y);//BAY 409 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_B);//BAY 409 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_R);//BAY 409 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_Y);//BAY 409 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_B);//BAY 409 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_R);//BAY 410 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_Y);//BAY 410 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_B);//BAY 410 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_R);//BAY 410 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_Y);//BAY 410 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_B);//BAY 410 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_R);//BAY 411 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_Y);//BAY 411 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_B);//BAY 411 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_R);//BAY 411 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_Y);//BAY 411 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_B);//BAY 411 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_R);//BAY 412 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_Y);//BAY 412 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_B);//BAY 412 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_R);//BAY 412 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_Y);//BAY 412 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_B);//BAY 412 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_R);//BAY 413 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_Y);//BAY 413 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_B);//BAY 413 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_R);//BAY 413 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_Y);//BAY 413 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_B);//BAY 413 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_R);//BAY 414 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_Y);//BAY 414 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_B);//BAY 414 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_R);//BAY 414 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_Y);//BAY 414 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_B);//BAY 414 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_R);//BAY 415 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_Y);//BAY 415 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_B);//BAY 415 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_R);//BAY 415 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_Y);//BAY 415 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_B);//BAY 415 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_R);//BAY 416 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_Y);//BAY 416 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_B);//BAY 416 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_R);//BAY 416 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_Y);//BAY 416 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_B);//BAY 416 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_R);//BAY 417 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_Y);//BAY 417 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_B);//BAY 417 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_R);//BAY 417 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_Y);//BAY 417 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_B);//BAY 417 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_R);//BAY 418 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_Y);//BAY 418 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_B);//BAY 418 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_R);//BAY 418 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_Y);//BAY 418 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_B);//BAY 418 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_R);//BAY 419 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_Y);//BAY 419 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_B);//BAY 419 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_R);//BAY 419 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_Y);//BAY 419 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_B);//BAY 419 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_R);//BAY 420 CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_Y);//BAY 420 CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_B);//BAY 420 CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_R);//BAY 420 VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_Y);//BAY 420 VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_B);//BAY 420 VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_R);//BAY 401 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_Y);//BAY 401 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_B);//BAY 401 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_R);//BAY 401 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_Y);//BAY 401 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_B);//BAY 401 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_R);//BAY 402 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_Y);//BAY 402 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_B);//BAY 402 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_R);//BAY 402 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_Y);//BAY 402 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_B);//BAY 402 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_R);//BAY 403 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_Y);//BAY 403 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_B);//BAY 403 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_R);//BAY 403 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_Y);//BAY 403 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_B);//BAY 403 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_R);//BAY 404 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_Y);//BAY 404 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_B);//BAY 404 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_R);//BAY 404 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_Y);//BAY 404 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_B);//BAY 404 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_R);//BAY 405 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_Y);//BAY 405 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_B);//BAY 405 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_R);//BAY 405 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_Y);//BAY 405 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_B);//BAY 405 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_R);//BAY 406 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_Y);//BAY 406 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_B);//BAY 406 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_R);//BAY 406 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_Y);//BAY 406 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_B);//BAY 406 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_R);//BAY 407 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_Y);//BAY 407 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_B);//BAY 407 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_R);//BAY 407 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_Y);//BAY 407 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_B);//BAY 407 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_R);//BAY 408 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_Y);//BAY 408 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_B);//BAY 408 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_R);//BAY 408 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_Y);//BAY 408 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_B);//BAY 408 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_R);//BAY 409 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_Y);//BAY 409 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_B);//BAY 409 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_R);//BAY 409 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_Y);//BAY 409 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_B);//BAY 409 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_R);//BAY 410 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_Y);//BAY 410 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_B);//BAY 410 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_R);//BAY 410 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_Y);//BAY 410 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_B);//BAY 410 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_R);//BAY 411 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_Y);//BAY 411 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_B);//BAY 411 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_R);//BAY 411 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_Y);//BAY 411 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_B);//BAY 411 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_R);//BAY 412 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_Y);//BAY 412 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_B);//BAY 412 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_R);//BAY 412 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_Y);//BAY 412 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_B);//BAY 412 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_R);//BAY 413 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_Y);//BAY 413 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_B);//BAY 413 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_R);//BAY 413 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_Y);//BAY 413 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_B);//BAY 413 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_R);//BAY 414 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_Y);//BAY 414 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_B);//BAY 414 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_R);//BAY 414 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_Y);//BAY 414 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_B);//BAY 414 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_R);//BAY 415 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_Y);//BAY 415 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_B);//BAY 415 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_R);//BAY 415 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_Y);//BAY 415 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_B);//BAY 415 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_R);//BAY 416 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_Y);//BAY 416 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_B);//BAY 416 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_R);//BAY 416 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_Y);//BAY 416 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_B);//BAY 416 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_R);//BAY 417 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_Y);//BAY 417 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_B);//BAY 417 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_R);//BAY 417 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_Y);//BAY 417 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_B);//BAY 417 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_R);//BAY 418 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_Y);//BAY 418 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_B);//BAY 418 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_R);//BAY 418 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_Y);//BAY 418 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_B);//BAY 418 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_R);//BAY 419 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_Y);//BAY 419 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_B);//BAY 419 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_R);//BAY 419 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_Y);//BAY 419 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_B);//BAY 419 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_R);//BAY 420 CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_Y);//BAY 420 CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_B);//BAY 420 CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_R);//BAY 420 VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_Y);//BAY 420 VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_B);//BAY 420 VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////-------------CONFIRM BUTTON--------///////////


                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_scada"); // tablename


                sb.append(" values(");

                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                String formattedDate = sd.format(new java.util.Date().getTime());
                sb.append("'");
                sb.append(formattedDate); // date
                sb.append("'");
                sb.append(","); // segregating values

                sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // timestamp
                formattedDate = sd.format(new java.util.Date());
                sb.append("'");
                sb.append(formattedDate); // add timestamp
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'R'");
                sb.append(","); // segregating values

///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


////////////////Voltage///////


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);



////////////////-------------Y VALUES----------------------------///////////


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_scada"); // tablename


                sb.append(" values(");

                sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                formattedDate = sd.format(new java.util.Date().getTime());
                sb.append("'");
                sb.append(formattedDate); // date
                sb.append("'");
                sb.append(","); // segregating values

                sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // timestamp
                formattedDate = sd.format(new java.util.Date());
                sb.append("'");
                sb.append(formattedDate); // add timestamp
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'Y'");
                sb.append(","); // segregating values

///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


////////////////Voltage///////


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);


////////////////-------------B VALUES----------------------------///////////


                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_scada"); // tablename


                sb.append(" values(");

                sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                formattedDate = sd.format(new java.util.Date().getTime());
                sb.append("'");
                sb.append(formattedDate); // date
                sb.append("'");
                sb.append(","); // segregating values

                sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // timestamp
                formattedDate = sd.format(new java.util.Date());
                sb.append("'");
                sb.append(formattedDate); // add timestamp
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'B'");
                sb.append(","); // segregating values

///////current//////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


////////////////Voltage///////


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_401_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_402_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_403_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_404_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_405_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_406_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_407_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_408_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_409_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_410_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_411_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_412_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_413_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_414_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_415_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_416_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_417_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_418_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_419_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_BAY_420_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_SCADA_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
