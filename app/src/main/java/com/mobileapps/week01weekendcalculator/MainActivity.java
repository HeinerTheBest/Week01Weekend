package com.mobileapps.week01weekendcalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public Context context;
    public TextView tvOperation, tvPreResult;
    String temp = "0";
    double result = 0;
    int opc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        tvOperation = findViewById(R.id.tvOperation);
        tvPreResult = findViewById(R.id.tvPreResult);
    }


    public void pushNumber(View view)
    {
        if(opc == 99)
        {
            tvOperation.setText("");
            opc = 0;
        }

        switch (view.getId())
        {
            case R.id.btn0:
                tvOperation.append("0");
                temp+="0";
                break;

            case R.id.btn1:
                tvOperation.append("1");
                temp+="1";
                break;

            case R.id.btn2:
                tvOperation.append("2");
                temp+="2";
                break;

            case R.id.btn3:
                tvOperation.append("3");
                temp+="3";
                break;

            case R.id.btn4:
                tvOperation.append("4");
                temp+="4";
                break;

            case R.id.btn5:
                tvOperation.append("5");
                temp+="5";
                break;

            case R.id.btn6:
                tvOperation.append("6");
                temp+="6";
                break;

            case R.id.btn7:
                tvOperation.append("7");
                temp+="7";
                break;

            case R.id.btn8:
                tvOperation.append("8");
                temp+="8";
                break;

            case R.id.btn9:
                tvOperation.append("9");
                temp+="9";
                break;

            case R.id.btnDecimal:
                tvOperation.append(".");
                temp+=".";
                break;

            case R.id.btnClean:
                tvOperation.setText("0");
                temp="0";
                tvPreResult.setText("0");
                break;

            case R.id.btnPi:
                tvOperation.append("π");
                temp+=String.valueOf(Math.PI);
                break;

            case R.id.btnE:
                tvOperation.append("E");
                temp+=String.valueOf(Math.E);
                break;

            case R.id.btnRandom:
                tvOperation.append("Number of tenths");
                temp+=String.valueOf(Math.random());
                break;
        }
    }

    public void plus(View view)
    {
        chechOperation();
        tvOperation.append("+");
        opc = 1;
        tvPreResult.setText(String.valueOf(result));
    }

    public void subtract(View view)
    {
        chechOperation();
        tvOperation.append("-");
        opc = 2;
        tvPreResult.setText(String.valueOf(result));
    }

    public void divide(View view)
    {
        chechOperation();
        tvOperation.append("/");
        opc = 3;
        tvPreResult.setText(String.valueOf(result));
    }

    public void multiply(View view)
    {
        chechOperation();
        tvOperation.append("*");
        opc = 4;
        tvPreResult.setText(String.valueOf(result));
    }

    public void sqrt(View view)
    {
        chechOperation();
        tvOperation.append("√(");
        opc = 5;
        tvPreResult.setText(String.valueOf(result));
    }

    public void sin(View view)
    {
        chechOperation();
        tvOperation.append("sin(");
        opc = 6;
        tvPreResult.setText(String.valueOf(result));
    }

    public void cos(View view)
    {
        chechOperation();
        tvOperation.append("cos(");
        opc = 7;
        tvPreResult.setText(String.valueOf(result));
    }

    public void tan(View view)
    {
        chechOperation();
        tvOperation.append("tan(");
        opc = 8;
        tvPreResult.setText(String.valueOf(result));
    }

    public void log(View view)
    {
        chechOperation();
        tvOperation.append("log(");
        opc = 9;
        tvPreResult.setText(String.valueOf(result));
    }

    public void xx(View view)
    {

        tvOperation.append("^(2)");
        opc = 10;
        chechOperation();
        tvPreResult.setText(String.valueOf(result));
    }


    public void answer(View view)
    {
        chechOperation();
        tvOperation.setText(String.valueOf(result));
        opc = 99;
        tvPreResult.setText(String.valueOf(result));
    }

    public void chechOperation()
    {
        if(!temp.equals("")) {
            switch (opc) {
                case 99:
                    result = Double.parseDouble(temp);
                    break;
                case 0:
                    result = Double.parseDouble(temp);
                    break;
                case 1: //plus
                    result = result + Double.parseDouble(temp);
                    break;
                case 2: //subtract
                    result = result - Double.parseDouble(temp);
                    break;
                case 3: //Divide
                    result = result / Double.parseDouble(temp);
                    break;
                case 4://Multiply
                    result = result * Double.parseDouble(temp);
                    break;
                case 5://Sqrt
                    result = result + Math.sqrt(Double.parseDouble(temp));
                    break;
                case 6://Sin
                    result = result + Math.sin(Double.parseDouble(temp));
                    break;
                case 7://Cos
                    result = result + Math.cos(Double.parseDouble(temp));
                    break;
                case 8://tan
                    result = result + Math.tan(Double.parseDouble(temp));
                    break;
                case 9://Log
                    result = result + Math.log(Double.parseDouble(temp));
                    break;
                case 10://Exp2
                    result = result + Math.pow(Double.parseDouble(temp),2);
                    break;
            }
        }
        temp = "";
    }
}
