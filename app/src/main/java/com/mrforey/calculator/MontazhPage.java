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

public class MontazhPage extends AppCompatActivity {

    private EditText montazh_plainText1, montazh_plainText2, montazh_plainText3,montazh_plainText4,montazh_plainText5,
            montazh_plainText6, montazh_plainText7, montazh_plainText8, montazh_plainText9;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_montazh_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        montazh_plainText1 = findViewById(R.id.text_field64);
        montazh_plainText2 = findViewById(R.id.text_field65);
        montazh_plainText3 = findViewById(R.id.text_field66);
        montazh_plainText4 = findViewById(R.id.text_field67);
        montazh_plainText5 = findViewById(R.id.text_field68);
        montazh_plainText6 = findViewById(R.id.text_field69);
        montazh_plainText7 = findViewById(R.id.text_field70);
        montazh_plainText8 = findViewById(R.id.text_field71);
        montazh_plainText9 = findViewById(R.id.text_field72);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(montazh_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(montazh_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(montazh_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(montazh_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(montazh_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(montazh_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(montazh_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(montazh_plainText8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(montazh_plainText9.getText().toString(),0);

                    float res = (number1 * 150) + (number2 * 250) + (number3 * 100) + (number4 * 100) + (number5 * 400) + (number6 * 500) + (number7 * 600)
                            + (number8 * 750)+ (number9 * 50);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(MontazhPage.this);
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
        edit.putString("save_text64", montazh_plainText1.getText().toString());
        edit.putString("save_text65", montazh_plainText2.getText().toString());
        edit.putString("save_text66", montazh_plainText3.getText().toString());
        edit.putString("save_text67", montazh_plainText4.getText().toString());
        edit.putString("save_text68", montazh_plainText5.getText().toString());
        edit.putString("save_text69", montazh_plainText6.getText().toString());
        edit.putString("save_text70", montazh_plainText7.getText().toString());
        edit.putString("save_text71", montazh_plainText8.getText().toString());
        edit.putString("save_text72", montazh_plainText9.getText().toString());
        edit.apply();
        Toast.makeText(MontazhPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}