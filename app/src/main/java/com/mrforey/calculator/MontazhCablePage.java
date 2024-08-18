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

public class MontazhCablePage extends AppCompatActivity {

    private EditText montcable_plainText1, montcable_plainText2,montcable_plainText3,montcable_plainText4,montcable_plainText5,montcable_plainText6;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_montazh_cable_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        montcable_plainText1 = findViewById(R.id.text_field155);
        montcable_plainText2 = findViewById(R.id.text_field156);
        montcable_plainText3 = findViewById(R.id.text_field157);
        montcable_plainText4 = findViewById(R.id.text_field158);
        montcable_plainText5 = findViewById(R.id.text_field159);
        montcable_plainText6 = findViewById(R.id.text_field160);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(montcable_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(montcable_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(montcable_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(montcable_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(montcable_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(montcable_plainText6.getText().toString(),0);

                    float res = (number1 * 80) + (number2 * 120) + (number3 * 160) + (number4 * 100) + (number5 * 120) + (number6 * 230);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(MontazhCablePage.this);
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
        edit.putString("save_text155", montcable_plainText1.getText().toString());
        edit.putString("save_text156", montcable_plainText2.getText().toString());
        edit.putString("save_text157", montcable_plainText3.getText().toString());
        edit.putString("save_text158", montcable_plainText4.getText().toString());
        edit.putString("save_text159", montcable_plainText5.getText().toString());
        edit.putString("save_text160", montcable_plainText6.getText().toString());
        edit.apply();
        Toast.makeText(MontazhCablePage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}