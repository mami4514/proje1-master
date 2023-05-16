package com.example.projeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import com.example.projeodevi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.passwordVisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tasarim.editTextPassword.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())){
                    tasarim.editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    tasarim.passwordVisibility.setBackgroundResource(R.drawable.baseline_visibility_off_24);
                }else {
                    tasarim.editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    tasarim.passwordVisibility.setBackgroundResource(R.drawable.baseline_visibility_24);
                }
            }
        });

        tasarim.textViewKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupPage.class);
                startActivity(intent);
            }
        });
    }
}