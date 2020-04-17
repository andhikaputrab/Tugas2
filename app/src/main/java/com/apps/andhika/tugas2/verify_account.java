package com.apps.andhika.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class verify_account extends AppCompatActivity {

    @BindView(R.id.txtResend)
    TextView txtResend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        ButterKnife.bind(this);

        txtResend.setText(Html.fromHtml(getString(R.string.txtResend)));
    }

    @OnClick(R.id.btn_send)
    void send(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
