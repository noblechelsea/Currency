package com.home.currency;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNtd = findViewById(R.id.tv_ntd);
    }

    public void currency(View view) {
        String strNtd = etNtd.getText().toString();
        if (TextUtils.isEmpty(strNtd)) {
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter you NTD amount")
                    .setPositiveButton("OK", null)
                    .show();
        } else {
            float fNtd = Float.parseFloat(strNtd);
            float fCurrency = (float) (fNtd / 30.9);
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD is " + fCurrency)
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}
