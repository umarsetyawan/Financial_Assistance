package com.example.financialassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                if (name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
                {
                    Toast.makeText(MainActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}