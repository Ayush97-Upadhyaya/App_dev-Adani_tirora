package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_oil_level_inspection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_oil_level_inspection);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_OIL_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_OIL_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_OIL_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_401CT);//400KV 401 CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTA);//400KV 402-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTB);//400KV 402-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_403CT);//400KV 403-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CT);//400KV 404-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CTM);//400KV 404-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTA);//400KV 405-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTB);//400KV 405-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CT);//400KV 406-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CTM);//400KV 406-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_407CT);//400KV 407-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTA);//400KV 408-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTB);//400KV 408-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CT);//400KV 409-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CTM);//400KV 409-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_410CT);//400KV 410-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTA);//400KV 411-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTB);//400KV 411-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CT);//400KV 412-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CTM);//400KV 412-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_413CT);//400KV 413-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTA);//400KV 414-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTB);//400KV 414-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_415CT);//400KV 415-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CT);//400KV 416-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CTM);//400KV 416-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTA);//400KV 417-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTB);//400KV 417-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CT);//400KV 418-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CTM);//400KV 418-CTM REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_419CT);//400KV 419-CT REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTA);//400KV 420-CTA REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTB);//400KV 420-CTB REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_1);//400KV BUS REACTOR 1 REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_2);//400KV BUS REACTOR 2 REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_1);//400KV MISCELLANEOUS TRANSFORMER 1 REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_2);//400KV MISCELLANEOUS TRANSFORMER 2 REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_401CT);//400KV 401 CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTA);//400KV 402-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTB);//400KV 402-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_403CT);//400KV 403-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CT);//400KV 404-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CTM);//400KV 404-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTA);//400KV 405-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTB);//400KV 405-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CT);//400KV 406-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CTM);//400KV 406-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_407CT);//400KV 407-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTA);//400KV 408-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTB);//400KV 408-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CT);//400KV 409-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CTM);//400KV 409-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_410CT);//400KV 410-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTA);//400KV 411-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTB);//400KV 411-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CT);//400KV 412-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CTM);//400KV 412-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_413CT);//400KV 413-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTA);//400KV 414-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTB);//400KV 414-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_415CT);//400KV 415-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CT);//400KV 416-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CTM);//400KV 416-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTA);//400KV 417-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTB);//400KV 417-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CT);//400KV 418-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CTM);//400KV 418-CTM REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_419CT);//400KV 419-CT REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTA);//400KV 420-CTA REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTB);//400KV 420-CTB REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_1);//400KV BUS REACTOR 1 REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_2);//400KV BUS REACTOR 2 REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_1);//400KV MISCELLANEOUS TRANSFORMER 1 REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_2);//400KV MISCELLANEOUS TRANSFORMER 2 REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);


            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_oil_inspection"); // tablename


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





                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_401CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_402CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_403CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_404CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_405CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_406CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_407CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_408CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_409CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_410CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_411CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_412CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_413CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_414CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_415CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_416CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_417CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_418CTM)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_419CT)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTA)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_420CTB)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_1)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_BUS_REACTOR_2)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_1)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_MISCELLANEOUS_TRANSFORMER_2)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_OIL_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
