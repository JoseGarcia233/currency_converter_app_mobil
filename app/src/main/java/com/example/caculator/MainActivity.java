package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button Num1;
    private Button Num2;
    private Button Num3;
    private Button Num4;
    private Button Num5;
    private Button Num6;
    private Button Num7;
    private Button Num8;
    private Button Num9;
    private Button Num0;
    private Button CL;
    private Button point;
    private Button dollar;
    private Button peso;
    private Button acp;


    private TextView res;
    private TextView UserNa;
    private TextView conection;
    private EditText editTextTextPersonName3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double amount = 54.15;

        UserNa = findViewById(R.id.UserNa);
        res = findViewById(R.id.res);
        conection = findViewById(R.id.NumView);
        // acp.setEnabled(true);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);

        Num1 = findViewById(R.id.one);
        Num1.setEnabled(false);
        Num1.setOnClickListener(view -> conection.append("1"));


        Num2 = findViewById(R.id.two);
        Num2.setEnabled(false);
        Num2.setOnClickListener(view -> conection.append("2"));


        Num3 = findViewById(R.id.three);
        Num3.setEnabled(false);
        Num3.setOnClickListener(view -> conection.append("3"));


        Num4 = findViewById(R.id.four);
        Num4.setEnabled(false);
        Num4.setOnClickListener(view -> conection.append("4"));


        Num5 = findViewById(R.id.five);
        Num5.setEnabled(false);
        Num5.setOnClickListener(view -> conection.append("5"));


        Num6 = findViewById(R.id.six);
        Num6.setEnabled(false);
        Num6.setOnClickListener(view -> conection.append("6"));


        Num7 = findViewById(R.id.seven);
        Num7.setEnabled(false);
        Num7.setOnClickListener(view -> conection.append("7"));

        Num8 = findViewById(R.id.eight);
        Num8.setEnabled(false);
        Num8.setOnClickListener(view -> conection.append("8"));


        Num9 = findViewById(R.id.nine);
        Num9.setEnabled(false);
        Num9.setOnClickListener(view -> conection.append("9"));

        Num0 = findViewById(R.id.zero);
        Num0.setEnabled(false);
        Num0.setOnClickListener(view -> conection.append("0"));


        point = findViewById(R.id.pun);
        point.setEnabled(false);
        point.setOnClickListener(view -> conection.append("."));


        CL = findViewById(R.id.cle);
        CL.setEnabled(false);
        CL.setOnClickListener(view -> {
            String text = conection.getText().toString();
            conection.setText(text.substring(0, text.length() - 1));
        });

        peso = findViewById(R.id.peso);
        peso.setEnabled(false);
        peso.setOnClickListener(view -> {
            double r = Double.parseDouble(conection.getText().toString());
            double resD = r / amount;

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String ps = formatter.format(resD);
            System.out.println(ps);

            res.setText(ps);

        });

        dollar = findViewById(R.id.dollar);
        dollar.setEnabled(false);
        dollar.setOnClickListener(view -> {
            double r = Double.parseDouble(conection.getText().toString());
            double resD = r * amount;

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String Dll = formatter.format(resD);
            System.out.println(Dll);

            res.setText(Dll);
        });

        acp = findViewById(R.id.acp);
        acp.setOnClickListener(view -> {
            Editable Nm = editTextTextPersonName3.getText();
            String Sn = Nm.toString();
            if (Sn.equals("")) {
                UserNa.setText("Insert a name please");
            } else {
                UserNa.setText(Nm);
                Num1.setEnabled(true);
                Num2.setEnabled(true);
                Num3.setEnabled(true);
                Num4.setEnabled(true);
                Num5.setEnabled(true);
                Num6.setEnabled(true);
                Num7.setEnabled(true);
                Num8.setEnabled(true);
                Num9.setEnabled(true);
                Num0.setEnabled(true);
                dollar.setEnabled(true);
                peso.setEnabled(true);
                point.setEnabled(true);
                CL.setEnabled(true);
            }
        });


    }

}