package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_ct_cvt_measurement_dia7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_ct_cvt_measurement_dia7);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_confirm_btn);

        // SubmitButton OnClick

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_R);//GT3 PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_Y);//GT3 PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_B);//GT3 PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_R);//GT3 PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_Y);//GT3 PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_B);//GT3 PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_R);//GT 3 PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_Y);//GT 3 PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_B);//GT 3 PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_R);//GT 3 PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_Y);//GT 3 PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_B);//GT 3 PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_R);//GT 3 OC EF CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_Y);//GT 3 OC EF CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_B);//GT 3 OC EF CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_R);//GT 3 OC EF VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_Y);//GT 3 OC EF VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_B);//GT 3 OC EF VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_R);//PUA CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_Y);//PUA CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_B);//PUA CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_R);//PUA VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_Y);//PUA VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_B);//PUA VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_R);//PUB CURRENT R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_Y);//PUB CURRENT Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_B);//PUB CURRENT B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_R);//PUB VOLTAGE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_Y);//PUB VOLTAGE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_B);//PUB VOLTAGE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_R);//GT3 PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_Y);//GT3 PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_B);//GT3 PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_R);//GT3 PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_Y);//GT3 PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_B);//GT3 PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_R);//GT 3 PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_Y);//GT 3 PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_B);//GT 3 PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_R);//GT 3 PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_Y);//GT 3 PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_B);//GT 3 PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_R);//GT 3 OC EF CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_Y);//GT 3 OC EF CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_B);//GT 3 OC EF CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_R);//GT 3 OC EF VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_Y);//GT 3 OC EF VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_B);//GT 3 OC EF VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_R);//TIE BCU CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_Y);//TIE BCU CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_B);//TIE BCU CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_R);//TIE BCU VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_Y);//TIE BCU VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_B);//TIE BCU VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_R);//PUA CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_Y);//PUA CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_B);//PUA CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_R);//PUA VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_Y);//PUA VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_B);//PUA VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_R);//PUB CURRENT R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_Y);//PUB CURRENT Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_B);//PUB CURRENT B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_R);//PUB VOLTAGE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_Y);//PUB VOLTAGE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_B);//PUB VOLTAGE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //////////////------------------ADD R VALUES--------------------------------//////////////////
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia7"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
///voltage/////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);



                //////////////------------------ADD Y VALUES--------------------------------//////////////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia7"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
///voltage/////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);


                //////////////------------------ADD Y VALUES--------------------------------//////////////////
                sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("cbm.cbm_400kv_ct_cvt_dia7"); // tablename


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
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_CURR_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
///voltage/////
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_GT3_OC_EF_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_TIE_BCU_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUA_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_PUB_VOLT_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.CBM_400KV_CT_CVT_DIA7_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
