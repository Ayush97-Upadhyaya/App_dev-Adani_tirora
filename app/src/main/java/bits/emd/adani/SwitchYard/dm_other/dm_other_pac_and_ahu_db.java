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

public class dm_other_pac_and_ahu_db extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_other_pac_and_ahu_db);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.DM_OTHER_PAC_AHU_SUBMIT_BUTTON);
        final Button edit_btn = (Button)findViewById(R.id.DM_OTHER_PAC_AHU_EDIT);
        final Button confirm_btn = (Button)findViewById(R.id.DM_OTHER_PAC_AHU_CONFIRM);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_R);//HEALTHINESS OF BLOWER SYSTEM PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_Y);//HEALTHINESS OF BLOWER SYSTEM PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_B);//HEALTHINESS OF BLOWER SYSTEM PHASE B
                tb.setClickable(false);

                EditText ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_R); //VOLTAGE OF AHU SWITCHBOARD PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_Y);//VOLTAGE OF AHU SWITCHBOARD PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_B);//VOLTAGE OF AHU SWITCHBOARD PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_R);//CURRENT OF AHU SWITCHBOARD PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_Y);//CURRENT OF AHU SWITCHBOARD PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_B);//CURRENT OF AHU SWITCHBOARD PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_R);//CURRENT OF BLOWER MOTOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_Y);//CURRENT OF BLOWER MOTOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_B);//CURRENT OF BLOWER MOTOR PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_R);//HEALTHINESS OF AHU PUMP 1 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_Y);//HEALTHINESS OF AHU PUMP 1 PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_B);//HEALTHINESS OF AHU PUMP 1 PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_R);//HEALTHINESS OF AHU PUMP 2 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_Y);//HEALTHINESS OF AHU PUMP 2 PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_B);//HEALTHINESS OF AHU PUMP 2 PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_R);//HEALTHINESS OF PAC SYSTEM PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_Y);//HEALTHINESS OF PAC SYSTEM PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_B);//HEALTHINESS OF PAC SYSTEM PHASE B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_R);//VOLTAGE OF PAC SWITCHYARD PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_Y);//VOLTAGE OF PAC SWITCHYARD PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_B);//VOLTAGE OF PAC SWITCHYARD PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_R);//CURRENT OF PAC SWITCHYARD PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_Y);//CURRENT OF PAC SWITCHYARD PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_B);//CURRENT OF PAC SWITCHYARD PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_R);//CURRENT OF PAC 1 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_Y);//CURRENT OF PAC 1 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_B);//CURRENT OF PAC 1 PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_R);//CURRENT OF PAC 2 PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_Y);//CURRENT OF PAC 2 PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_B);//CURRENT OF PAC 2 PHASE B
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_R);//WATER LEAKAGE FROM PAC COOLING PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_Y);//WATER LEAKAGE FROM PAC COOLING PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_B);//WATER LEAKAGE FROM PAC COOLING PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_R);//WATER LEAKAGE FROM AHU BLOWER PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_Y);//WATER LEAKAGE FROM AHU BLOWER PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_B);//WATER LEAKAGE FROM AHU BLOWER PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_R);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_Y);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_B);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE B
                tb.setClickable(false);


                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_R);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_Y);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_B);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE B
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_R);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_Y);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_B);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_R);//HEALTHINESS OF PAC CONDENSER 2 PHASE R
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_Y);//HEALTHINESS OF PAC CONDENSER 2 PHASE Y
                tb.setClickable(false);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_B);//HEALTHINESS OF PAC CONDENSER 2 PHASE B
                tb.setClickable(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VERIFIED);//VERIFIED BY
                ed.setEnabled(false);

            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(v.VISIBLE);
                edit_btn.setVisibility(v.GONE);
                confirm_btn.setVisibility(v.GONE);

                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_R);//HEALTHINESS OF BLOWER SYSTEM PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_Y);//HEALTHINESS OF BLOWER SYSTEM PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_B);//HEALTHINESS OF BLOWER SYSTEM PHASE B
                tb.setClickable(true);

                EditText ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_R); //VOLTAGE OF AHU SWITCHBOARD PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_Y);//VOLTAGE OF AHU SWITCHBOARD PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_B);//VOLTAGE OF AHU SWITCHBOARD PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_R);//CURRENT OF AHU SWITCHBOARD PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_Y);//CURRENT OF AHU SWITCHBOARD PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_B);//CURRENT OF AHU SWITCHBOARD PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_R);//CURRENT OF BLOWER MOTOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_Y);//CURRENT OF BLOWER MOTOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_B);//CURRENT OF BLOWER MOTOR PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_R);//HEALTHINESS OF AHU PUMP 1 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_Y);//HEALTHINESS OF AHU PUMP 1 PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_B);//HEALTHINESS OF AHU PUMP 1 PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_R);//HEALTHINESS OF AHU PUMP 2 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_Y);//HEALTHINESS OF AHU PUMP 2 PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_B);//HEALTHINESS OF AHU PUMP 2 PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_R);//HEALTHINESS OF PAC SYSTEM PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_Y);//HEALTHINESS OF PAC SYSTEM PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_B);//HEALTHINESS OF PAC SYSTEM PHASE B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_R);//VOLTAGE OF PAC SWITCHYARD PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_Y);//VOLTAGE OF PAC SWITCHYARD PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_B);//VOLTAGE OF PAC SWITCHYARD PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_R);//CURRENT OF PAC SWITCHYARD PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_Y);//CURRENT OF PAC SWITCHYARD PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_B);//CURRENT OF PAC SWITCHYARD PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_R);//CURRENT OF PAC 1 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_Y);//CURRENT OF PAC 1 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_B);//CURRENT OF PAC 1 PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_R);//CURRENT OF PAC 2 PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_Y);//CURRENT OF PAC 2 PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_B);//CURRENT OF PAC 2 PHASE B
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_R);//WATER LEAKAGE FROM PAC COOLING PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_Y);//WATER LEAKAGE FROM PAC COOLING PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_B);//WATER LEAKAGE FROM PAC COOLING PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_R);//WATER LEAKAGE FROM AHU BLOWER PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_Y);//WATER LEAKAGE FROM AHU BLOWER PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_B);//WATER LEAKAGE FROM AHU BLOWER PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_R);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_Y);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_B);//HEALTHINESS OF COOLING TOWER FAN 1 PHASE B
                tb.setClickable(true);


                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_R);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_Y);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_B);//HEALTHINESS OF COOLING TOWER FAN 2 PHASE B
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_R);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_Y);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_B);//HEALTHINESS OF PAC CONDENSER 1 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_R);//HEALTHINESS OF PAC CONDENSER 2 PHASE R
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_Y);//HEALTHINESS OF PAC CONDENSER 2 PHASE Y
                tb.setClickable(true);

                tb = (ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_B);//HEALTHINESS OF PAC CONDENSER 2 PHASE B
                tb.setClickable(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_R);//REMARKS IF ANY FOR PHASE R
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_Y);//REMARKS IF ANY FOR PHASE Y
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_B);//REMARKS IF ANY FOR PHASE B
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VERIFIED);//VERIFIED BY
                ed.setEnabled(true);
            }
        });
        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///////////////////////////-----------R VALUES----------///////////////////////////

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pac_ahu_db"); // tablename

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
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values
                sb.append("'");

                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_R)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_R)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values







                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_R)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                String query = sb.toString();

                ConnectionClass object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();





