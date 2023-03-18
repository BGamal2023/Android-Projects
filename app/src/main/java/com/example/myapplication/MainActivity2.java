package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends MyStandardActivity_V1 {


    calculationClass obj_of_calcuClass ;
    Button back_to_main_page;
    Button bu_calculate;
    Button bu_clear;
    EditText et1_gross_salary;
    EditText et2_no_of_daily_hours;
    EditText et3_no_of_night_hours;
    EditText et4_manager_bonus;
    EditText et5_no_of_months_for_yearly_bonus;
    EditText et6_audit_bonus;
    EditText et7_deduction_amount;
    EditText et8_result_salay;


    //-------------------------------------------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        calculate_the_result_salary();
        clear_the_activity_for_new_input();
        bakc_to_main_page();
    }

    //-------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void mySetContentView() {
        setContentView(R.layout.activity_main2);
    }

    //-------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void initialise_Views() {
        back_to_main_page = findViewById(R.id.bu_back);
        bu_calculate=findViewById(R.id.bu_calculate);
        bu_clear=findViewById(R.id.bu_clear);
        et1_gross_salary = findViewById(R.id.et1);
        et2_no_of_daily_hours = findViewById(R.id.et2);
        et3_no_of_night_hours = findViewById(R.id.et3);
        et4_manager_bonus = findViewById(R.id.et4);
        et5_no_of_months_for_yearly_bonus = findViewById(R.id.et5);
        et6_audit_bonus = findViewById(R.id.et6);
        et7_deduction_amount = findViewById(R.id.et7);
        et8_result_salay=findViewById(R.id.et8);




    }

    //-------------------------------------------------------------------------------------------------------------------------------
    public void bakc_to_main_page() {
        back_to_main_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_to_the_main_page = new Intent(thisActivityContext, MainActivity.class);
                startActivity(back_to_the_main_page);
            }
        });
    }

    //-------------------------------------------------------------------------------------------------------------------------------

    public void calculate_the_result_salary(){
        bu_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_inputs_from_the_user();
                show_the_result_salary();
            }
        });
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    public void clear_the_activity_for_new_input(){
        bu_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1_gross_salary.setText("");
                et2_no_of_daily_hours.setText("");
                et3_no_of_night_hours.setText("");
                et4_manager_bonus.setText("");
                et5_no_of_months_for_yearly_bonus.setText("");
                et6_audit_bonus.setText("");
                et7_deduction_amount.setText("");
                et8_result_salay.setText("");
            }
        });
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    public void get_inputs_from_the_user() {
        obj_of_calcuClass=new calculationClass();
        obj_of_calcuClass.grossSalary=Double.parseDouble(et1_gross_salary.getText().toString());
        obj_of_calcuClass.no_of_day_overtime_hours=Double.parseDouble(et2_no_of_daily_hours.getText().toString());
        obj_of_calcuClass.no_of_night_overtime_hours=Double.parseDouble(et3_no_of_night_hours.getText().toString());
        obj_of_calcuClass.manager_bonus= Double.parseDouble(et4_manager_bonus.getText().toString());
        obj_of_calcuClass.no_of_months_for_yearly_bonus=Double.parseDouble(et5_no_of_months_for_yearly_bonus.getText().toString());
        obj_of_calcuClass.percentage_of_audit_bonus=Double.parseDouble(et6_audit_bonus.getText().toString());
        obj_of_calcuClass.deduction_amount= Double.parseDouble(et7_deduction_amount.getText().toString());
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    public void show_the_result_salary(){


        et8_result_salay.setText(Integer.toString(( (int)obj_of_calcuClass.get_result_salary())));
    }

}