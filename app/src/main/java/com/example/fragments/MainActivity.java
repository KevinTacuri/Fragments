package com.example.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonRed;
    private Button buttonOrange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.button_red);
        buttonOrange = findViewById(R.id.button_orange);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loadFragment(new RedFragment());
            }
        });

        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new OrangeFragment());
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}