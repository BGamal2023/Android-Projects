package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MyStandardActivity_V1 extends AppCompatActivity {
    Activity thisActivity;
    Context thisActivityContext;
    Context thisApplicationContext;
//--------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mySetContentView();
        initialise_essential_variables();
        initialise_Views();

    }
    //------------------------------------------------------------------------------------------------------------------------

    public void initialise_essential_variables(){
        thisActivity=this;
        thisActivityContext=this;

        thisApplicationContext=this.getApplicationContext();
    }

    //------------------------------------------------------------------------------------------------------
    public abstract void mySetContentView();

    public abstract void initialise_Views();
    //--------------------------------------------------------------------
}
