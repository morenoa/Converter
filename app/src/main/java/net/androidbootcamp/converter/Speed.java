package net.androidbootcamp.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends AppCompatActivity {

    double speedEntered;
    double MPH = 0.621371;
    double result;
    double KPH = 1.60934;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        final EditText speed = (EditText)findViewById(R.id.txtDescrp);
        final CheckBox M2K = (CheckBox) findViewById(R.id.chkmph2kph);
        final CheckBox K2M = (CheckBox)findViewById(R.id.chkkph2mph);
        final Button convert = (Button)findViewById(R.id.btnConvert);
        final TextView answer = (TextView)findViewById(R.id.txtDescrp);

        Button button3 = (Button) findViewById(R.id.btnHome);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Speed.this, MainActivity.class));

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speedEntered = Double.parseDouble(speed.getText().toString());
                if (M2K.isChecked()) {
                    result = speedEntered * KPH;
                    answer.setText((int) result);
                }
                if (K2M.isChecked()) {
                    result = speedEntered * MPH;
                    answer.setText((int) result);
                }
            }
        });
    }
});}}
