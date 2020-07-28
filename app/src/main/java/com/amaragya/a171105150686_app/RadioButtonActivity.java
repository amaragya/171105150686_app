package com.amaragya.a171105150686_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button btnSubmit;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.makananFavorit);
        btnSubmit = findViewById(R.id.saveRadioButtonActivity);
        
        
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                Toast.makeText(RadioButtonActivity.this, selectedRadioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
