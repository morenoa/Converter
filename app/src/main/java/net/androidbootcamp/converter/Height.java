package net.androidbootcamp.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Height extends AppCompatActivity {
    double lengthEntered;
    double METER = 0.3048;
    double result;
    double FEET = 3.28084;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
        final EditText length = (EditText)findViewById(R.id.txtDescrp);
        final CheckBox F2M = (CheckBox) findViewById(R.id.chkF2M);
        final CheckBox M2F = (CheckBox)findViewById(R.id.chkm2f);
        final Button convert = (Button)findViewById(R.id.btnConvert);
        final TextView answer = (TextView)findViewById(R.id.txtDescrp);

        Button button3 = (Button) findViewById(R.id.btnHome);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Height.this, MainActivity.class));

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lengthEntered = Double.parseDouble(length.getText().toString());
                if (F2M.isChecked()) {
                    result = lengthEntered * METER;
                    answer.setText((int) result);
                }
                if (M2F.isChecked()){
                    result =  lengthEntered * FEET;
                    answer.setText((int) result);
                }
            }
        });
    }
});}}
