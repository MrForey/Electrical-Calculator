package com.mrforey.calculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ZazemleniePage extends AppCompatActivity {

    private EditText zazemlenie_plainText1, zazemlenie_plainText2,zazemlenie_plainText3;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zazemlenie_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        zazemlenie_plainText1 = findViewById(R.id.text_field161);
        zazemlenie_plainText2 = findViewById(R.id.text_field162);
        zazemlenie_plainText3 = findViewById(R.id.text_field163);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(zazemlenie_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(zazemlenie_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(zazemlenie_plainText3.getText().toString(),0);

                    float res = (number1 * 10000) + (number2 * 15000) + (number3 * 2000);

                    resultAlert("Итого: " + res + " руб.");
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            private float parseFloatOrDefault(String text, float defaultValue) {
                try {
                    return Float.parseFloat(text);
                } catch (NumberFormatException e) {
                    return defaultValue;
                }
            }

        });
    }

    private void resultAlert(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ZazemleniePage.this);
        builder.setTitle("Успешный расчёт!")
                .setMessage(text)
                .setCancelable(true)
                .setPositiveButton("ОК!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void goToMenu(View v)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void saveText(View v){
        sPref = getSharedPreferences("my_settings", MODE_PRIVATE);
        SharedPreferences.Editor edit = sPref.edit();
        edit.putString("save_text161", zazemlenie_plainText1.getText().toString());
        edit.putString("save_text162", zazemlenie_plainText2.getText().toString());
        edit.putString("save_text163", zazemlenie_plainText3.getText().toString());
        edit.apply();
        Toast.makeText(ZazemleniePage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}