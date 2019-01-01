package bits.emd.adani.SwitchYard;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        CountDownTimer cdt = new CountDownTimer(1500,50) {//numberof seconds , number of ticks
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(getApplicationContext(),Launcher_dm_cbm.class);
                startActivity(i);
                finish();
            }
        };

        cdt.start();
    }
}
