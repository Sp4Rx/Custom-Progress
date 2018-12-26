package io.github.sp4rx.customprogress;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyProgressView myProgress = findViewById(R.id.myProgress);

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                myProgress.setProgress(progress);
                progress++;
                if (progress <= 5)
                    new Handler().postDelayed(this, 2000);
                else {
                    Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
