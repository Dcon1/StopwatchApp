package au.edu.jcu.sp3406.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {
    Stopwatch stopwatch = new Stopwatch();
    boolean isRunning;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isRunning = true;
    }

    public void enableStopwatch() {
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
        enableStopwatch();
    }
}