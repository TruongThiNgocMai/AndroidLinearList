package com.example.breakline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countries = new String[]{"Vietnamese","Korea","Chinese","Cambodia","Philippin","Japanese"};
        LinearLayout main_linear = findViewById(R.id.Linear);
        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);

        for(int i = 0; i< countries.length; i++){
            TextView tv = new TextView(MainActivity.this);
            tv.setText(" "+countries[i]);
            tv.setLayoutParams(params);

            Button btn = new Button(MainActivity.this);
            btn.setText("+");

            LinearLayout ln = new LinearLayout(MainActivity.this);
            ln.setOrientation(LinearLayout.HORIZONTAL);
            ln.addView(tv);
            ln.addView(btn);

            main_linear.addView(ln);
        }


    }
}

