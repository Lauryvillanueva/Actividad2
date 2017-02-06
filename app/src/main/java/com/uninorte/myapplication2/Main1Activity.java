package com.uninorte.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void Back(View view) {
        EditText EditText= (EditText) findViewById(R.id.editText);
        int value = Integer.valueOf(EditText.getText().toString());

        EditText EditText1= (EditText) findViewById(R.id.editText1);
        int value1 = Integer.valueOf(EditText1.getText().toString());

        EditText EditText2= (EditText) findViewById(R.id.editText2);
        int value2 = Integer.valueOf(EditText2.getText().toString());

        double totalvalue= value*0.50+value1*0.25+value2*0.25;


        Intent returnIntent = new Intent();
        returnIntent.putExtra("Valor",String.valueOf(totalvalue));
        setResult(Activity.RESULT_OK,returnIntent);
        finish();


    }

}
