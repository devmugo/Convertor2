package com.example.convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      Button conv;
      TextView answer;
      RadioGroup select;
      EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //register the button
        conv = (Button)findViewById(R.id.Conv_button);

        //setting on click listener
        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    select = (RadioGroup) findViewById(R.id.radio_group);
                    int selectedbutton = select.getCheckedRadioButtonId();


                    input = (EditText) findViewById(R.id.input);
                    int in = Integer.parseInt(input.getText().toString());
                    if (selectedbutton == 2131165230) {

                        double din = (double) in;


                        String output = String.format("%.2f", (din *25.4));
                        answer = (TextView) findViewById(R.id.answer);
                        answer.setText(String.format("" + output + " MilliMetres"));


                    } else {
                        String output = String.format("%.2f", (in / 25.4));
                        answer = (TextView) findViewById(R.id.answer);
                        answer.setText(String.format("" + output + " Inches"));

                    }
                }
                catch( Exception e){

                    answer = (TextView) findViewById(R.id.answer);
                    answer.setText(" Please enter an input ");

                }







            }
        });

    }
}
