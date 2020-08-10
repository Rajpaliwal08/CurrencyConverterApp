package com.rajpaliwal.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {


    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.013;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                   // Formatter formatter = new Formatter();
                    k = n * 0.011;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.014;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.57;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0044;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0000014;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.91;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.021;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });


        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {

                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.019;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");  // "#.00" only 2 values show after decimal.
                    textView.setText("" + numberFormat.format(k));
                }

            }
        });



    }
}
