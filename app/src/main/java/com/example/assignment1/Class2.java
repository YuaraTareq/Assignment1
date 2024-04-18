package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Class2 extends AppCompatActivity {
    private Spinner spinner;
    private Button btBack;
    private Button btSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.class2_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });


        btBack = findViewById(R.id.btBack);
        btSubmit = findViewById(R.id.btSubmit);
        spinner = findViewById(R.id.spinner);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit(v);
            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
    }

    public void onSubmit(View view) {
     
        String selectedItem = spinner.getSelectedItem().toString();
        if (selectedItem.equals("English")) {
            Intent intent = new Intent(this, EnglishActivity.class);
            startActivity(intent);
        } else if (selectedItem.equals("Math")) {
            Intent intent = new Intent(this, MathActivity.class);
            startActivity(intent);
        }else if (selectedItem.equals("Science")) {
            Intent intent = new Intent(this, ScienceActivity.class);
            startActivity(intent);
        } else if (selectedItem.equals("Technology")) {
            Intent intent = new Intent(this, TechnologyActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Selected Subject: " + selectedItem, Toast.LENGTH_SHORT).show();
        }
    }
    public void onBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}