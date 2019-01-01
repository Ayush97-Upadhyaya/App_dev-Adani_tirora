package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_earthing_resistance_line_bus_generator_transformer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_earthing_resistance_line_bus_generator_transformer);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_R_PHASE);//LINE R Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_Y_PHASE);//LINE Y Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_B_PHASE);//LINE B Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_R_PHASE);//BUS REACTOR R Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_Y_PHASE);//BUS REACTOR Y Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_B_PHASE);//BUS REACTOR B Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_R_PHASE);//GENERATOR TRANSFORMER R Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_Y_PHASE);//GENERATOR TRANSFORMER Y Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_B_PHASE);//GENERATOR TRANSFORMER B Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_R_PHASE);//LINE R Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_Y_PHASE);//LINE Y Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_B_PHASE);//LINE B Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_R_PHASE);//BUS REACTOR R Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_Y_PHASE);//BUS REACTOR Y Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_B_PHASE);//BUS REACTOR B Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_R_PHASE);//GENERATOR TRANSFORMER R Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_Y_PHASE);//GENERATOR TRANSFORMER Y Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_B_PHASE);//GENERATOR TRANSFORMER B Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_APML_BATTERY_READING_RADIOGROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();

                Integer innt = Integer.parseInt(radioText);
                if(innt==1 ||innt ==2 ) {


                    StringBuilder sb = new StringBuilder();
                    sb.append("Insert into ");
                    sb.append("cbm_400kv_earthing_line_"); // tablename

                    sb.append(radioText);

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


                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_R_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_Y_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_LINE_B_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append("1"); // segregating values
                    sb.append(","); // segregating values


                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    String query = sb.toString();

                    ConnectionClass object = new ConnectionClass();
                    object.execute(query);
///////////// bus reactor/////////////
                    sb = new StringBuilder();
                    sb.append("Insert into ");
                    sb.append("cbm_400kv_earthing_br_"); // tablename

                    sb.append(radioText);

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


                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_R_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_Y_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_BUS_REACTOR_B_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");
                    sb.append(","); // segregating values
                    sb.append("1"); // segregating values
                    sb.append(","); // segregating values


                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    query = sb.toString();

                    object = new ConnectionClass();
                    object.execute(query);



////////gt//////////
                    sb = new StringBuilder();
                    sb.append("Insert into ");
                    sb.append("cbm_400kv_earthing_gt_"); // tablename

                    sb.append(radioText);

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


                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_R_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_Y_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_B_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values


                    sb.append("1"); // segregating values
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    query = sb.toString();

                    object = new ConnectionClass();
                    object.execute(query);

                }


                else if(innt == 3){
                    StringBuilder sb = new StringBuilder();
                    sb.append("Insert into ");
                    sb.append("cbm_400kv_earthing_gt_"); // tablename

                    sb.append(radioText);

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


                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_R_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_Y_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_GENERATOR_TRANSFORMER_B_PHASE)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append("1"); // segregating values
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_REMARKS_IF_ANY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    String  query = sb.toString();

                    ConnectionClass object = new ConnectionClass();
                    object.execute(query);
                }

                else{
                    Toast.makeText(getApplicationContext(),"Select The Line,Bus and GT Number",Toast.LENGTH_LONG);
                }
            }
        });
    }
}
