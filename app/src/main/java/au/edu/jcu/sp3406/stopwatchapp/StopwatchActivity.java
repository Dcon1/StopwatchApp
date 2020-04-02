package au.edu.jcu.sp3406.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {
    Stopwatch stopwatch;
    Boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enableStopwatch() {
        boolean isRunning = false;
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (isRunning) {
                    stopwatch.tick();
                    TextView textView = findViewById(R.id.text);
                    textView.setText(stopwatch.toString());
                    handler.postDelayed(this, 1000);
                }
            }
        });
    }

    public void buttonClicked(View view) {
        isRunning = true;
    }
}