
package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.aaa);
        b2=(Button) findViewById(R.id.bbb);
        b3=(Button) findViewById(R.id.ccc);
        b4=(Button) findViewById(R.id.ddd);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), add_activtiy.class);
                startActivity(ob);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), sub_activity.class);
                startActivity(ob);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), mul_activity.class);
                startActivity(ob);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), div_activity.class);
                startActivity(ob);
            }
        });
    }
}
