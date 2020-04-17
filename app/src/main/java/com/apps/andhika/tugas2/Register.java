package com.apps.andhika.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    Developed by 10117167 - Andhika Putra Bagaskara - IF5
    on Tuesday, April 14 2020
 */

public class Register extends AppCompatActivity {
    @BindView(R.id.toolbar_register)
    Toolbar toolbar_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar_register);
        toolbar_register.setLogoDescription(getResources().getString(R.string.edt_register));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OnClick(R.id.btn_register)
    void register() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, verify.class);
        startActivity(intent);
    }
}