///////////////////////////////////////////-----------Y VALUES----------///////////////////////////

                sb=new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pac_ahu_db"); // tablename

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
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values
                sb.append("'");

                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_Y)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_Y)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_Y)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VERIFIED)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");

                sb.append(");"); // Close

                // Call Connection Class for Offline SQLite DataBase
                // Store Query created as a String in DataBase
                query = sb.toString();

                object = new ConnectionClass();
                object.execute(query);

                //Add ProgressBar to check if Query executed or not
                //finish();




///////////////////////////////////////////-----------B VALUES----------///////////////////////////


                sb=new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_others_pac_ahu_db"); // tablename

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
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_BLOWER_SYSTEM_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_AHU_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_AHU_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_BLOWER_AHU_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values
                sb.append("'");

                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_1_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_AHU_PUMP_2_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTHINESS_OF_PAC_SYSTEM_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values



                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VOLTAGE_PAC_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_SYSTEM_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_1_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_CURRENT_PAC_2_B)).getText().toString() );  //LA LEAKAGE B

                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_PAC_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_WATER_LEAKAGE_FROM_AHU_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_1_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_COOLING_FAN_2_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_1_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_OTHER_PAC_AHU_HEALTH_PAC_CONDENSER_2_B)).getText().toString() );  //FAN STATUS
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_REMARKS_B)).getText().toString() );  //LA LEAKAGE B
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_OTHER_PAC_AHU_VERIFIED)).getText().toString() );  //LA LEAKAGE B
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
