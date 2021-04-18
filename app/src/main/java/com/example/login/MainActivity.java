package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPass);


        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validation()) {
                    Intent intent = new Intent(MainActivity.this, Activity1.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Error UserName or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validation() {
        String userName = user.getText().toString();
        String password = pass.getText().toString();
        return userName.equals("bijaygc11@gmail.com") && password.equals("1234");
    }

}