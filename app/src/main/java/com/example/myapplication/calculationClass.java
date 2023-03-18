package com.example.myapplication;

public class calculationClass extends generalVariables{

    // calculate hours mony value
    //
    // the day amout over time
    // calculate the night amount over time
    // calculate  the amount of yearly bonus
    // calculate the audit bounus

    //----------------------------------( All Variables )-------------------------------------------------------------------------

    //--------user inputs variables -----
    double grossSalary;
    double no_of_day_overtime_hours;
    double no_of_night_overtime_hours;
    double no_of_months_for_yearly_bonus;
    double percentage_of_audit_bonus;
    double manager_bonus;
    double deduction_amount;

    //---------- calculated variables-----

    double hour_value;
    double day_value;
    double mony_value_of_all_day_hours_over_time;
    double mony_value_of_all_night_hours_over_time;
    double mony_value_of_yearly_bouns;
    double mony_value_of_audit_bonus;
    double mony_value_of_deduction;
    double result_salary;

//----------------------------------(  Methods  )----------------------------------------------------------------------


    public double get_day_value(){
        day_value=grossSalary/30;
        return day_value;
    }
    //-----------------------------------------------------------------------------------
    public double get_the_Hour_value(){
        hour_value=day_value/8;
        return hour_value;
    }


    public void calculate_basic_calculation(){
        get_day_value();
        get_the_Hour_value();
    }
    //-----------------------------------------------------------------------------------
    public double get_money_value_of_all_day_hours_overtime(){
    mony_value_of_all_day_hours_over_time =(no_of_day_overtime_hours) * (hour_value* percentage_day_hour_overtime);
      return mony_value_of_all_day_hours_over_time;

    }
    //-----------------------------------------------------------------------------------
    public double get_money_value_of_all_night_hours_overtime(){
        mony_value_of_all_night_hours_over_time=
                (no_of_night_overtime_hours)*
                        (hour_value)*
                        (percentage_night_hour_overtime);

        return mony_value_of_all_night_hours_over_time;
    }
    //-----------------------------------------------------------------------------------
    public double get_money_value_of_yearly_bonus(){
    mony_value_of_yearly_bouns=
            (no_of_months_for_yearly_bonus)*grossSalary;
    return mony_value_of_yearly_bouns;
    }
    //-----------------------------------------------------------------------------------
    public double get_money_value_of_audit_bonus(){

        mony_value_of_audit_bonus= (percentage_of_audit_bonus/100)* grossSalary*12;
        return mony_value_of_audit_bonus;
    }
    //-----------------------------------------------------------------------------------

    public double get_result_salary(){
        grossSalary=
                grossSalary +
                        mony_value_of_all_day_hours_over_time +
                        mony_value_of_all_night_hours_over_time +
                        manager_bonus+
                        mony_value_of_yearly_bouns +
                        mony_value_of_audit_bonus -
                        deduction_amount;

        result_salary =(grossSalary)-(grossSalary*percentage_tax_deduction);

        return result_salary;
    }


}
