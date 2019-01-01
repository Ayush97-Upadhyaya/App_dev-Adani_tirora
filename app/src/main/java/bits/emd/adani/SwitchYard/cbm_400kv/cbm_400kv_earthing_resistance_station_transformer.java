package bits.emd.adani.SwitchYard.cbm_400kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import bits.emd.adani.SwitchYard.R;

public class cbm_400kv_earthing_resistance_station_transformer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbm_400kv_earthing_resistance_station_transformer);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_confirm_btn);

        final RadioButton st1 =(RadioButton)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIO_BUTTON1);
        final RadioButton st2 =(RadioButton)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIO_BUTTON2);
        final RadioButton st3 =(RadioButton)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIO_BUTTON3);
        final RadioButton st4 =(RadioButton)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIO_BUTTON4);
        final RadioButton st5 =(RadioButton)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIO_BUTTON5);

        final LinearLayout linearLayout_st4 = (LinearLayout) findViewById(R.id.CBM_EARTH_RESISTANCE_400KV_ST_4_EP);
        final LinearLayout linearLayout_st5 = (LinearLayout) findViewById(R.id.CBM_EARTH_RESISTANCE_400KV_ST_5_EP);

        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_st4.setVisibility(View.GONE);
                linearLayout_st5.setVisibility(View.GONE);
            }
        });

        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_st4.setVisibility(View.GONE);
                linearLayout_st5.setVisibility(View.GONE);
            }
        });

        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_st4.setVisibility(View.GONE);
                linearLayout_st5.setVisibility(View.GONE);
            }
        });

        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_st4.setVisibility(View.VISIBLE);
                linearLayout_st5.setVisibility(View.GONE);
            }
        });

        st5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_st4.setVisibility(View.GONE);
                linearLayout_st5.setVisibility(View.VISIBLE);
            }
        });

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup not clickable
                {
                    rg.getChildAt(i).setClickable(false);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_R_PHASE);//STATION TRANSFORMER R Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_Y_PHASE);//STATION TRANSFORMER Y Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_B_PHASE);//STATION TRANSFORMER B Phase
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_53);//EP 53
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_54);//EP 54
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_55);//EP 55
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_56);//EP 56
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_57);//EP 57
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_58);//EP 58
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_59);//EP 59
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_60);//EP 60
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_61);//EP 61
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_62);//EP 62
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_63);//EP 63
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_64);//EP 64
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_VERIFIED_BY);//VERIFIED BY
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                final RadioGroup rg = (RadioGroup)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_ST_RADIOGROUP);
                for(int i=0; i<rg.getChildCount(); i++)             // radiogroup clickable
                {
                    rg.getChildAt(i).setClickable(true);

                }

                EditText ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_R_PHASE);//STATION TRANSFORMER R Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_Y_PHASE);//STATION TRANSFORMER Y Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_B_PHASE);//STATION TRANSFORMER B Phase
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_53);//EP 53
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_54);//EP 54
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_55);//EP 55
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_56);//EP 56
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_57);//EP 57
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_58);//EP 58
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_59);//EP 59
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_60);//EP 60
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_61);//EP 61
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_62);//EP 62
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_63);//EP 63
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_EP_64);//EP 64
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_REMARKS_IF_ANY);//REMARKS IF ANY
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.CBM_400KV_EARTH_RESISTANCE_STATION_TRANSFORMER_VERIFIED_BY);//VERIFIED BY
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
