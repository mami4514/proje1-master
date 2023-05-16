package com.example.projeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import com.example.projeodevi.databinding.ActivityMainBinding;
import com.example.projeodevi.databinding.ActivitySignupPageBinding;

public class SignupPage extends AppCompatActivity {

    private ActivitySignupPageBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivitySignupPageBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonPasswordVisible1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tasarim.editTextPassword1.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                    tasarim.editTextPassword1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    tasarim.buttonPasswordVisible1.setBackgroundResource(R.drawable.baseline_visibility_off_24);
                } else {
                    tasarim.editTextPassword1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    tasarim.buttonPasswordVisible1.setBackgroundResource(R.drawable.baseline_visibility_24);
                }
            }
        });

        tasarim.buttonPasswordVisible2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tasarim.editTextPassword2.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                    tasarim.editTextPassword2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    tasarim.buttonPasswordVisible2.setBackgroundResource(R.drawable.baseline_visibility_off_24);
                } else {
                    tasarim.editTextPassword2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    tasarim.buttonPasswordVisible2.setBackgroundResource(R.drawable.baseline_visibility_24);
                }
            }
        });

        tasarim.textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}