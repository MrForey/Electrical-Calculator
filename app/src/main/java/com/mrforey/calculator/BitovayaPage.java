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

public class BitovayaPage extends AppCompatActivity {

    private EditText bitovaya_plainText1, bitovaya_plainText2,bitovaya_plainText3,bitovaya_plainText4,bitovaya_plainText5,bitovaya_plainText6,
            bitovaya_plainText7,bitovaya_plainText8,bitovaya_plainText9,bitovaya_plainText10,bitovaya_plainText11;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitovaya_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bitovaya_plainText1 = findViewById(R.id.text_field122);
        bitovaya_plainText2 = findViewById(R.id.text_field123);
        bitovaya_plainText3 = findViewById(R.id.text_field124);
        bitovaya_plainText4 = findViewById(R.id.text_field125);
        bitovaya_plainText5 = findViewById(R.id.text_field126);
        bitovaya_plainText6 = findViewById(R.id.text_field127);
        bitovaya_plainText7 = findViewById(R.id.text_field128);
        bitovaya_plainText8 = findViewById(R.id.text_field129);
        bitovaya_plainText9 = findViewById(R.id.text_field130);
        bitovaya_plainText10 = findViewById(R.id.text_field131);
        bitovaya_plainText11 = findViewById(R.id.text_field132);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(bitovaya_plainText1.getText().toString(), 0);
                    float number2 = parseFloatOrDefault(bitovaya_plainText2.getText().toString(), 0);
                    float number3 = parseFloatOrDefault(bitovaya_plainText3.getText().toString(), 0);
                    float number4 = parseFloatOrDefault(bitovaya_plainText4.getText().toString(), 0);
                    float number5 = parseFloatOrDefault(bitovaya_plainText5.getText().toString(), 0);
                    float number6 = parseFloatOrDefault(bitovaya_plainText6.getText().toString(), 0);
                    float number7 = parseFloatOrDefault(bitovaya_plainText7.getText().toString(), 0);
                    float number8 = parseFloatOrDefault(bitovaya_plainText8.getText().toString(), 0);
                    float number9 = parseFloatOrDefault(bitovaya_plainText9.getText().toString(), 0);
                    float number10 = parseFloatOrDefault(bitovaya_plainText10.getText().toString(), 0);
                    float number11 = parseFloatOrDefault(bitovaya_plainText11.getText().toString(), 0);

                    float res = (number1 * 600) + (number2 * 1000) + (number3 * 1000) + (number4 * 350) + (number5 * 500) + (number6 * 200) + (number7 * 1800)
                            + (number8 * 1000)+ (number9 * 1000) + (number10 * 1000) + (number11 * 500);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(BitovayaPage.this);
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
        edit.putString("save_text122", bitovaya_plainText1.getText().toString());
        edit.putString("save_text123", bitovaya_plainText2.getText().toString());
        edit.putString("save_text124", bitovaya_plainText3.getText().toString());
        edit.putString("save_text125", bitovaya_plainText4.getText().toString());
        edit.putString("save_text126", bitovaya_plainText5.getText().toString());
        edit.putString("save_text127", bitovaya_plainText6.getText().toString());
        edit.putString("save_text128", bitovaya_plainText7.getText().toString());
        edit.putString("save_text129", bitovaya_plainText8.getText().toString());
        edit.putString("save_text130", bitovaya_plainText9.getText().toString());
        edit.putString("save_text131", bitovaya_plainText10.getText().toString());
        edit.putString("save_text132", bitovaya_plainText11.getText().toString());
        edit.apply();
        Toast.makeText(BitovayaPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}