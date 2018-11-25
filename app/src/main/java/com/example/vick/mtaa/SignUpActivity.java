package com.example.vick.mtaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    Button btnsignnew;
    EditText etUsername;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsignnew = findViewById(R.id.signupbtn);
        etUsername = findViewById(R.id.etUsername);
        name = etUsername.getText().toString();


    }

    public void addUser(View view) {
        if (name.equals(" ")) {
            Toast.makeText(this, "Please fill in the fields", Toast.LENGTH_LONG).show();
        } else
            Toast.makeText(this, "Added " + name + "to users", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
