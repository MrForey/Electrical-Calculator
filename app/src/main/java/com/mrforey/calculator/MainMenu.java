package com.mrforey.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void rozetkiActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void lightActivity(View v) {
        Intent intent = new Intent(this, LightPage.class);
        startActivity(intent);
    }

    public void cableActivity(View v) {
        Intent intent = new Intent(this, CablePage.class);
        startActivity(intent);
    }

    public void shtroblenieActivity(View v) {
        Intent intent = new Intent(this, ShtrobleniePage.class);
        startActivity(intent);
    }
    public void podrozetnikiActivity(View v) {
        Intent intent = new Intent(this, SverleniePodrozetnikiPage.class);
        startActivity(intent);
    }

    public void sverlenieStenActivity(View v) {
        Intent intent = new Intent(this, SverlenieStenPage.class);
        startActivity(intent);
    }

    public void montazhActivity(View v) {
        Intent intent = new Intent(this, MontazhPage.class);
        startActivity(intent);
    }

    public void electricalActivity(View v) {
        Intent intent = new Intent(this, ElectricalShield.class);
        startActivity(intent);
    }

    public void automatsActivity(View v) {
        Intent intent = new Intent(this, AutomatsPage.class);
        startActivity(intent);
    }

    public void bitovayaActivity(View v) {
        Intent intent = new Intent(this, BitovayaPage.class);
        startActivity(intent);
    }

    public void derevoActivity(View v) {
        Intent intent = new Intent(this, DerevoPage.class);
        startActivity(intent);
    }

    public void retroActivity(View v) {
        Intent intent = new Intent(this, RetroPage.class);
        startActivity(intent);
    }

    public void montcableActivity(View v) {
        Intent intent = new Intent(this, MontazhCablePage.class);
        startActivity(intent);
    }

    public void zazemlenieActivity(View v) {
        Intent intent = new Intent(this, ZazemleniePage.class);
        startActivity(intent);
    }

    public void dopActivity(View v) {
        Intent intent = new Intent(this, DopWorkPage.class);
        startActivity(intent);
    }

    public void resultPage(View v){
        Intent intent = new Intent(this, FinishPage.class);
        startActivity(intent);
    }


}