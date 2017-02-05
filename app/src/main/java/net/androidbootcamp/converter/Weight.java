package net.androidbootcamp.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {

    double weightEntered;
    double lbs2Kilo = 0.453592;
    double result;
    double Kilo2lbs = 2.20462;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        final EditText weight = (EditText)findViewById(R.id.txtDescrp);
        final CheckBox P2K = (CheckBox) findViewById(R.id.chklbs2kg);
        final CheckBox K2P = (CheckBox)findViewById(R.id.chkkg2lbs);
        final Button convert = (Button)findViewById(R.id.btnConvert);
        final TextView answer = (TextView)findViewById(R.id.txtDescrp);

        Button button3 = (Button) findViewById(R.id.btnHome);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Weight.this, MainActivity.class));

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weightEntered = Double.parseDouble(weight.getText().toString());
                if (P2K.isChecked()) {
                    result = weightEntered * Kilo2lbs;
                    answer.setText((int) result);
                }
                if (K2P.isChecked()) {
                    result = weightEntered * lbs2Kilo;
                    answer.setText((int) result);
                }
            }
        });
    }
});}}
