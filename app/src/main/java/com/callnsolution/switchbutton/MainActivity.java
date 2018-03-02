package com.callnsolution.switchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeSwitchState(View view) {

        boolean checked = ((Switch) view).isChecked();

        if (checked) {

            Toast.makeText(this, "Switch On", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, "Switch Off", Toast.LENGTH_LONG).show();

        }

    }
}