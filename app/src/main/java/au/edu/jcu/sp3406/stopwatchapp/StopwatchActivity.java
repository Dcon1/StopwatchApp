package au.edu.jcu.sp3406.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stopwatch Stopwatch = new Stopwatch();
    }

    public void enableStopwatch() {
        final boolean isRunning = true;
        final Handler handler = new Handler();
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

private void disableStopwatch() {
    isRunning = false;
}
