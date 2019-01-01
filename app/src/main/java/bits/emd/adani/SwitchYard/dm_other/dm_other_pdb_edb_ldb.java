package bits.emd.adani.SwitchYard.dm_other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_other_pdb_edb_ldb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_pdb_edb_ldb);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_OTHER_PDB_EDB_LDB_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_OTHER_PDB_EDB_LDB_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_OTHER_PDB_EDB_LDB_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB);//Check Whether door ar propely closed for PDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_PDB);//Check whether all holes in panel are sealed of PDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_PDB_WORKING_CONDITION);//Check whether all meters in PDB are in working condition
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_R); //VOLTAGE OF PDB Incomer 1 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_Y);//VOLTAGE OF PDB Incomer 1 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_B); //VOLTAGE OF PDB Incomer 1 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_R);//CURRENT OF PDB Incomer 1 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_Y); //CURRENT OF PDB Incomer 1 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_B);//CURRENT OF PDB Incomer 1 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_R); //VOLTAGE OF PDB Incomer 2 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_Y);//VOLTAGE OF PDB Incomer 2 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_B); //VOLTAGE OF PDB Incomer 2 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_R);//CURRENT OF PDB Incomer 2 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_Y); //CURRENT OF PDB Incomer 2 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_B);//CURRENT OF PDB Incomer 2 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_R); //VOLTAGE OF PDB BUS A PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_Y);//VOLTAGE OF PDB BUS A PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_B); //VOLTAGE OF PDB BUS A PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_R);//CURRENT OF PDB BUS A PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_Y); //CURRENT OF PDB BUS A PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_B);//CURRENT OF PDB BUS A PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_R); //VOLTAGE OF PDB BUS B PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_Y);//VOLTAGE OF PDB BUS B PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_B); //VOLTAGE OF PDB BUS B PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_R);//CURRENT OF PDB BUS B PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_Y); //CURRENT OF PDB BUS B PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_B);//CURRENT OF PDB BUS B PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_PDB);//Check whteher all LED in PDB panel are glowing
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_EDB);//Check Whether door ar propely closed for EDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_EDB);//Check whether all holes in panel are sealed of EDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_EDB_WORKING_CONDITION);//Check whether all meters in EDB are in working condition
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_R);//VOLTAGE OF EDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_Y); //VOLTAGE OF EDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_B);//VOLTAGE OF EDB PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_R); //CURRENT OF EDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_Y);//CURRENT OF EDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_B); //CURRENT OF EDB PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_EDB);//Check whteher all LED in EDB panel are glowing
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_LDB);//Check Whether door ar propely closed for LDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_LDB);//Check whether all holes in panel are sealed of LDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LDB_WORKING_CONDITION);//Check whether all meters in LDB are in working condition
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_R);//VOLTAGE OF LDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_Y); //VOLTAGE OF LDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_B);//VOLTAGE OF LDB PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_R); //CURRENT OF LDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_Y);//CURRENT OF LDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_B); //CURRENT OF LDB PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_lDB);//Check whteher all LED in LDB panel are glowing
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_ACDB);//Check Whether door ar propely closed for ACDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_ACDB);//Check whether all holes in panel are sealed of ACDB
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_ACDB_WORKING_CONDITION);//Check whether all meters in ACDB are in working condition
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_R);//VOLTAGE OF ACDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_Y); //VOLTAGE OF ACDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_B);//VOLTAGE OF ACDB PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_R); //CURRENT OF ACDB PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_Y);//CURRENT OF ACDB PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_B); //CURRENT OF ACDB PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_REMARKS);//REMARKS
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VERIFIED_BY); //VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB);//Check Whether door ar propely closed for PDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_PDB);//Check whether all holes in panel are sealed of PDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_PDB_WORKING_CONDITION);//Check whether all meters in PDB are in working condition
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_R); //VOLTAGE OF PDB Incomer 1 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_Y);//VOLTAGE OF PDB Incomer 1 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_B); //VOLTAGE OF PDB Incomer 1 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_R);//CURRENT OF PDB Incomer 1 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_Y); //CURRENT OF PDB Incomer 1 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_B);//CURRENT OF PDB Incomer 1 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_R); //VOLTAGE OF PDB Incomer 2 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_Y);//VOLTAGE OF PDB Incomer 2 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_B); //VOLTAGE OF PDB Incomer 2 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_R);//CURRENT OF PDB Incomer 2 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_Y); //CURRENT OF PDB Incomer 2 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_B);//CURRENT OF PDB Incomer 2 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_R); //VOLTAGE OF PDB BUS A PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_Y);//VOLTAGE OF PDB BUS A PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_B); //VOLTAGE OF PDB BUS A PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_R);//CURRENT OF PDB BUS A PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_Y); //CURRENT OF PDB BUS A PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_B);//CURRENT OF PDB BUS A PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_R); //VOLTAGE OF PDB BUS B PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_Y);//VOLTAGE OF PDB BUS B PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_B); //VOLTAGE OF PDB BUS B PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_R);//CURRENT OF PDB BUS B PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_Y); //CURRENT OF PDB BUS B PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_B);//CURRENT OF PDB BUS B PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_PDB);//Check whteher all LED in PDB panel are glowing
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_EDB);//Check Whether door ar propely closed for EDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_EDB);//Check whether all holes in panel are sealed of EDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_EDB_WORKING_CONDITION);//Check whether all meters in EDB are in working condition
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_R);//VOLTAGE OF EDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_Y); //VOLTAGE OF EDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_EDB_B);//VOLTAGE OF EDB PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_R); //CURRENT OF EDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_Y);//CURRENT OF EDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_EDB_B); //CURRENT OF EDB PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_EDB);//Check whteher all LED in EDB panel are glowing
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_LDB);//Check Whether door ar propely closed for LDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_LDB);//Check whether all holes in panel are sealed of LDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LDB_WORKING_CONDITION);//Check whether all meters in LDB are in working condition
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_R);//VOLTAGE OF LDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_Y); //VOLTAGE OF LDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_B);//VOLTAGE OF LDB PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_R); //CURRENT OF LDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_Y);//CURRENT OF LDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_B); //CURRENT OF LDB PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_lDB);//Check whteher all LED in LDB panel are glowing
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_ACDB);//Check Whether door ar propely closed for ACDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_ACDB);//Check whether all holes in panel are sealed of ACDB
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_ACDB_WORKING_CONDITION);//Check whether all meters in ACDB are in working condition
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_R);//VOLTAGE OF ACDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_Y); //VOLTAGE OF ACDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_B);//VOLTAGE OF ACDB PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_R); //CURRENT OF ACDB PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_Y);//CURRENT OF ACDB PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_B); //CURRENT OF ACDB PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_REMARKS);//REMARKS
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_PDB_EDB_LDB_VERIFIED_BY); //VERIFIED BY
                ed.setEnabled(true);
            }
        });

       confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//////////////////////--------------R VALUES-------------////////////////////////////////////
                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pdb_edb_ldb"); // tablename

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

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_PDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_EDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_lDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_ACDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_R)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();



//////////////////////--------------Y VALUES-------------////////////////////////////////////

                sb=new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pdb_edb_ldb"); // tablename

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

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_PDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_EDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_lDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_ACDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();



//////////////////////--------------B VALUES-------------////////////////////////////////////

                sb=new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pdb_edb_ldb"); // tablename

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

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_PDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_1_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_1_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_INCOMER_2_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_INCOMER_2_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_A_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_A_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_PDB_BUS_B_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_PDB_BUS_B_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_PDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_EDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_EDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_LDB_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_LDB_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_LED_IN_lDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_DOOR_CLOSED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_HOLES_SEALED_ACDB)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_PDB_EDB_LDB_ACDB_WORKING_CONDITION)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VOLTAGE_ACDB_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_CURRENT_ACDB_B)).getText().toString() );  //LA LEAKAGE B
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_REMARKS)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_PDB_EDB_LDB_VERIFIED_BY)).getText().toString() );  //LA LEAKAGE B
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
        });
    }
}





