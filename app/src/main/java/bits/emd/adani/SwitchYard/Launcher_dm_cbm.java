package bits.emd.adani.SwitchYard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import bits.emd.adani.SwitchYard.dm_masterDetail.ItemListActivity;
import bits.emd.adani.SwitchYard.cbm_masterDetail.cbmListActivity;

public class Launcher_dm_cbm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_dm_cbm);

        Button dm = (Button)findViewById(R.id.DM);
        Button cbm = (Button)findViewById(R.id.CBM);

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Daily Monitoring",Toast.LENGTH_LONG);

                Intent i = new Intent(getApplicationContext(),ItemListActivity.class);
                startActivity(i);

            }
        });

        cbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Condition Based Monitoring",Toast.LENGTH_LONG);

                Intent i = new Intent(getApplicationContext(),cbmListActivity.class);
                startActivity(i);

            }
        });



    }
}
