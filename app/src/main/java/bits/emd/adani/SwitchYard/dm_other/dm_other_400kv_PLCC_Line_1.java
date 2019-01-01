package bits.emd.adani.SwitchYard.dm_other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.Toast;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_other_400kv_PLCC_Line_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_400kv__plcc__line_1);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.PLCC_Panel_LINE_1_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.PLCC_Panel_LINE_1_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.PLCC_Panel_LINE_1_CONFIRM);

        final RadioButton channel_1=(RadioButton)findViewById(R.id.DM_400KV_PLCC_LINE_1_RADIO_1);
        final RadioButton channel_2=(RadioButton)findViewById(R.id.DM_400KV_PLCC_LINE_1_RADIO_2);

        final TableLayout tableLayout_channel_1=(TableLayout)findViewById(R.id.DM_400KV_PLCC_LINE_1_CHANNEL_1);
        final TableLayout tableLayout_channel_2=(TableLayout)findViewById(R.id.DM_400KV_PLCC_LINE_1_CHANNEL_2);

        channel_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tableLayout_channel_1.setVisibility(v.VISIBLE);
                tableLayout_channel_2.setVisibility(v.GONE);
            }
        });

        channel_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tableLayout_channel_1.setVisibility(v.GONE);
                tableLayout_channel_2.setVisibility(v.VISIBLE);
            }
        });
        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);


                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_PLCC_LINE_1_RADIO_GROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_TX);//CS/CR-M1 CHANNEL 1 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_RX);// CS/CR-M1 CHANNEL 1 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_TX);// CS/CR-M2 CHANNEL 1 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_RX);// CS/CR-M2 CHANNEL 1 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_TX);// DT S/R CHANNEL 1 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_RX);// DT S/R CHANNEL 1 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_TX);//CD-L1 Status CHANNEL 1 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_RX);//CD-L1 Status CHANNEL 1 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_TX);//AGC CHANNEL 1 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_RX);//AGC CHANNEL 1RX
                ed.setEnabled(false);

                ///////////////////////////////////////////////////////////////////////////////////

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_TX);//CS/CR-M1 CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_RX);// CS/CR-M1 CHANNEL 2 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_TX);// CS/CR-M2 CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_RX);// CS/CR-M2 CHANNEL 2 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_TX);// DT S/R CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_RX);// DT S/R CHANNEL 2 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_TX);//CD-L1+L2 Status CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_RX);//CD-L1+L2 Status CHANNEL 2 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_TX);//AGC CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_RX);//AGC CHANNEL 2 RX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_1_REMARKS);//AGC CHANNEL 2 TX
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY);//AGC CHANNEL 2 RX
                ed.setEnabled(false);


            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_PLCC_LINE_1_RADIO_GROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_TX);//CS/CR-M1 CHANNEL 1 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_RX);// CS/CR-M1 CHANNEL 1 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_TX);// CS/CR-M2 CHANNEL 1 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_RX);// CS/CR-M2 CHANNEL 1 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_TX);// DT S/R CHANNEL 1 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_RX);// DT S/R CHANNEL 1 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_TX);//CD-L1 Status CHANNEL 1 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_RX);//CD-L1 Status CHANNEL 1 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_TX);//AGC CHANNEL 1 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_RX);//AGC CHANNEL 1RX
                ed.setEnabled(true);

                ////////////////////////////////////////////////////////////////////////////////

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_TX);//CS/CR-M1 CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_RX);// CS/CR-M1 CHANNEL 2 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_TX);// CS/CR-M2 CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_RX);// CS/CR-M2 CHANNEL 2 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_TX);// DT S/R CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_RX);// DT S/R CHANNEL 2 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_TX);//CD-L1+L2 Status CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_RX);//CD-L1+L2 Status CHANNEL 2 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_TX);//AGC CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_RX);//AGC CHANNEL 2 RX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_1_REMARKS);//AGC CHANNEL 2 TX
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY);//AGC CHANNEL 2 RX
                ed.setEnabled(true);

            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_400kv_plcc_ln1_ch_"); // tablename


                RadioGroup rg = (RadioGroup)findViewById(R.id.DM_400KV_PLCC_LINE_1_RADIO_GROUP);  // value from radiogroup
                RadioButton rb = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();

                sb.append(radioText); // add LINE number

                sb.append(" values(");

                if(radioText.equals("1")){


                  /*  sb.append("'");
                    sb.append(((ToggleButton) findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB)).getText().toString());  //FAN STATUS
                    sb.append("'");
                    sb.append(","); // segregating values

*/                  SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
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


                    sb.append("'TX'");
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_REMARKS)).getText().toString());
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY)).getText().toString());
                    sb.append("'");



                    sb.append(");"); // Close

                    String query = sb.toString();

                    ConnectionClass object = new ConnectionClass();
                    object.execute(query);

///////////////////////////////////////---------for RX-------------------///////////////////////////
                    sb=new StringBuilder();
                    sb.append(" Insert into ");
                    sb.append("dm_others_400kv_plcc_ln1_ch_1"); // tablename


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

                    sb.append("'RX'");
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M1_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_M2_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_DT_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_CD_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_1_AGC_RX)).getText().toString());  //LA Counter R

                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_REMARKS)).getText().toString());
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY)).getText().toString());
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    query = sb.toString();

                    object = new ConnectionClass();
                    object.execute(query);

                    //Add ProgressBar to check if Query executed or not
                    //finish();
                }

                if(radioText.equals("2")){


                  /*  sb.append("'");
                    sb.append(((ToggleButton) findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB)).getText().toString());  //FAN STATUS
                    sb.append("'");
                    sb.append(","); // segregating values



*/
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


                    sb.append("'TX'");
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_TX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_REMARKS)).getText().toString());
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY)).getText().toString());
                    sb.append("'");

                    sb.append(");"); // Close
                    String query = sb.toString();

                    ConnectionClass object = new ConnectionClass();
                    object.execute(query);

///////////////////////////////////////---------for RX-------------------///////////////////////////

                    sb=new StringBuilder();
                    sb.append(" Insert into ");
                    sb.append("dm_others_400kv_plcc_ln1_ch_2"); // tablename


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

                    sb.append("'RX'");
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M1_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_M2_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_DT_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_CD_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_LINE_1_CH_2_AGC_RX)).getText().toString());  //LA Counter R
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_REMARKS)).getText().toString());
                    sb.append("'");
                    sb.append(","); // segregating values

                    sb.append("'");
                    sb.append(((EditText) findViewById(R.id.PLCC_Panel_1_VERIFIED_BY_ANY)).getText().toString());
                    sb.append("'");

                    sb.append(");"); // Close

                    // Call Connection Class for Offline SQLite DataBase
                    // Store Query created as a String in DataBase
                    query = sb.toString();

                    object = new ConnectionClass();
                    object.execute(query);

                    //Add ProgressBar to check if Query executed or not
                    //finish();
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Select Line Number",Toast.LENGTH_LONG);
                }

            }
        });
    }
}
