package com.mrforey.calculator;

import android.annotation.SuppressLint;
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

public class ShtrobleniePage extends AppCompatActivity {

    private EditText shtroblenie_plainText1, shtroblenie_plainText2,shtroblenie_plainText3,shtroblenie_plainText4,shtroblenie_plainText5;
    private Button button_calculate;
    SharedPreferences sPref;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shtroblenie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        shtroblenie_plainText1 = findViewById(R.id.text_field40);
        shtroblenie_plainText2 = findViewById(R.id.text_field41);
        shtroblenie_plainText3 = findViewById(R.id.text_field42);
        shtroblenie_plainText4 = findViewById(R.id.text_field43);
        shtroblenie_plainText5 = findViewById(R.id.text_field44);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(shtroblenie_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(shtroblenie_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(shtroblenie_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(shtroblenie_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(shtroblenie_plainText5.getText().toString(),0);

                    float res = (number1 * 200) + (number2 * 300) + (number3 * 700) + (number4 * 1000) + (number5 * 70);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(ShtrobleniePage.this);
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
        edit.putString("save_text40", shtroblenie_plainText1.getText().toString());
        edit.putString("save_text41", shtroblenie_plainText2.getText().toString());
        edit.putString("save_text42", shtroblenie_plainText3.getText().toString());
        edit.putString("save_text43", shtroblenie_plainText4.getText().toString());
        edit.putString("save_text44", shtroblenie_plainText5.getText().toString());
        edit.apply();
        Toast.makeText(ShtrobleniePage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}