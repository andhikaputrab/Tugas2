package com.apps.andhika.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    Developed by 10117167 - Andhika Putra Bagaskara - IF5
    on Tuesday, April 15 2020
 */

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_verify)
    void verify(){
        Intent intent = new Intent(this, verify_account.class);
        startActivity(intent);
    }
}
