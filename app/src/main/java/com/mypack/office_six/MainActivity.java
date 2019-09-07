package com.mypack.office_six;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button1){
            startActivity(new Intent(getApplicationContext(),Button1Activity.class));
        }else if(view.getId()==R.id.button2){
            startActivity(new Intent(getApplicationContext(),Button2Activity.class));
        }else if(view.getId()==R.id.button3){
            startActivity(new Intent(getApplicationContext(),Button3Activity.class));
        }else if(view.getId()==R.id.button4){
            startActivity(new Intent(getApplicationContext(),Button4Activity.class));
        }else if(view.getId()==R.id.button5){
            startActivity(new Intent(getApplicationContext(),Button5Activity.class));
        }else if(view.getId()==R.id.button6){
            startActivity(new Intent(getApplicationContext(),Button6Activity.class));
        }

    }
}
