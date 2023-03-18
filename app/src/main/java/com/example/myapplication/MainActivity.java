package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends MyStandardActivity_V1{
    Button bu1;
    Button Exit;
    TextView tv1;
//-----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        show_Screen_2();
        exit_the_program();

    }
    //-----------------------------------------------------------------------------------------------
    @Override
    public void mySetContentView() {
        setContentView(R.layout.activity_main);
    }
    //-----------------------------------------------------------------------------------------------
    @Override
    public void initialise_Views() {
    bu1=findViewById(R.id.bu1);
    tv1=findViewById(R.id.tv1);
    Exit=findViewById(R.id.Bu_Exit);
    }

    //-----------------------------------------------------------------------------------------------
    public void show_Screen_2(){

    bu1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent showScreen2=new Intent(thisActivityContext,MainActivity2.class);
            startActivity(showScreen2);
        }
    });
    }

    //-----------------------------------------------------------------------------------------------
    public void exit_the_program(){
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}