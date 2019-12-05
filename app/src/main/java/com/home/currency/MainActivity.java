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
                    .setTitle(R.string.problem)
                    .setMessage(R.string.please_enter_ntd)
                    .setPositiveButton(R.string.ok, null)
                    .show();
        } else {
            float fNtd = Float.parseFloat(strNtd);
            float fCurrency = (float) (fNtd / 30.9);
            new AlertDialog.Builder(this)
                    .setTitle(R.string.result)
                    .setMessage(getString(R.string.usd_is) + fCurrency)
                    .setPositiveButton(R.string.ok, null)
                    .show();
        }
    }
}
