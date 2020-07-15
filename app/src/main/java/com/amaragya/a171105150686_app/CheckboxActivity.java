package com.amaragya.a171105150686_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class CheckboxActivity extends AppCompatActivity {

    private Button btnTampil;
    private CheckBox cbPython, cbJava, cbMicrosoft, cbSwift, cbWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        getSupportActionBar().setTitle("Halaman Checkbox");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnTampil = (Button) findViewById(R.id.cb_btn_tampil);
        cbPython = (CheckBox) findViewById(R.id.cb_python);
        cbJava = (CheckBox) findViewById(R.id.cb_java_android);
        cbMicrosoft = (CheckBox) findViewById(R.id.cb_ms);
        cbSwift = (CheckBox) findViewById(R.id.cb_swift);
        cbWeb = (CheckBox) findViewById(R.id.cb_web_programming);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skills = "";

                if (cbPython.isChecked()){
                    skills += cbPython.getText().toString() + "\n";
                }

                if (cbJava.isChecked()){
                    skills += cbJava.getText().toString() + "\n";
                }

                if (cbMicrosoft.isChecked()){
                    skills += cbMicrosoft.getText().toString() + "\n";
                }

                if (cbSwift.isChecked()){
                    skills += cbSwift.getText().toString() + "\n";
                }

                if (cbWeb.isChecked()){
                    skills += cbWeb.getText().toString() + "\n";
                }

                Toast.makeText(CheckboxActivity.this, "Pilihan anda adalah " + skills, Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();

        if (id==android.R.id.home) {
            finish();
        }

        return false;
    }
}
