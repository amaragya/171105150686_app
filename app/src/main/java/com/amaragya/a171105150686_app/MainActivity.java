package com.amaragya.a171105150686_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.makeramen.roundedimageview.RoundedImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                openWa();
                            }
                        }).setActionTextColor(getResources().getColor(R.color.colorPrimary)).show();
            }
        });

        RoundedImageView circleImage = findViewById(R.id.foto);

        Glide.with(this).load("https://img.tek.id/img/content/2020/02/21/25865/spongebob-squarepants-bakal-punya-serial-prekuel-ADx4IQMmUT.jpg").dontAnimate().into(circleImage);
    }


    public void openWa(){
        String url = "https://api.whatsapp.com/send?phone=6289602783380";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickBtnCheckbox(View view) {
        goAnotherPage(CheckboxActivity.class);
    }

    public void onClickBtnRadio(View view) {
        goAnotherPage(RadioButtonActivity.class);
    }

    public void onClickBtnFormulir(View view) {
        Toast.makeText(this, "Oke mantap 2", Toast.LENGTH_SHORT).show();
    }

    public void onClickBtnKalkulator(View view) {
        Toast.makeText(this, "Oke mantap 3", Toast.LENGTH_SHORT).show();
    }

    public void onClickBtnLogout(View view) {
        Toast.makeText(this, "Oke mantap 4", Toast.LENGTH_SHORT).show();
    }


    private void goAnotherPage(Class page){
        Intent pageIntent = new Intent(this, page);
        startActivity(pageIntent);
    }

}
