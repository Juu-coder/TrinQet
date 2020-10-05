package com.nazycodes.trinqet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvSignIn, tvForgotPassword;
    private Button btnLogin;
    private CheckBox cbRememberMe;
    private RelativeLayout btnLoginWithGoogle, btnLoginWithFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvSignIn = findViewById(R.id.tvSignin);
        tvForgotPassword = findViewById(R.id.txt_forgot_password);
        btnLogin = findViewById(R.id.btn_login);
        btnLoginWithGoogle = findViewById(R.id.btnLoginWithGoogle);
        btnLoginWithFacebook = findViewById(R.id.btnLoginWithFacebook);
        cbRememberMe = findViewById(R.id.checkBox);

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
            }
        });

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}