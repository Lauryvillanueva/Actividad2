package com.uninorte.myapplication2;

import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void P1 (View  view) {
        Intent i = new Intent(this,Main1Activity.class);
        i.putExtra("Valor",new String());
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==1){
           if (resultCode==RESULT_OK){
               String result = data.getStringExtra("Valor");
               EditText tv = (EditText) findViewById(R.id.editText4);
               tv.setText(result+"");
            }

    }}

    public void P2 (View  view) {
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("Valor",new String());
        startActivityForResult(i,1);
    }

    public void P3 (View  view) {
        Intent i = new Intent(this,Main3Activity.class);
        i.putExtra("Valor",new String());
        startActivityForResult(i,1);
    }

    public void P4 (View  view) {
        Intent i = new Intent(this,Main4Activity.class);
        i.putExtra("Valor",new String());
        startActivityForResult(i,1);
    }
}
