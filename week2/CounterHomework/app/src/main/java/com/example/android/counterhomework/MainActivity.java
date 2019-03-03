package com.example.android.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mCount = 0;
    TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countView = (TextView)findViewById(R.id.mCount);

        if(savedInstanceState != null)
        {
            mCount = savedInstanceState.getInt("mCount");
            countView.setText("" + mCount);
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("mCount", mCount);
    }

    public void countUp(View view) {
        mCount++;
        countView.setText("" + mCount);
    }
}
