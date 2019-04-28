package com.example.android.a016currencyconverter;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button euro, dollar , pound, yen , bitcoin , dinar , ausdollar, candollar , ruble ;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        bitcoin = findViewById(R.id.bitcoin);
        dinar = findViewById(R.id.dinar);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        ruble = findViewById(R.id.ruble);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

    euro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String z = editText.getText().toString();

            if (TextUtils.isEmpty(z))
            {
                editText.setError("empty input");
            }
            else{
                double n,k ;
                textView.setText(null);

                n = Double.parseDouble(z);
                k = n * 0.012;
                textView.setText(""+k);
            }

            }
    });

    dollar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String z = editText.getText().toString();
            if(TextUtils.isEmpty(z)) {
                textView.setError("empty input");
            }
            else {
            double n,k;
                textView.setText(null);

            n = Double.parseDouble(z);

            k = n * 0.014;
            textView.setText(""+k);

            }
            }

    });

    pound.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String z = editText.getText().toString();

            if(TextUtils.isEmpty(z))
            {
                editText.setError("empty space bro");
            }
            else
            {
                double n,k;
                textView.setText(null);

                        n = Double.parseDouble(z);
                k = n* 0.022;
                textView.setText(""+k);
            }
        }
    });


    yen.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String z = editText.getText().toString();

            if (TextUtils.isEmpty(z)) {

                editText.setError("empty input");
            } else {
                double n, k;
                textView.setText(null);

                n = Double.parseDouble(z);
                k = n * 1.58;
                textView.setText("" + k);

            }
        }

        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("empty input");
                } else {
                    double n, k;
                    textView.setText(null);

                    n = Double.parseDouble(z);
                    k = n * 0.0000037;
                    textView.setText("" + k);

                }
            }

        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("empty input");
                } else {
                    double n, k;
                    textView.setText(null);

                    n = Double.parseDouble(z);
                    k = n * 0.0043;
                    textView.setText("" + k);

                }
            }

        });

    ausdollar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String z = editText.getText().toString();

            if(TextUtils.isEmpty(z))
            {
                editText.setError("empty inputs");
            }
            else
            {
                double n , k;
                textView.setText(null);

                n = Double.parseDouble(z);

                k = n * 0.020 ;
                textView.setText(""+k);
            }
        }
    });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("empty inputs");
                }
                else
                {
                    double n , k;
                    textView.setText(null);

                    n = Double.parseDouble(z);

                    k = n * 0.019 ;
                    textView.setText(""+k);
                }
            }
        });


        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("empty inputs");
                }
                else
                {
                    double n , k;
                    textView.setText(null);

                    n = Double.parseDouble(z);

                    k = n * 0.93 ;
                    textView.setText(""+k);
                }
            }
        });


    }
}







