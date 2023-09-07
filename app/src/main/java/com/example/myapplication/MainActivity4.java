package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    TextView cpytxt1;
    TextView cpytxt2;

    ImageButton cpybtn1;
    ImageButton cpybtn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cpybtn1 = findViewById(R.id.imageButton3);
        cpytxt1 = findViewById(R.id.textView5);

        cpybtn2 = findViewById(R.id.imageButton2);


        cpybtn2.setOnClickListener(view -> {
            String output = cpytxt1.getText().toString();
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);


        });


    }
    public void btl(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); finish();
    }

}