package com.kadenslater95.wristlist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.inputText);
        Button button = findViewById(R.id.addButton);
        TextView output = findViewById(R.id.outputText);

        button.setOnClickListener(v -> {
            String text = input.getText().toString();
            output.setText(text);
        });
    }
}