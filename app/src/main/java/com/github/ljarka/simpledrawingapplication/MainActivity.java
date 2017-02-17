package com.github.ljarka.simpledrawingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SimpleDrawingView simpleDrawingView = (SimpleDrawingView) findViewById(R.id.drawing_view);

        Button clearButton = (Button) findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                simpleDrawingView.clear();
            }
        });
    }
}
